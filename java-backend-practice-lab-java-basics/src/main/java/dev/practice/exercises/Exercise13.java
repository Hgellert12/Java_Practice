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
        return itemPrice*quantity;
    }

    public static double calculateDiscount(double subtotal, double discountPercentage) {
        // TODO: Calculate discount amount.
        return subtotal*discountPercentage/100;
    }

    public static double calculateTax(double taxableAmount, double taxRate) {
        // TODO: Calculate tax amount.
        return taxableAmount*taxRate;
    }

    public static double calculateTotal(double itemPrice, int quantity, double taxRate, double discountPercentage, double shippingFee) {
        // TODO: Use the smaller methods to calculate the final total.
        if (!hasValidOrderInputs(itemPrice, quantity, taxRate, discountPercentage, shippingFee)) {
            throw new IllegalArgumentException("Invalid order inputs");
        }
        double subtotal = calculateSubtotal(itemPrice, quantity);
        double discount = calculateDiscount(subtotal, discountPercentage);
        double taxableAmount = subtotal-discount;
        double tax = calculateTax(taxableAmount,taxRate);
        return taxableAmount+tax+shippingFee;
    }

    public static boolean hasValidOrderInputs(double itemPrice, int quantity, double taxRate, double discountPercentage, double shippingFee) {
        // TODO Extra challenge: Validate negative prices, quantities, tax rates, discounts, and shipping.
        if (itemPrice<0 || quantity<0 || taxRate<0 || discountPercentage<0 || shippingFee<0)
        {
            return false;
        }
        return true;
    }
}

