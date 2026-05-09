package dev.practice.utils;

public final class TextUtils {

    private TextUtils() {
        // Utility class: do not instantiate.
    }

    public static boolean isBlank(String text) {
        // TODO Exercise 14: return true when text is null, empty, or only spaces.
        if (text == null || text.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static String capitalize(String text) {
        // TODO Exercise 14: capitalize the first letter safely.
        if(!isBlank(text))
        {
            return text.substring(0,1).toUpperCase() + text.substring(1);
        }
        return text;
    }

    public static String reverse(String text) {
        // TODO Exercise 14: reverse the text safely.
        if (!isBlank(text)) {
            StringBuilder sb = new StringBuilder();
            for (int i = text.length()-1; i>=0; i--)
            {
                sb.append(text.charAt(i));
            }
            return String.valueOf(sb);
        }
        return text;
    }

    public static boolean containsIgnoreCase(String text, String searchTerm) {
        // TODO Exercise 14: check whether text contains searchTerm ignoring case.
        text = text.toLowerCase();
        searchTerm = searchTerm.toLowerCase();
        if (text.contains(searchTerm))
        {
            return true;
        }
        return false;
    }

    public static int countOccurrences(String text, char character) {
        // TODO Exercise 14: count how many times character appears in text.
        int output = 0;
        for(int i = 0; i<text.length(); i++)
        {
            if (text.charAt(i)== character)
            {
                output++;
            }
        }
        return output;
    }
}
