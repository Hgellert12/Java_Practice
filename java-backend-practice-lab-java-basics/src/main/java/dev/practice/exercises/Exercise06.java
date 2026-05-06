package dev.practice.exercises;

public class Exercise06 {

    public static void run() {
        printMultiplicationTable(5, 10);
    }

    public static void printMultiplicationTable(int number, int maxMultiplier) {
        // TODO: Use a loop to print the multiplication table.
        for (int i = 1; i <= maxMultiplier; i++)
        {
            System.out.println(number*i);
        }
    }
}
