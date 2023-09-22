package org.example;

import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);
    public String getString(String prompt) {
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

    public String getString(String prompt, String s1, String s2) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = getString(prompt);
            if (!response.equalsIgnoreCase(s1) && !response.equalsIgnoreCase(s2)) {
                System.out.println("Error! This entry must be '" + s1 + "' or '" + s2 + "'. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return response;
    }

}
