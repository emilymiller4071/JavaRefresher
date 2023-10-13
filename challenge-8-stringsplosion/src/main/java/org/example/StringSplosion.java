package org.example;

public class StringSplosion {
    public static void main(String[] args) {

        String str1 = stringSplosion("Code");
        System.out.println(str1);

        String str2 = stringSplosion("Bootcamp");
        System.out.println(str2);

        String str3 = stringSplosion("sugar");
        System.out.println(str3);

    }
    public static String stringSplosion(String str) {
        StringBuilder newString = new StringBuilder();

        for (int currentChar = 0; currentChar < str.length(); currentChar++) {
            newString.append(str.substring(0, currentChar + 1));
        }
        return newString.toString();
    }
}