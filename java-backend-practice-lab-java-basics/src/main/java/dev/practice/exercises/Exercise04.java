package dev.practice.exercises;

public class Exercise04 {

    public static void run() {
        int[] ages = {-1, 0, 12, 13, 18, 65};

        for (int age : ages) {
            System.out.println(age + " -> " + getAgeCategory(age));
        }
    }

    public static boolean isValidAge(int age) {
        // TODO: Return true when age is valid.
        if (age<0)
        {
            return false;
        }
            return true;
    }

    public static String getAgeCategory(int age) {
        // TODO: Return Child, Teenager, Adult, Senior, or Invalid age.
        if (!isValidAge(age))
        {
            return "Invalid age";
        }
        else if (age<13)
        {
            return "Child";
        }
        else if (age<18)
        {
            return "Teenager";
        }
        else if (age<65)
        {
            return "Adult";
        }
        else if (age>=65)
        {
            return "Senior";
        }
        return "";
    }
}
