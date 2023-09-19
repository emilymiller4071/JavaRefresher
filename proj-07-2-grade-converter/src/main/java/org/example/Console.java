package org.example;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);
    public static void displayWelcome() {
        System.out.println("Welcome to the Grade Converter!");
        System.out.println();
    }

    public static String getString(String prompt) {
        boolean isValid = false;
        String response = "";

        while(!isValid) {
            System.out.print(prompt);
            response = scanner.nextLine();
            if (response.equals("")){
                System.out.println("Error! This entry is required. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }

        return response;
    }

    public static String getString(String prompt, String yes, String no) {
        boolean isValid = false;
        String response = "";

        while (!isValid) {
            response = getString(prompt);

            if (response.equals("")) {
                System.out.println("Error! This is a required entry. Try again.");
                System.out.println();
            } else if (!response.equals(yes) && !response.equals(no)) {
                System.out.println("Error! Must enter '" + yes + "' or '" + no + "'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
                System.out.println();
            }
        }
    }

    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value >= min && value <= max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " + min + " and less than " + max + ".");
                System.out.println();
            }
        }
    }
}
