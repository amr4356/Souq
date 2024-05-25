package project;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        FoodOrder foodOrder = new FoodOrder();
        Payment payment = new Payment();
        DeliveryManagement deliveryManagement = new DeliveryManagement();
        UserInterface userInterface = new UserInterface(menu, foodOrder, payment, deliveryManagement);

        userInterface.manageAndDisplayMenu();
        userInterface.placeOrder();
        userInterface.checkout();
        userInterface.deliveryScheduling();

    }
}