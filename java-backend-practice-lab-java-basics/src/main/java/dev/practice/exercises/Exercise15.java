package dev.practice.exercises;

import java.time.LocalDateTime;

public class Exercise15 {

    public static void run() {
        String firstName = "John";
        String lastName = "Smith";
        int age = 25;
        double accountBalance = 245.75;
        boolean active = true;
        String password = "Password1";
        String bio = "Java backend student practicing clean code.";

        printUserAccountReport(firstName, lastName, age, accountBalance, active, password, bio);
    }

    public static void printUserAccountReport(
            String firstName,
            String lastName,
            int age,
            double accountBalance,
            boolean active,
            String password,
            String bio
    ) {
        // TODO: Combine logic from previous exercises.
        // Suggested reused logic:
        // Exercise01.formatFullName
        // Exercise04.getAgeCategory
        // Exercise05.getPasswordStrength
        // Exercise08 text analysis helper methods
        // Exercise12.generateUsername
        Exercise01.formatFullName(firstName, lastName);
        System.out.println(Exercise04.getAgeCategory(age));
        System.out.println(Exercise05.getPasswordStrength(password));
        Exercise08.analyzeText(bio);
        System.out.println(Exercise12.generateUsername(firstName, lastName, LocalDateTime.now().getYear()-age));
    }
}
