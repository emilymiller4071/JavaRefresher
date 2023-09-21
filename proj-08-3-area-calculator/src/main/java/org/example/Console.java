package org.example;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);



    public static String getString(String prompt) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("Error! This is a required entry. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static String getString(String prompt, String s1, String s2) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(prompt);
            if (!response.equalsIgnoreCase(s1) && !response.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static String getString(String prompt, String circle, String square, String rectangle) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(prompt);
            if (!response.equalsIgnoreCase(circle) && !response.equalsIgnoreCase(square) && !response.equalsIgnoreCase(rectangle)) {
                System.out.println("Error! Entry must be '" + circle + "' or '" + square + "' or '" + rectangle + "'. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static double getDouble(String prompt) {
        double response = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (scanner.equals("")) {
                System.out.println("Error! This is a required entry. Try again.\n");
            } else if (scanner.hasNextDouble()) {
                response = scanner.nextDouble();
                System.out.println();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.\n");
            }
            scanner.nextLine();
        }
        return response;
    }

}
