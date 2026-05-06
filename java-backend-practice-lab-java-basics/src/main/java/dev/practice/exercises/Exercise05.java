package dev.practice.exercises;

public class Exercise05 {

    public static void run() {
        String[] passwords = {"abc", "password", "Password", "Password1", "P@ssword1"};

        for (String password : passwords) {
            System.out.println(password + " -> " + getPasswordStrength(password));
        }
    }

    public static String getPasswordStrength(String password) {
        // TODO: Return Weak, Medium, or Strong.
        return "";
    }

    public static boolean containsNumber(String text) {
        // TODO: Return true if text contains at least one digit.
        return false;
    }

    public static boolean containsUppercaseLetter(String text) {
        // TODO: Return true if text contains at least one uppercase letter.
        return false;
    }

    public static boolean containsSpecialCharacter(String text) {
        // TODO Extra challenge: Return true if text contains a special character.
        return false;
    }
}
