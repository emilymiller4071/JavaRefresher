package org.example;

import java.util.Scanner;

public class FactorialCalculatorApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Factorial Calculator");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";

        while (wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer that's greater than 0 and less than 10: ");
            int enteredInteger = scanner.nextInt();
            long factorial = 1;

            for(int currentNumber = 1; currentNumber <= enteredInteger; currentNumber++) {
                factorial *= currentNumber;
            }
            System.out.println("The factorial of " + enteredInteger + " is " + factorial + "."); ;
            System.out.println();
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
    }
}