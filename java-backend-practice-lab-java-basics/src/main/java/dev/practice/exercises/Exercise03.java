package dev.practice.exercises;

public class Exercise03 {

    public static void run() {
        int[] numbers = {8, 7, 0, -4, 15};

        for (int number : numbers) {
            printEvenOddResult(number);
        }
    }

    public static boolean isEven(int number) {
        // TODO: Return true if the number is even.
        switch (number%2){
            case 0: return true;
            case 1: return false;
            default: return false;

        }


    }

    public static void printEvenOddResult(int number) {
        // TODO: Print whether the number is even or odd.
        // Extra challenge: also print positive, negative, or zero.
        System.out.println(isEven(number) ? "Even" : "Odd");
    }
}
