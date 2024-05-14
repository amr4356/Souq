package restaurant;

import java.util.ArrayList;

public class DeliveryManagement {
    public static void processDelivery(ArrayList<MenuItem> items) {
        Menu menu = new Menu();
        System.out.println("\nScheduling delivery...");
        // Implement delivery scheduling
        System.out.println("Delivery scheduled successfully for the following items:");

        int i;
        for (i = 0; i < menu.getMenuSize(); i++) {
            int counter = 0;
            MenuItem t = menu.getMenuItem(i);
            for (MenuItem item : items) {
                if (item.getName().equals(t.getName())) {
                    counter++;
                }
            }
            if (counter != 0) {
                System.out.println("- " + counter + " " + t.getName());
            }

        }

    }

}