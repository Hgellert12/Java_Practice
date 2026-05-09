package dev.practice.exercises;

import dev.practice.models.OrderItem;
import dev.practice.models.SimpleOrder;

public class Exercise22 {

    public static void run() {
        SimpleOrder order = new SimpleOrder("ORD-1001");

        order.addItem(new OrderItem("Keyboard", 100.0, 1));
        order.addItem(new OrderItem("Mouse", 40.0, 2));

        order.printSummary();
    }
}
