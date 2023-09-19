package org.example;

public class Game {

    private int randomNumber = 0;
    private int guessedNumber = 0;
    private int howManyGuesses = 0;

    public void createRandomNumber() {
        randomNumber = (int) (Math.random() * 100) +1;
        howManyGuesses = 0;
    }
    public void printWelcome() {
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }
    public void printGuessTheNumber() {
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");
        System.out.println();
    }

    public void printCorrectGuessMessage(int howManyGuesses) {
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

    public void needToGuessAgain(int number, int guessedNumber) {
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

    public void makeGuess(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public boolean isCorrect() {
        return guessedNumber == randomNumber;
    }
}
