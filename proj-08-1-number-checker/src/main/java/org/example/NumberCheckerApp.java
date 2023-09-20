package org.example;

public class NumberCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Odd/Even Checker!");
        System.out.println();

        MyConsole myConsole = new MyConsole();

        String wantsToContinue = "y";
        while(wantsToContinue.equalsIgnoreCase("y")) {
            int enteredNumber = myConsole.getInt("Enter an integer: ");

            if ((enteredNumber % 2) == 0) {
                System.out.println("The number " + enteredNumber + " is even.");
                System.out.println();
            } else {
                System.out.println("The number " + enteredNumber + " is odd.");
                System.out.println();
            }

            wantsToContinue = myConsole.getString("Continue? (y/n): ");
        }
        System.out.println("Goodbye!");
    }
}