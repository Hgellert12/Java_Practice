package dev.practice.exercises;

import dev.practice.models.Invoice;

public class Exercise23 {

    public static void run() {
        Invoice invoice = new Invoice("INV-1001", "John Smith", 300.0, 0.20);

        invoice.printInvoice();
        invoice.markPaid();
        invoice.printInvoice();
    }
}
