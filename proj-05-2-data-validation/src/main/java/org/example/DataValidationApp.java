package org.example;

import java.util.Scanner;

public class DataValidationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0.0;
        double max = 1000000.0;

        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            double length = getDoubleInRange(scanner, "Enter length: ", min, max);
            double width = getDoubleInRange(scanner, "Enter width: ", min, max);
            double area = calculateArea(length, width);
            double perimeter = calculatePerimeter(length, width);

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();

            wantsToContinue = getValidString(scanner, "Continue? (y/n): ");
        }
    }
// make sure a double type is entered
    public static double getValidDouble(Scanner scanner, String prompt) {
        boolean isValid = false;
        double decimal = 0;
        while (!isValid){
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                decimal = scanner.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            scanner.nextLine();
        }
        return decimal;
    }

    //make sure the double is in range
    public static double getDoubleInRange(Scanner scanner, String prompt, double min, double max) {
        double decimal = 0;
        boolean isValid = false;
        while(!isValid) {
            decimal = getValidDouble(scanner, prompt);
            if (decimal <= min) {
                System.out.println("Error! Number must be greater than " + min);
            } else if (decimal >= max) {
                System.out.println("Error! Number must be less than " + max);
            } else {
                isValid = true;
            }
        }
        return decimal;
    }

    // Validate y/n answer
    public static String getValidString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String wantsToContinue = scanner.nextLine();
            if (wantsToContinue.equalsIgnoreCase("y") || wantsToContinue.equalsIgnoreCase("n")) {
                return wantsToContinue;
            } else if (wantsToContinue.isBlank()){
                System.out.println("Error! This entry is required. Try Again.");
            } else {
                System.out.println("Error! Entry must be a 'y' or 'n'. Try again!");
            }
        }
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
