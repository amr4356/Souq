package restaurant;

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
}
