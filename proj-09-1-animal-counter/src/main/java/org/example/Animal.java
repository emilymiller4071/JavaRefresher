package org.example;

public abstract class Animal implements Countable {

    protected int counter;

    public Animal() {
        counter = 1;
    }
    @Override
    public void incrementCount() {
        counter++;
    }

    @Override
    public void resetCount() {
        counter = 1;
    }

    @Override
    public int getCount() {
        return counter;
    }

    @Override
    public String getCountString() {
        return counter + " animal";
    }
}
