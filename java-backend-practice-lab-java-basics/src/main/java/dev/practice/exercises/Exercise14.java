package dev.practice.exercises;

import dev.practice.utils.TextUtils;

public class Exercise14 {

    public static void run() {
        String text = "java";

        System.out.println("isBlank: " + TextUtils.isBlank(text));
        System.out.println("capitalize: " + TextUtils.capitalize(text));
        System.out.println("reverse: " + TextUtils.reverse(text));
        System.out.println("containsIgnoreCase: " + TextUtils.containsIgnoreCase(text, "AV"));
        System.out.println("countOccurrences: " + TextUtils.countOccurrences(text, 'a'));
    }
}
