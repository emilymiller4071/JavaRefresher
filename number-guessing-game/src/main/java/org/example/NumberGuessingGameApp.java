package org.example;

import java.util.Scanner;

public class NumberGuessingGameApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        displayWelcomeMessage();
        int randomNumber = getRandomNumber();

        int guess = 0;
        int diff = randomNumber - guess;
        int guessCount = 0;

        while (guess != randomNumber) {
            guess = getIntWithinRange(scanner, "Enter number: ", 0, 101);
        }

        // -- TRY AGAIN BLOCK

            // GAME BLOCK
            // start a game
            // pick a random #


            // + repeat until guess = random
            // prompt user for guess => getIntWithinRange()
            // evaluate guess
            // if guess matches random - winner
            // if wrong guess - display message
        if (diff == 0) {
            System.out.println(getWinMessage(guessCount));
        } else {
            getWrongGuessMessage(diff);
        }

        //prompt "try again?"
        // -if choice y/n - valid
        // -if choice y repeat block, if n end program
        // -if


        System.out.println("Goodbye! Thanks for playing!");
    }
    // METHODS

        // display welcome method
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the number guessing game!");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    private static int getInt(Scanner scanner, String prompt) {
        int i = 0;
        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                isValid = true;
            } else {
                System.out.println("Error! Please enter a whole number.");
            }
            scanner.nextLine();
        }
        return i;
    }

    private static int getIntWithinRange(Scanner scanner, String prompt, int min, int max) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            number = getInt(scanner, prompt);
            if (number <= min) {
                System.out.println("Error! Number must be greater than " + min + "!");
                System.out.println();
            } else if (number > max) {
                System.out.println("Error! Number must be less than " + max + "!");
                System.out.println();
            }
        }

        return number;
    }

    private static int getWrongGuessMessage(int diff) {
        int randomNumber;
        String msg = "";
        if (diff > randomNumber) {
            if (diff > 10) {
                System.out.println("Way too high! Guess again.");
                System.out.println();
            } else {
                System.out.println("Too high! Guess again.");
                System.out.println();
            }
        } else {
            if (diff < -10) {
                System.out.println("Way too low! Guess again.");
                System.out.println();
            } else {
                System.out.println("Too low! Guess again.");
                System.out.println();
            }
    }

    private static String getWinMessage(int guessCount) {
        String msg = "You got it in " +guessCount+ " tries.\n";

        if (guessCount <= 3) {
            msg +="Great work! You are a mathematical wizard.";
        } else if (guessCount <= 7) {
            msg += "Not too bad! You've got some potential.";
        } else {
            msg += "What took you so long? Maybe you should take some lessons!";
        }
        return msg;
    }
}