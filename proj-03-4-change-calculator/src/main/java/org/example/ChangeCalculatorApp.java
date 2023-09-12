package org.example;

import java.util.Scanner;
public class ChangeCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";

        System.out.println("Welcome to the Change Calculator");
        System.out.println();

        while(wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter number of cents (0-99): ");
            int cents = scanner.nextInt();
            System.out.println();

            int numOfQuarters = (int) (cents/25);
            int numOfDimes = (int) (cents - numOfQuarters * 25) / 10;
            int numOfNickels = (int) (cents -(numOfQuarters * 25) - (numOfDimes * 10)) / 5;
            int numOfPennies = (int) (cents - (numOfQuarters * 25) - (numOfDimes * 10) - (numOfNickels * 5));

            System.out.println("Quarters: " + numOfQuarters);
            System.out.println("Dimes: " + numOfDimes);
            System.out.println("Nickels: " + numOfNickels);
            System.out.println("Pennies: " + numOfPennies);
            System.out.println();

            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}