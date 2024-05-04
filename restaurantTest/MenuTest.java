package restaurantTest;

import org.junit.*;

import restaurant.Menu;
import restaurant.MenuItem;

import java.util.ArrayList;

public class MenuTest {

    private Menu menu;

    @Before
    public void setUp() {
        menu = new Menu();
    }

    @Test
    public void testGetMenuItems() {
        ArrayList<MenuItem> menuItems = menu.getMenuItems();
        Assert.assertNotNull(menuItems);
        Assert.assertEquals(6, menuItems.size());
    }

    @Test
    public void testGetMenuItem() {
        MenuItem menuItem = menu.getMenuItem(5);
        Assert.assertNotNull(menuItem);
        Assert.assertEquals("Coffee", menuItem.getName());
        Assert.assertEquals(2.5, menuItem.getPrice(), 0.01);
    }
}
