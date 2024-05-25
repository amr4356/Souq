package project;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class FoodOrderTest {

    private FoodOrder foodOrder;
    private MenuItem menuItem1;
    private MenuItem menuItem2;

    @Before
    public void setUp() {
        foodOrder = new FoodOrder();
        menuItem1 = new MenuItem("Pizza", 10.0);
        menuItem2 = new MenuItem("Burger", 8.0);
    }

    @Test
    public void testAddItemToOrder() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);

        ArrayList<MenuItem> orderItems = foodOrder.getOrderItems();
        Assert.assertEquals(2, orderItems.size());
        Assert.assertTrue(orderItems.contains(menuItem1));
        Assert.assertTrue(orderItems.contains(menuItem2));
    }

    @Test
    public void testGetTotalPrice() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);

        Assert.assertEquals(18.0, foodOrder.getTotalPrice(), 0.01);
    }

    @Test
    public void testRemoveItemFromOrder() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);
        foodOrder.removeItemFromOrder(menuItem1);
        assertEquals(1, foodOrder.getOrderSize());
        assertEquals(8.0, foodOrder.getTotalPrice());
    }

    @Test
    public void testClearOrder() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);
        foodOrder.clearOrder();
        assertEquals(0, foodOrder.getOrderSize());
        assertEquals(0.0, foodOrder.getTotalPrice());
    }

    @Test
    public void testGetItemQuantity() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);
        assertEquals(1, foodOrder.getItemQuantity(menuItem1));
    }

    @Test
    public void testGetOrderSize() {
        foodOrder.addItemToOrder(menuItem1);
        foodOrder.addItemToOrder(menuItem2);
        assertEquals(2, foodOrder.getOrderSize());
    }

}