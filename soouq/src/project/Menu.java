package project;

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

    // Method to add a new menu item
    public void addMenuItem(String itemName, double price) {
        menuItems.add(new MenuItem(itemName, price));
    }

    // Method to remove a menu item
    public void removeMenuItem(int index) {
        if (index >= 0 && index < menuItems.size()) {
            menuItems.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Method to get the number of menu items
    public int getMenuSize() {
        return menuItems.size();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuItem getMenuItem(int index) {
        return menuItems.get(index);
    }
}