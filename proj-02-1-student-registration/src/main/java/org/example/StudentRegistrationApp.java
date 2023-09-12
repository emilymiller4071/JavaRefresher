package org.example;

import java.util.Scanner;

public class StudentRegistrationApp {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Student Registration Form");
            System.out.println();

            System.out.print("Enter first name: ");
            String firstName = scanner.next();

            System.out.print("Enter last name: ");
            String lastName = scanner.next();

            System.out.print("Enter year of birth: ");
            int yearOfBirth = scanner.nextInt();

            System.out.println();
            System.out.println("Welcome " + firstName + " " + lastName + "!");
            System.out.println("Your registration is complete.");
            System.out.println("Your temporary password is: " + firstName + "*" + yearOfBirth);
            System.out.println();
            System.out.println("Goodbye!");

        }
    }