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
        if(score>100 | score<0)
        {
            return false;
        }
        return true;
    }

    public static String getGrade(int score) {
        // TODO: Return A, B, C, D, F, or Invalid score.
        if(!isValidScore(score))
        {
            return "Invalid score";
        }
        if(score<50)
        {
            return "F";
        }
        else if(score<60)
        {
            return "D";
        }
        else if(score<70)
        {
            return "C";
        }
        else if(score<80)
        {
            return "B";
        }
        else
        {
            return "A";
        }
    }
}

