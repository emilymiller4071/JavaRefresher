package org.example;

import java.util.Scanner;

public class TableOfNumbersApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";
        String header = "Number  Square  Cube";

        System.out.println("Welcome to the Squares and Cubes table");
        System.out.println();


        // Continue while user enters "y"
        while(wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println();

            System.out.println(header);
            //print underline
            for(int i = 0; i < header.length(); i++) {
                if(header.charAt(i) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
            //print number columns 7 digits wide max, left aligned, new line at the end
            for(int currentNumber = 1; currentNumber <= number; currentNumber++) {
                int squared = currentNumber * currentNumber;
                int cubed = currentNumber * currentNumber * currentNumber;
                System.out.printf("%-7d %-7d %-7d%n", currentNumber, squared, cubed);
            }
            System.out.println();
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");

    }
}