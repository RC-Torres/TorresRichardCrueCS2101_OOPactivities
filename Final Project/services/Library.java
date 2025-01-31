package services;

import models.Item;
import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items = new ArrayList<>();

    // Adding item to library collection
    public void addItem(Item item) {
        items.add(item);
    }

    // Searching for an item by title
    public Item searchByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Display all available items
    public void displayAllItems() {
        for (Item item : items) {
            item.displayDetails();
        }
    }

    // Borrow an item
    public boolean borrowItem(int id) {
        for (Item item : items) {
            if (item.getId() == id && item.isAvailable()) {
                item.setAvailability(false);
                System.out.println(item.getTitle() + " has been borrowed.");
                return true;
            }
        }
        System.out.println("Item is not available or doesn't exist.");
        return false;
    }

    // Return an item
    public void returnItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setAvailability(true);
                System.out.println(item.getTitle() + " has been returned.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
