
import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> orderItems;
    private double totalPrice;

    public FoodOrder() {
        orderItems = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addItemToOrder(MenuItem item) {
        orderItems.add(item);
        totalPrice += item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<MenuItem> getOrderItems() {
        return orderItems;
    }

    public void removeItemFromOrder(MenuItem item) {
        if (orderItems.contains(item)) {
            orderItems.remove(item);
            totalPrice -= item.getPrice();
        } else {
            System.out.println("Item not found in the order!");
        }
    }

    public void clearOrder() {
        orderItems.clear();
        totalPrice = 0.0;
    }

    public int getOrderSize() {
        return orderItems.size();
    }

    public int getItemQuantity(MenuItem item) {
        int quantity = 0;
        for (MenuItem orderItem : orderItems) {
            if (orderItem.equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }
}
