package org.example;

import java.util.Scanner;

public class DiceRollerApp {
    public static void main(String[] args) {

        System.out.println("Dice Roller");
        System.out.println();
        String wantsToRoll = "y";

        while (wantsToRoll.equalsIgnoreCase("y")){
            int dieOne = rollDice();
            int dieTwo = rollDice();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Roll the dice? (y/n): ");
            wantsToRoll = scanner.next();
            System.out.println();

            System.out.println("Die 1: " + dieOne);
            System.out.println("Die 2: " + dieTwo);
            System.out.println("Total: " + (dieOne + dieTwo));

            if(dieOne == 1 && dieTwo == 1) {
                System.out.println("Snake eyes!");
            } else if (dieOne == 6 && dieTwo == 6) {
                System.out.println("Box cars!");
            }
            System.out.println();
        }
    }
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}