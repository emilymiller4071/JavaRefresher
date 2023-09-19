package org.example;

import java.util.Scanner;

public class DiceRollerApp {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        displayWelcome();

        // ask if player wants to roll

        // create new dice objects

        // roll the dice

        // get the value of the dice

        // print the outcome of the roll

        // ask if the player wants to roll again

    }

    public static void displayWelcome() {
        System.out.println("Welcome to the Dice Roller!");
        System.out.println();
    }

    public static String getString(String prompt) {
        String response = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.println(prompt);
            response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("Error! This is a required entry. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static String getWantsToContinue(String prompt, String yes, String no) {
        String response = "";
        boolean isValid = false;

        while (!isValid) {
            response = getString(prompt);
            if (response.trim().isEmpty()) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else if (!response.equalsIgnoreCase(yes) && !response.equalsIgnoreCase(no)) {
                System.out.println("Error! Must enter '" + yes + "' or '" + no + ". Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }
}