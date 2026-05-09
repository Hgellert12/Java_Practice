package dev.practice.exercises;

public class    Exercise09 {

    public static void run() {
        System.out.println(calculate(10, 5, '+'));
        System.out.println(calculate(10, 5, '-'));
        System.out.println(calculate(10, 5, '*'));
        System.out.println(calculate(10, 5, '/'));
        System.out.println(calculate(10, 0, '/'));
        System.out.println(calculate(10, 5, '%'));
    }

    public static double add(double firstNumber, double secondNumber) {
        // TODO: Add two numbers.
        return firstNumber+secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        // TODO: Subtract two numbers.
        return firstNumber-secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        // TODO: Multiply two numbers.
        return firstNumber*secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        // TODO: Divide two numbers. Think about division by zero.

        return firstNumber/secondNumber;
    }

    public static String calculate(double firstNumber, double secondNumber, char operator) {
        // TODO: Use the operator to choose the correct calculation.
        switch (operator)
        {
            case '+':
                return String.valueOf(add(firstNumber,secondNumber));
            case '-':
                return String.valueOf(subtract(firstNumber,secondNumber));
            case '*':
                return String.valueOf(multiply(firstNumber,secondNumber));
            case '/':
                if (secondNumber!=0)
                {
                    return String.valueOf(divide(firstNumber,secondNumber));
                }
                else
                {
                    return "Error: Division by zero";
                }
            default:
                return "Error: Invalid operator";
        }

    }
}
