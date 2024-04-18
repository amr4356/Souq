package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Menu menu;
    private FoodOrder foodOrder;
    private Payment payment;
    private DeliveryMangement deliveryManagement;

    public UserInterface(Menu menu, FoodOrder foodOrder, Payment payment, DeliveryMangement deliveryManagement) {
        this.scanner = new Scanner(System.in);
        this.menu = menu;
        this.foodOrder = foodOrder;
        this.payment = payment;
        this.deliveryManagement = deliveryManagement;
    }

    public void displayMenu() {
        System.out.println("Welcome to our restaurant\nMenu:");
        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            System.out
                    .println((i + 1) + ". " + menu.getMenuItem(i).getName() + " - $" + menu.getMenuItem(i).getPrice());
        }
    }

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

}
