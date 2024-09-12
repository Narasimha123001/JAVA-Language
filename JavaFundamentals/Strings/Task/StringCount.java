package com.JavaFundamentals.Strings.Task;

public class StringCount {
    public static void main(String[] args) {

        String sentence = "this is hwllo";

        int wordCount = countWord(sentence);
        System.out.println("no of word :" +wordCount);
    }

    private static int countWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        char[] words1 = sentence.toCharArray();
        System.out.println("NO OF CHARACTERS IN  STRING "+words1.length);
        return words.length;

    }
}
