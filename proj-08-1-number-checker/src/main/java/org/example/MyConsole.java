package org.example;

import java.util.Scanner;

public class MyConsole extends Console{

    Scanner scanner;
    public MyConsole() {
        super();
    }
    @Override
    public String getString(String prompt) {
        String response = "";
        boolean isValid = false;
        while (!isValid) {
            response = super.getString(prompt);
            if (response.equals("")) {
                System.out.println("Error! This is a required entry. Try again.");
                System.out.println();
            } else if (!response.equals("y") && !response.equals("n")) {
                System.out.println("Error! This entry must be 'y' or 'n'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return response;
    }

}
