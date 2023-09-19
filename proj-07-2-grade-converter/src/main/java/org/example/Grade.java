package org.example;

public class Grade {

    int number;

    public Grade() {
        number = 0;
    }

    public Grade(int number) {
        this.number = number;
    }

    public void setNumber(int numberGrade) {
        number = numberGrade;
    }

    public int getNumber() {
        return number;
    }

    public String getLetter() {
        String letterGrade;
        if (number >= 88) {
            letterGrade = "A";
        } else if (number >= 80) {
            letterGrade = "B";
        } else if (number >= 68) {
            letterGrade = "C";
        } else if (number >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }

}
