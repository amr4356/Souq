package restaurantTest;

import org.junit.*;

import restaurant.DeliveryManagement;
import restaurant.MenuItem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class DeliveryManagementTest {

    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testProcessDelivery_MultipleItems() {
        // Arrange
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Pizza", 9.99));
        items.add(new MenuItem("Burger", 5.99));
        items.add(new MenuItem("Salad", 4.99));
        // Add more items as needed

        // Act
        DeliveryManagement.processDelivery(items);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Scheduling delivery..."));
        Assert.assertTrue(actualOutput.contains("Delivery scheduled successfully for the following items:"));
        Assert.assertTrue(actualOutput.contains("- 1 Pizza"));
        Assert.assertTrue(actualOutput.contains("- 1 Burger"));
        Assert.assertTrue(actualOutput.contains("- 1 Salad"));
        // Add more assertions as needed

    }

    @Test
    public void testProcessDelivery_SingleItem() {
        // Arrange
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Water", 1.99));

        // Act
        DeliveryManagement.processDelivery(items);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Scheduling delivery..."));
        Assert.assertTrue(actualOutput.contains("Delivery scheduled successfully for the following items:"));
        Assert.assertTrue(actualOutput.contains("- 1 Water"));

    }

    @Test
    public void testProcessDelivery_NoItems() {
        // Arrange
        ArrayList<MenuItem> items = new ArrayList<>();

        // Act
        DeliveryManagement.processDelivery(items);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Scheduling delivery..."));
        Assert.assertTrue(actualOutput.contains("Delivery scheduled successfully for the following items:"));
        Assert.assertTrue(!actualOutput.contains("- 1 Pizza"));
        Assert.assertTrue(!actualOutput.contains("- 1 Burger"));
        Assert.assertTrue(!actualOutput.contains("- 1 Salad"));
        Assert.assertTrue(!actualOutput.contains("- 1 Water"));

    }

}