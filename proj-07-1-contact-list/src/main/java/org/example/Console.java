package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayWelcome() {
        System.out.println("Welcome to the Contact List application!");
        System.out.println();
    }
    public static String getString(Scanner scanner, String prompt) {
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

    public static String getValidPhone(Scanner scanner, String prompt) {
        boolean isValid = false;
        String response = "";
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";

        while (!isValid) {
            response = getString(scanner, prompt);

            if (response.matches(phonePattern)) {
                isValid = true;
            } else {
                System.out.println("Error! Please enter a phone number in the format ###-###-####. Try again.");
                System.out.println();
            }
        }

        return response;
    }

    public static String getValidEmail(Scanner scanner, String prompt) {
        String response = "";
        boolean isValid = false;
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";

        while (!isValid){
            response = getString(scanner, prompt);

            if (response.matches(emailPattern)) {
                isValid = true;
            } else {
                System.out.println("Error! Please enter a valid email address (ex: somebody@somewhere.com). Try again.");
                System.out.println();
            }
        }

        return response;
    }
    public static String getContinueChoice(Scanner scanner, String prompt, String yes, String no) {
        String wantsToContinue = "";

        boolean isValid = false;
        while(!isValid) {
            yes = "y";
            no = "n";
            wantsToContinue = getString(scanner, prompt);
            if (wantsToContinue.trim().isEmpty()) {
                System.out.println("Error! This is a required entry! Try again.");
                System.out.println();
            } else if (!wantsToContinue.equalsIgnoreCase(yes) && !wantsToContinue.equalsIgnoreCase(no)) {
                System.out.println("Error! Must enter '" + yes + "' or '" + no + "'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return wantsToContinue;
    }

//    public static boolean validatePhoneNumberFormat(String phoneNumber) {
//        // Define the regex pattern for the phone number format ###-###-####
//        String pattern = "\\d{3}-\\d{3}-\\d{4}";
//
//        // Compile the pattern into a regex object
//        Pattern regexPattern = Pattern.compile(pattern);
//
//        // Match the input phone number against the pattern
//        Matcher matcher = regexPattern.matcher(phoneNumber);
//
//        // Return true if the input matches the pattern, false otherwise
//        return matcher.matches();
//    }


}
