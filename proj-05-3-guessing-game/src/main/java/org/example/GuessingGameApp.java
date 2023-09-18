package org.example;

import java.util.Scanner;

public class GuessingGameApp {
    public static void main(String[] args) {

        printWelcome();

        Scanner scanner = new Scanner(System.in);

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            int number = getRandomNumber();
            int guessedNumber = 0;
            int howManyGuesses = 0;

            printGuessTheNumber();

            while (number != guessedNumber) {
                guessedNumber = getIntInRange(scanner, "Enter number: ", 0, 101);

                if (guessedNumber == number) {
                    printCorrectGuessMessage(howManyGuesses);
                } else {
                    needToGuessAgain(number, guessedNumber);
                }
                howManyGuesses++;
            }

            wantsToContinue = getWantsToContinue(scanner, "Try again? (y/n): ", "y", "n" );
            System.out.println();
        }
        System.out.println("Bye! - Come back soon!");
    }



    public static void printWelcome() {
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }

    public static void printGuessTheNumber() {
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");
        System.out.println();
    }

    // user guesses correctly
    public static void printCorrectGuessMessage(int howManyGuesses) {
        System.out.println("You got it in " + howManyGuesses);
        if (howManyGuesses <= 3) {
            System.out.println("Great work! You are a mathematical wizard!");
            System.out.println();
        } else if (howManyGuesses > 3 && howManyGuesses <= 7) {
            System.out.println("Not too bad! You've got some potential.");
            System.out.println();
        } else {
            System.out.println("What took you so long? Maybe you should take some lessons.");
            System.out.println();
        }
    }

    // user needs to guess again
    public static void needToGuessAgain(int number, int guessedNumber) {
        int difference = guessedNumber - number;
        if (guessedNumber > number) {
            if (difference > 10) {
                System.out.println("Way too high! Guess again.");
                System.out.println();
            } else {
                System.out.println("Too high! Guess again.");
                System.out.println();
            }
        } else {
            if (difference < -10) {
                System.out.println("Way too low! Guess again.");
                System.out.println();
            } else {
                System.out.println("Too low! Guess again.");
                System.out.println();
            }
        }
    }

    // generate a random number in correct range
    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
// make sure input is an integer
    public static int getValidInteger(Scanner scanner, String prompt) {
        boolean isValid = false;
        int value = 0;
        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Entry must be a number. Try Again.");
                System.out.println();
            }
            scanner.nextLine();
        }
        return value;
    }
// make sure int is within range
    public static int getIntInRange(Scanner scanner, String prompt, int min, int max) {
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            number = getValidInteger(scanner, prompt);
            if (number < min) {
                System.out.println("Error! Number must be larger than " + min);
                System.out.println();
            } else if (number > max) {
                System.out.println("Error! Number must be less than " + max);
                System.out.println();
            } else {
                isValid = true;
            }
        }
    return number;
    }

    // make sure the answer is a string
    public static String getString(Scanner scanner, String prompt) {
        String response = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    // collect the response from the user to continue
    public static String getWantsToContinue(Scanner scanner, String prompt, String yes, String no) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(scanner, prompt);
            if (response.trim().isEmpty()) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else if (!response.equalsIgnoreCase(yes) && !response.equalsIgnoreCase(no)) {
                System.out.println("Error! Must enter '" + yes + "' or '" + no + "'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

}