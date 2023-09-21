package org.example;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    @Override
    public String toString() {
        return "The area of the Square you entered is " + getArea() + "\n";
    }
}
