package org.example;

import java.util.Scanner;

public class GreatestCommonDivisorApp {
    public static void main(String[] args) {

        System.out.println("Greatest Common Divisor Finder");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter first number: ");
            int x = scanner.nextInt();
            System.out.print("Enter second number: ");
            int y = scanner.nextInt();
            int holder = 0;

            while(x != 0) {
                while(y >= x){
                    y -= x;
                }
                holder = x;
                x = y;
                y = holder;
            }
            System.out.println("Greatest common divisor: " + y);
            System.out.println();
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}