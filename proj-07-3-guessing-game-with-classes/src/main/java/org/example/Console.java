package org.example;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static int getValidInteger(String prompt) {
        boolean isValid = false;
        int value = 0;
        while (!isValid) {
            System.out.print(prompt);

            if (scanner.equals("")) {
                System.out.println("Error! This is a required entry. Try again.");
                System.out.println();
            }else if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try Again.");
                System.out.println();
            }
            scanner.nextLine();
        }
        return value;
    }

    public static int getIntInRange(String prompt, int min, int max) {
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            number = getValidInteger(prompt);
            if (number < min) {
                System.out.println("Error! Number must be larger than " + min);
                System.out.println();
            } else if (number > max) {
                System.out.println("Error! Number must be less than " + max);
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return number;
    }

    public static String getString(String prompt) {
        String response = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static String getWantsToContinue(String prompt, String yes, String no) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(prompt);
            if (response.trim().isEmpty()) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else if (!response.equalsIgnoreCase(yes) && !response.equalsIgnoreCase(no)) {
                System.out.println("Error! Must enter '" + yes + "' or '" + no + "'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }
}
