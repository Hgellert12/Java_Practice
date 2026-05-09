package dev.practice.exercises;

import dev.practice.models.UserProfile;

public class Exercise16 {

    public static void run() {
        UserProfile user = new UserProfile("John", "Smith", "john.smith@example.com", 25);

        System.out.println(user.getFullName());
        System.out.println("Adult: " + user.isAdult());
        user.printSummary();
    }
}
