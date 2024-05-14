// This class represents the user interface for interacting with the restaurant system.
package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Menu menu; // Menu object containing food items
    private FoodOrder foodOrder; // FoodOrder object to manage the customer's order
    private Payment payment; // Payment object to handle payment processing
    private DeliveryManagement deliveryManagement; // DeliveryManagement object for scheduling deliveries

    // Constructor to initialize UserInterface with required objects
    public UserInterface(Menu menu, FoodOrder foodOrder, Payment payment, DeliveryManagement deliveryManagement) {
        this.scanner = new Scanner(System.in);
        this.menu = menu;
        this.foodOrder = foodOrder;
        this.payment = payment;
        this.deliveryManagement = deliveryManagement;
    }

    // Display the menu items available
    int pas = 12345678; // this is the password

    public void manageAndDisplayMenu() {
        String itemName = "";
        double itemPrice = 0;
        int num = 0;
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Are you the owner of the restaurant(yes/no)?");
        String s = scanner.nextLine();
        while (!s.equals("yes") && !s.equals("no")) {
            System.out.println();
            System.out.println("Are you the owner of the restaurant(yes/no)?");
            s = scanner.nextLine();
        }

        if (s.equals("yes")) {
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Enter the password:");
            int ps = scanner.nextInt();
            if (ps == pas) {
                System.out.println("----------------------------------------");
                System.out.println();
                System.out.println("This is the current menu of the restaurant:");
                for (int i = 0; i < menu.getMenuSize(); i++) {
                    System.out
                            .println((i + 1) + ". " + menu.getMenuItem(i).getName() + " - $"
                                    + menu.getMenuItem(i).getPrice());
                }
                System.out.println();
                System.out.println("----------------------------------------");

                System.out.println("Do you want to add or remove items(yes/no)? ");
                String sr = scanner.next();
                while (!sr.equals("yes") && !sr.equals("no")) {
                    System.out.println("Do you want to add or remove items(yes/no)? ");
                    sr = scanner.next();
                }
                if (sr.equals("yes")) {
                    System.out.println("----------------------------------------");
                    System.out.println();
                    System.out.println("which one do you want (add or remove)?");
                    String sr1 = scanner.next();
                    while (!sr1.equals("add") && !sr1.equals("remove")) {
                        System.out.println("which one do you want (add or remove)?");
                        sr1 = scanner.next();
                    }

                    if (sr1.equals("add")) {
                        System.out.println("----------------------------------------");
                        System.out.println();
                        System.out.println("how many items do you want to add?");
                        num = scanner.nextInt();
                        for (int i = 0; i < num; i++) {
                            System.out.print("Enter the name of item" + (i + 1) + ":");
                            itemName = scanner.next();
                            System.out.print("Enter the price of item" + (i + 1) + ":");
                            itemPrice = scanner.nextDouble();
                            menu.addMenuItem(itemName, itemPrice);
                        }
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println("You have been redirected to Menu Page");
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println();
                        System.out.println("how many items do you want to remove?");
                        num = scanner.nextInt();
                        for (int i = 0; i < num; i++) {
                            System.out.print("Enter the index of item" + (i + 1) + ":");
                            int index = scanner.nextInt();

                            menu.removeMenuItem(index);

                        }
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println("You have been redirected to Menu Page");
                        System.out.println("----------------------------------------");
                    }

                } else {
                    System.out.println();
                    System.out.println("----------------------------------------");
                    System.out.println("You have been redirected to Menu Page");
                    System.out.println("----------------------------------------");
                }

            } else {
                System.out.println();
                System.out.println("----------------------------------------");
                System.out.println("invalid password");
                System.out.println("You have been redirected to Menu Page");
                System.out.println("----------------------------------------");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");

        System.out.println("Welcome to our restaurant\nMenu:");
        for (int i = 0; i < menu.getMenuSize(); i++) {
            System.out

                    .println((i + 1) + ". " + menu.getMenuItem(i).getName() + " - $"
                            + menu.getMenuItem(i).getPrice());
        }
        System.out.println("----------------------------------------");

    }
    
    // Allow the user to place an order by selecting menu items
    public void placeOrder() {
        System.out.print("\n(Enter the number of the item you'd like to order, or type 'done' when finished): ");
        String input = scanner.nextLine();

        while (!input.equals("done")) {
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
                    || input.equals("6")) {
                int itemNumber = Integer.parseInt(input);
                MenuItem item = menu.getMenuItem(itemNumber - 1);
                String itemName = item.getName();
                double itemPrice = item.getPrice();
                foodOrder.addItemToOrder(item);
                System.out.println("\nItem " + itemNumber + " " + itemName + " with $" + itemPrice
                        + " price has been added to the cart");
                System.out.println("The total Price of your current cart= $" + foodOrder.getTotalPrice());
            } else {
                System.out.println(
                        "\nInvalid number you have to choose between(1 and " + menu.getMenuItems().size() + ")");
                System.out.println("The total Price of your current cart= $" + foodOrder.getTotalPrice());
            }
            System.out
                    .print("\n(Enter the number of the next item you'd like to order, or type 'done' when finished): ");
            input = scanner.nextLine();
        }
    } 
    
    // Proceed to checkout and handle payment processing
    public void checkout() {
        double totalPrice = foodOrder.getTotalPrice();
        System.out.println("\nYour order total price is: $" + totalPrice);

        if (totalPrice > 0) {
            System.out.println("Select a payment method:");
            System.out.println("1. Credit card");
            System.out.println("2. Debit card");
            System.out.println("3. Benefitpay");
            String paymentMethod;
            do {
                System.out.print("Select a number between (1 to 3): ");
                paymentMethod = scanner.next();
                if (paymentMethod.equals("1") || paymentMethod.equals("2") || paymentMethod.equals("3")) {
                    int paymentNumber = Integer.parseInt(paymentMethod);
                    payment.processPayment(totalPrice, paymentNumber);
                    break;
                } else {
                    System.out.println("invalid payment method");
                }

            } while (!(paymentMethod.equals("1") || paymentMethod.equals("2") || paymentMethod.equals("3")));

        } else {
            System.out.println("sorry, you don't have any item to pay for");
        }
    }

    // Schedule delivery if there are items in the order
    public void deliveryScheduling() {
        double totalPrice = foodOrder.getTotalPrice();
        if (totalPrice != 0) {
            deliveryManagement.processDelivery(foodOrder.getOrderItems());
        } else {
            System.out.println("sorry, you don't have any item to schedule a delivery for it");
        }
    }
}