package org.example;

public class GuessingGameApp {
    public static void main(String[] args) {

        Game game = new Game();
        game.printWelcome();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            game.createRandomNumber();
            game.printGuessTheNumber();

            // game goes until number is guessed
            while (!game.isCorrect()) {
                int guessedNumber = Console.getIntInRange("Enter number: ", 0, 100);
                game.makeGuess(guessedNumber);

                // check if the guessedNumber is correct, or need to guess again
                if (game.isCorrect()) {
                    game.printCorrectGuessMessage();
                } else {
                    game.needToGuessAgain();
                }
            }

            wantsToContinue = Console.getWantsToContinue("Continue? (y/n): ", "y", "n");
        }
        System.out.println("Goodbye!");
    }
}