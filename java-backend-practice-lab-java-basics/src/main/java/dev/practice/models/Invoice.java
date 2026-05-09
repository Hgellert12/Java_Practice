package dev.practice.models;

public class Invoice {
    // TODO: Add private fields: invoiceNumber, customerName, subtotal, taxRate, paid.

    public Invoice(String invoiceNumber, String customerName, double subtotal, double taxRate) {
        // TODO: Assign fields. paid should start as false.
    }

    public double calculateTax() {
        // TODO: Return tax amount.
        return 0.0;
    }

    public double calculateTotal() {
        // TODO: Return subtotal plus tax.
        return 0.0;
    }

    public void markPaid() {
        // TODO: Mark invoice as paid.
    }

    public void printInvoice() {
        // TODO: Print invoice details.
    }
}
