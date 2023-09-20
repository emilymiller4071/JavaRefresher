package org.example;

import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console(){
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int getInt(String prompt) {
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            scanner.nextLine();
        }
        return value;
    }

}
