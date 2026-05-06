package dev.practice.exercises;

public class Exercise02 {

    public static void run() {
        String productName = "Keyboard";
        double basePrice = 100.0;
        double taxRate = 0.20;

        printPriceSummary(productName, basePrice, taxRate);
    }

    public static double calculateFinalPrice(double basePrice, double taxRate) {
        // TODO: Calculate final price after tax.
        return basePrice + (basePrice*taxRate);
    }

    public static void printPriceSummary(String productName, double basePrice, double taxRate) {
        // TODO: Print product name, base price, tax rate, and final price.
        System.out.println("Product: " + productName + "\nPrice: " + calculateFinalPrice(basePrice,taxRate));
    }
}
