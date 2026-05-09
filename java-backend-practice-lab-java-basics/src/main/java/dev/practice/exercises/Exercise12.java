package dev.practice.exercises;

public class Exercise12 {

    public static void run() {
        System.out.println(generateUsername(" John ", " Smith ", 1998));
    }

    public static String generateUsername(String firstName, String lastName, int birthYear) {
        // TODO: Generate a username like jsmith98.
        // Extra challenge: handle missing or empty names safely.
        if(!firstName.isEmpty() && !lastName.isEmpty())
        {
            StringBuilder sb = new StringBuilder();
            sb.append(firstName.trim().toLowerCase().charAt(0));
            sb.append(lastName.trim().toLowerCase());
            sb.append(String.valueOf(birthYear).substring(2));
            return String.valueOf(sb);
        }
        return "Invalid input";
    }
}
