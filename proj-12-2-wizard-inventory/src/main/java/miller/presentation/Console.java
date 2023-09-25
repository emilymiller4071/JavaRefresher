package miller.presentation;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public Console() {
    }

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
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 +"'. Try again.\n");
            } else {
                isValid = true;
            }
        }
        return response;
    }

    public static double getDouble(String prompt) {
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
    public static double getDouble(String prompt, double min, double max) {
        double decimal = 0;
        boolean isValid = false;
        while(!isValid) {
            decimal = getDouble(prompt);
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

    public static int getInt(String prompt) {
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

    public static int getInt(String prompt, int min, int max) {
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            number = getInt(prompt);
            if (number < min && number > max) {
                System.out.println("Error! Invalid number. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return number;
    }
}
