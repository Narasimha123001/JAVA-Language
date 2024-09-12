package com.JavaFundamentals.Strings.Task;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        // Sample Strings
        String str1 = "listen";
        String str2 = "silent";

        // Call the method to check if they are anagrams
        boolean result = areAnagrams(str1, str2);
        System.out.println("Both are anagrams: " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check the length of both strings
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
