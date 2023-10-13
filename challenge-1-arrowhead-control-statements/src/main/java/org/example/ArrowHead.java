package org.example;

import java.util.Scanner;

public class ArrowHead {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a whole number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            char arrow = '>';

            for (int i = 1; i <= number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(arrow);
                }
                System.out.println();
            }

            for (int i = (number -1); i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(arrow);
                }
                System.out.println();
            }

        }


    }
}