package org.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";

        System.out.println("Tip Calculator");
        System.out.println();

        while (wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Cost of meal: ");
            BigDecimal costOfMeal = new BigDecimal(scanner.next());
            System.out.println();

            NumberFormat percentFormat = NumberFormat.getPercentInstance();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

            for (double percent = 0.15; percent <= 0.25; percent += 0.05) {

                BigDecimal tip = new BigDecimal(Double.toString(percent));
                BigDecimal amount = costOfMeal.multiply(tip);
                BigDecimal total = costOfMeal.add(amount);

                System.out.println(percentFormat.format(percent));
                System.out.println("Tip amount: " + currencyFormat.format(amount));
                System.out.println("Total amount: " + currencyFormat.format(total));
                System.out.println();
            }
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}