package org.example;

public class AnimalCounterApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        countAlligator();
        countSheep();

    }

    public static void count(Countable c, int maxCount) {
        c.resetCount();
        while (c.getCount() <= maxCount) {
            System.out.println(c.getCountString());
            c.incrementCount();
        }
        System.out.println();
    }

    public static void countAlligator() {
        System.out.println("Counting alligators...\n");

        Alligator alligator = new Alligator();
        count(alligator, 3);
        System.out.println();
    }
    public static void countSheep() throws CloneNotSupportedException {
        System.out.println("Counting sheep...\n");
        Sheep blackie = new Sheep();
        blackie.setName("Blackie");
        count(blackie, 2);

        Sheep dolly = null;
        try {
            dolly = (Sheep) blackie.clone();
            dolly.setName("Dolly");
        } catch (CloneNotSupportedException e) {
            System.out.println("An error occurred. Clone cannot be completed.\n");
        }

        count(dolly, 3);

        count(blackie, 1);
       }
    }
