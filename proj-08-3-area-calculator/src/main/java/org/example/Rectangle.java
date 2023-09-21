package org.example;

public class Rectangle extends Square{

    private double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return getWidth() * height;
    }

    @Override
    public String toString() {
        return "The area of the Rectangle you entered is " + getArea() + "\n";
    }

}
