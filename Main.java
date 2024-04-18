package restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        FoodOrder foodOrder = new FoodOrder();
        Payment payment = new Payment();
        DeliveryMangement deliveryManagement = new DeliveryMangement();
        UserInterface userInterface = new UserInterface(menu, foodOrder, payment, deliveryManagement);

        userInterface.displayMenu();
        userInterface.placeOrder();
        userInterface.checkout();
        userInterface.deliveryScheduling();

    }
}