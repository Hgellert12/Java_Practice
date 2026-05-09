package dev.practice.exercises;

import dev.practice.models.BankAccount;

public class Exercise18 {

    public static void run() {
        BankAccount account = new BankAccount("John Smith", "ACC-1001", 250.0);

        account.deposit(100.0);
        account.withdraw(50.0);
        account.printSummary();
    }
}
