package org.example;

import java.util.Scanner;
public class TemperatureConverterApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";

        System.out.println("Welcome to the Temperature Converter");

        while(wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter degrees in Fahrenheit: ");
            double fahr = scanner.nextDouble();
            double celsius = (fahr - 32) * 5 / 9;
            String formattedCelsius = String.format("%.2f", celsius);
            System.out.println("Degrees in Celsius: " + formattedCelsius);
            System.out.println();
            System.out.print("Continue: (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");

    }
}