package dev.practice.exercises;

public class Exercise08 {

    public static void run() {
        analyzeText("Java is Fun");
    }

    public static void analyzeText(String text) {
        // TODO: Print character count, word count, vowel count, uppercase count, and lowercase count.
        System.out.println("Text: " + text);
        System.out.println("Character count: " + text.length());
        System.out.println("Word count: " + countWords(text));
        System.out.println("Vowel count: " + countVowels(text));
        System.out.println("Uppercase count: " + countUppercaseLetters(text));
        System.out.println("Lowercase count: " + countLowercaseLetters(text));
    }

    public static int countVowels(String text) {
        // TODO: Count vowels.
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;
            }
        }
        return count;
    }


    public static int countUppercaseLetters(String text) {
        // TODO: Count uppercase letters.
        String upperCaseText = text.toUpperCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == upperCaseText.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static int countLowercaseLetters(String text) {
        // TODO: Count lowercase letters.
        String lowerCaseText = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lowerCaseText.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String text) {
        // TODO: Count words while ignoring extra spaces.
        int wordCount = 0;
        for (int i = 0; i<text.length(); i++)
        {
            if (text.charAt(i) != ' ' && (i == 0 || text.charAt(i-1) == ' '))
            {
                wordCount++;
            }
        }
        return wordCount;
    }
}
