package dev.practice.exercises;

public class Exercise11 {

    public static void run() {
        int[] scores = {-1, 0, 59, 60, 70, 80, 89, 90, 100, 101};

        for (int score : scores) {
            System.out.println(score + " -> " + getGrade(score));
        }
    }

    public static boolean isValidScore(int score) {
        // TODO: Return true when score is between 0 and 100.
        return false;
    }

    public static String getGrade(int score) {
        // TODO: Return A, B, C, D, F, or Invalid score.
        return "";
    }
}
