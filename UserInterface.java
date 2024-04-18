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

}
