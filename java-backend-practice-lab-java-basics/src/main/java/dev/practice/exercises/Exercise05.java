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
        int strength = 0;
        if (containsNumber(password)) {
            strength++;
        }
        if (containsUppercaseLetter(password)) {
            strength++;
        }
        if (containsSpecialCharacter(password)) {
            strength++;
        }
        switch (strength){
        case 0: return "weak";

        case 1: return "weak";

        case 2: return "medium";

        case 3: return "strong";


        }
        return "";
    }

    public static boolean containsNumber(String text) {
        // TODO: Return true if text contains at least one digit.
        if (text.matches(".*\\d.*")) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean containsUppercaseLetter(String text) {
        // TODO: Return true if text contains at least one uppercase letter.
        if (text!=text.toLowerCase()) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean containsSpecialCharacter(String text) {
        // TODO Extra challenge: Return true if text contains a special character.
        if (text.matches(".*\\p{Punct}.*")) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
