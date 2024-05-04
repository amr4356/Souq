package restaurantTest;

import org.junit.*;

import restaurant.MenuItem;

public class MenuItemTest {
    private MenuItem menuItem;

    @Before
    public void setUp() {
        menuItem = new MenuItem("Pizza", 10.99);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Pizza", menuItem.getName());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(10.99, menuItem.getPrice(), 0.01);
    }
}
