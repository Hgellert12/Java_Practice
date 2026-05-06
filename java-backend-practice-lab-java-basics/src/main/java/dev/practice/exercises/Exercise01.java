package dev.practice.exercises;

public class Exercise01 {

    public static void run() {
        String firstName = " John ";
        String lastName = " Smith ";
        int age = 25;

        printGreeting(firstName, lastName, age);
    }

    public static String formatFullName(String firstName, String lastName) {
        // TODO: Trim extra spaces and return the full name.
        StringBuilder st = new StringBuilder();
        st.append(firstName.trim()+" "+lastName.trim());
        System.out.println(st);
        return st.toString();
    }

    public static void printGreeting(String firstName, String lastName, int age) {
        // TODO: Print the formatted greeting.
        formatFullName(firstName,lastName);
        System.out.println("Hello, " + formatFullName(firstName, lastName) +"! You are " + age + " years old! Welcome to my project!");
    }
}
