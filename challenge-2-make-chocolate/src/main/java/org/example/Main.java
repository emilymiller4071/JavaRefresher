package org.example;

public class Main {
    public static void main(String[] args) {

        int test1 = makeChocolate(4, 1, 9);
        System.out.println(test1);

        int test2 = makeChocolate(4, 1, 10);
        System.out.println(test2);

        int test3 = makeChocolate(4, 1, 7);
        System.out.println(test3);
    }
    public static int makeChocolate(int small, int big, int goal) {
        int bigBarsToUse = goal / 5;

        if (big >= bigBarsToUse) {
            big = bigBarsToUse;
        }
        int spaceLeft = goal - (big * 5);

        if (small >= spaceLeft) {
            return spaceLeft;
        }
            return -1;
    }
}