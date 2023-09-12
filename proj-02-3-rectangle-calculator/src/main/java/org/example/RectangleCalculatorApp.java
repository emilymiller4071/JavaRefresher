package org.example;

import java.util.Scanner;
public class RectangleCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";

        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        while (wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            double area = length * width;
            double perimeter = 2 * width + 2 * length;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }

}