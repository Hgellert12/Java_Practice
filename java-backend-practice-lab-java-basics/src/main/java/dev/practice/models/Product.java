package dev.practice.models;

public class Product {
    // TODO: Add private fields: name, price, stockQuantity, active.

    public Product(String name, double price, int stockQuantity, boolean active) {
        // TODO: Assign constructor values.
    }

    public boolean isAvailable() {
        // TODO: Return true when active is true and stock quantity is greater than 0.
        return false;
    }

    public void reduceStock(int amount) {
        // TODO: Reduce stock only when amount is valid and enough stock exists.
    }

    public void increaseStock(int amount) {
        // TODO: Increase stock only when amount is positive.
    }

    public void printSummary() {
        // TODO: Print product details.
    }

    // TODO: Add getters and setters.
}
