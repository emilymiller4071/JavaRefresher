package org.example;

public class UserIOTestApp {
    public static void main(String[] args) {
        ConsoleIO console = new ConsoleIO();

        console.println("Welcome to the Console Tester application!\n");

        console.print("Int Test");
        int i = console.getInt("Enter an integer between -100 and 100: ", -100, 100);
        console.println();

        console.println("Double Test");
        double d = console.getDouble("Enter any number between -100 and 100: ", -100, 100);
        console.println();

        console.println("Required String Test");
        String s = console.getString("Enter your email address: ");
        console.println();

        console.println("String Choice Test");
        String choice = console.getString("Select one (x/y): ", "x", "y");
        console.println();
    }
}