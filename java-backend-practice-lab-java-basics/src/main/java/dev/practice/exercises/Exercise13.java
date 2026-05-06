package dev.practice.exercises;

public class Exercise13 {

    public static void run() {
        double itemPrice = 20.0;
        int quantity = 3;
        double taxRate = 0.20;
        double discountPercentage = 10.0;
        double shippingFee = 5.0;

        double total = calculateTotal(itemPrice, quantity, taxRate, discountPercentage, shippingFee);
        System.out.println("Order total: " + total);
    }

    public static double calculateMessyOrderTotal(double itemPrice, int quantity, double taxRate, double discountPercentage, double shippingFee) {
        // TODO: First, intentionally calculate everything in this one method.
        // After it works, refactor the logic into the cleaner methods below.
        return 0.0;
    }

    public static double calculateSubtotal(double itemPrice, int quantity) {
        // TODO: Calculate subtotal.
        return 0.0;
    }

    public static double calculateDiscount(double subtotal, double discountPercentage) {
        // TODO: Calculate discount amount.
        return 0.0;
    }

    public static double calculateTax(double taxableAmount, double taxRate) {
        // TODO: Calculate tax amount.
        return 0.0;
    }

    public static double calculateTotal(double itemPrice, int quantity, double taxRate, double discountPercentage, double shippingFee) {
        // TODO: Use the smaller methods to calculate the final total.
        return 0.0;
    }

    public static boolean hasValidOrderInputs(double itemPrice, int quantity, double taxRate, double discountPercentage, double shippingFee) {
        // TODO Extra challenge: Validate negative prices, quantities, tax rates, discounts, and shipping.
        return false;
    }
}
