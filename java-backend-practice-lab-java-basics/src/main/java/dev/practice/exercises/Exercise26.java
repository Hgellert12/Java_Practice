package dev.practice.exercises;

import dev.practice.models.CartItem;
import dev.practice.models.ShoppingCart;

public class Exercise26 {

    public static void run() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Keyboard", 100.0, 1));
        cart.addItem(new CartItem("Mouse", 40.0, 2));
        cart.removeItemByName("Mouse");

        cart.printSummary();
    }
}
