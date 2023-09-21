package org.example;

import java.security.interfaces.RSAKey;

public class AreaCalculatorApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Area Calculator\n");

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {

            String shapeType = Console.getString("Calculate the area of a circle, square, or rectangle? (c/s/r): ", "c", "s", "r");
            System.out.println();

            Shape shape;
            if (shapeType.equalsIgnoreCase("c")) {
                double radius = Console.getDouble("Enter radius: ");
                shape = new Circle(radius);
                System.out.println(shape.toString());
            } else if (shapeType.equalsIgnoreCase("s")) {
                double width = Console.getDouble("Enter width: ");
                shape = new Square(width);
                System.out.println(shape.toString());
            } else {
                double width = Console.getDouble("Enter width: ");
                double height = Console.getDouble("Enter height: ");
                shape = new Rectangle(width, height);
                System.out.println(shape.toString());
            }
            wantsToContinue = Console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}