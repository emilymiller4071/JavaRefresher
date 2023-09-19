package org.example;

import javax.crypto.spec.PSource;

public class Dice {

    private Die dieOne;
    private Die dieTwo;

    public Dice() {
        Die dieOne = new Die();
        Die dieTwo = new Die();
    }

    public int getDieOne() {
        return dieOne.getFaceValue();
    }

    public int getDieTwo() {
        return dieTwo.getFaceValue();
    }

    public int getSum() {
        return dieOne.getFaceValue() + dieTwo.getFaceValue();
    }

    public void roll() {
        dieOne.roll();
        dieTwo.roll();
    }

    public void printRoll() {
        int total = getSum();
        System.out.println();
        System.out.println("Die 1: " + dieOne.getFaceValue());
        System.out.println("Die 2: " + dieTwo.getFaceValue());
        System.out.println("Total: " + total);

        if (total == 7) {
            System.out.println("Craps!");
        } else if (dieOne.faceValue == 1 && dieTwo.faceValue == 1) {
            System.out.println("Snake eyes!");
        } else if (dieOne.faceValue == 6 && dieTwo.faceValue == 6) {
            System.out.println("Box cars!");
        } else if (dieOne.faceValue == 2 && dieTwo.faceValue == 2) {
            System.out.println("Two little ducks!");
        }
        System.out.println();
    }

}
