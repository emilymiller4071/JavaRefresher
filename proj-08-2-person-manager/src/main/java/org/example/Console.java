package org.example;

import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("Error! This is a required entry. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public String getString(String prompt, String s1, String s2) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(prompt);
            if (!response.equalsIgnoreCase(s1) && !response.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 +"'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static void displayWelcome() {
        System.out.println("Welcome to the Person Manager");
        System.out.println();
    }
}
