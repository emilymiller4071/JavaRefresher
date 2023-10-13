package org.example;

public class StringBits {
    public static void main(String[] args) {
        String str1 = stringBits("Hello");
        System.out.println(str1);

        String str2 = stringBits("Bingo");
        System.out.println(str2);

        String str3 = stringBits("hedgehogs");
        System.out.println(str3);

    }
    public static String stringBits(String str) {
        StringBuilder bit = new StringBuilder();
        for (int charOfStr = 0; charOfStr < str.length(); charOfStr++) {
            if (charOfStr % 2 == 0) {
                bit.append(str.charAt(charOfStr));
            }
        }
        return bit.toString();
    }
}