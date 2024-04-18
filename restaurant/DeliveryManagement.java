package restaurant;

import java.util.ArrayList;

public class DeliveryManagement {
    public void processDelivery(ArrayList<MenuItem> items) {

        System.out.println("\nScheduling delivery...");
        // Implement delivery scheduling
        System.out.println("Delivery scheduled successfully for the following items:");
        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0;
        for (MenuItem item : items) {
            if (item.getName().equals("Pizza")) {
                counter1++;
            }
            if (item.getName().equals("Burger")) {
                counter2++;
            }
            if (item.getName().equals("Salad")) {
                counter3++;
            }
            if (item.getName().equals("Soft drinks")) {
                counter4++;
            }
            if (item.getName().equals("Water")) {
                counter5++;
            }
            if (item.getName().equals("Coffee")) {
                counter6++;
            }

        }
        if (counter1 != 0) {
            System.out.println("- " + counter1 + " Pizza");
        }
        if (counter2 != 0) {
            System.out.println("- " + counter2 + " Burger");
        }
        if (counter3 != 0) {
            System.out.println("- " + counter3 + " Salad");
        }
        if (counter4 != 0) {
            System.out.println("- " + counter4 + " Soft drinks");
        }
        if (counter5 != 0) {
            System.out.println("- " + counter5 + " Water");
        }
        if (counter6 != 0) {
            System.out.println("- " + counter6 + " Coffee");
        }
    }

}
