package dev.practice.exercises;

import dev.practice.models.UserProfile;
import dev.practice.services.UserService;

public class Exercise28 {

    public static void run() {
        UserService service = new UserService();

        UserProfile user = service.createUserProfile("John", "Smith", "john@example.com", 25);
        service.printUser(user);
    }
}
