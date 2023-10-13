package org.example;

import java.util.Scanner;

public class ReplaceChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String newSentence = replaceVowelsWithUnderscores(sentence);
        System.out.println(newSentence);
    }

    public static String replaceVowelsWithUnderscores(String s) {
        String vowels = "aeiouAEIOU";

        StringBuilder newSentence = new StringBuilder();

        for (int charOfS = 0; charOfS < s.length(); charOfS++) {
            char currentChar = s.charAt(charOfS);

            if (vowels.indexOf(currentChar) != -1) {
                newSentence.append("_");
            } else {
                newSentence.append(currentChar);
            }
        }
        return newSentence.toString();
    }
}