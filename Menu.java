package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pizza", 10.0));
        menuItems.add(new MenuItem("Burger", 8.0));
        menuItems.add(new MenuItem("Salad", 6.0));
        menuItems.add(new MenuItem("Soft drinks", 2.0));
        menuItems.add(new MenuItem("Water", 1.0));
        menuItems.add(new MenuItem("Coffee", 2.5));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuItem getMenuItem(int index) {
        return menuItems.get(index);
    }
}