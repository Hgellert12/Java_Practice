package dev.practice.exercises;

import dev.practice.models.Address;
import dev.practice.models.Customer;

public class Exercise21 {

    public static void run() {
        Address address = new Address("Main Street", "Budapest", "1051", "Hungary");
        Customer customer = new Customer("John Smith", "john@example.com", address);

        customer.printCustomerSummary();
    }
}
