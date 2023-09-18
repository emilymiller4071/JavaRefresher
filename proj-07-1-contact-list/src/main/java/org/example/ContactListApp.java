package org.example;

import java.util.Scanner;

import static org.example.Console.displayWelcome;
import static org.example.Console.getContinueChoice;

public class ContactListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayWelcome();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            Contact contact = new Contact();

            String firstName = Console.getString(scanner, "Enter first name: ");
            contact.setFirstName(firstName);

            String lastName = Console.getString(scanner, "Enter last name: ");
            contact.setLastName(lastName);

            String email = Console.getValidEmail(scanner, "Enter email: ");
            contact.setEmail(email);

            String phone = Console.getValidPhone(scanner, "Enter phone: ");
            contact.setPhone(phone);

            System.out.println();
            System.out.println(contact.displayContact());
            System.out.println();

            wantsToContinue = getContinueChoice(scanner, "Continue? (y/n): ", "y", "n");
            System.out.println();

        }
        System.out.println("Goodbye!");
    }


}