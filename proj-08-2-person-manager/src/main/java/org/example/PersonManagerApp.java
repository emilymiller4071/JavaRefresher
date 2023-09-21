package org.example;

public class PersonManagerApp {
    public static void main(String[] args) {

        Console.displayWelcome();

        Console console = new Console();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            String createPerson = console.getString("Create customer or employee? (c/e): ", "c", "e");
            System.out.println();
            String firstName = console.getString("First Name: ");
            String lastName = console.getString("Last Name: ");

            Person person;
            if (createPerson.equalsIgnoreCase("c")) {
                String customerNumber = console.getString("Customer Number: ");
                person = new Customer(firstName, lastName, customerNumber);
                System.out.println();

                System.out.println("You've entered a new Customer: ");
                System.out.println(person.toString());
            } else {
                String ssn = console.getString("SSN: ");
                person = new Employee(firstName, lastName, ssn);
                System.out.println();

                System.out.println("You've entered a new Employee: ");
                System.out.println(person.toString());
                System.out.println();
            }
            wantsToContinue = console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");

    }
}