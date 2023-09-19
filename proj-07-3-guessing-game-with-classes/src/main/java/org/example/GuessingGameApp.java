package org.example;

public class GuessingGameApp {
    public static void main(String[] args) {

        Game game = new Game();
        game.printWelcome();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            game.createRandomNumber();
            game.makeGuess();


        }

    }
}