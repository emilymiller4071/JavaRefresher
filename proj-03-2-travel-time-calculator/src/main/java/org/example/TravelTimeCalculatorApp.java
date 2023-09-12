package org.example;

import java.util.Scanner;
public class TravelTimeCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Travel Time Calculator");
        System.out.println();
        String wantsToContinue = "y";
        String estTravTime = "Estimated travel time";
        String dashLine = new String(new char[estTravTime.length()]).replace('\0','-');

        while(wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter miles: ");
            double miles = scanner.nextDouble();
            System.out.print("Enter miles per hour: ");
            double speed = scanner.nextDouble();
            System.out.println();

            System.out.println(estTravTime);
            System.out.println(dashLine);

            double travelTimeHours = miles/speed;
            int minutes = (int) (travelTimeHours * 60);
            int hours = minutes / 60;
            minutes = minutes % 60;
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println();

            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}