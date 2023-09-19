package org.example;

public class Die {

    int faceValue;

    public Die(){
        faceValue = 0;
    }

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
