package dev.practice.exercises;

import dev.practice.models.Product;

public class Exercise17 {

    public static void run() {
        Product product = new Product("Keyboard", 100.0, 5, true);

        product.printSummary();
        product.reduceStock(2);
        product.printSummary();
    }
}
