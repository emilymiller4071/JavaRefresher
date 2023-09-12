package org.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;
public class InterestCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wantsToContinue = "y";
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMaximumFractionDigits(3);

        System.out.println("Welcome to the Interest Calculator");
        System.out.println();

        while (wantsToContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter loan amount: ");
            BigDecimal loanAmount = scanner.nextBigDecimal();
            System.out.print("Enter interest rate: ");
            BigDecimal intRate = scanner.nextBigDecimal();
            System.out.println();

            BigDecimal interestAmount = loanAmount.multiply(intRate);

            String formattedLoanAmt = currencyFormat.format(loanAmount);
            String formattedIntRate = percentFormat.format(intRate);
            String formattedInterestAmt = currencyFormat.format(interestAmount);

            System.out.println("Loan Amount: " + formattedLoanAmt);
            System.out.println("Interest Rate: " + formattedIntRate);
            System.out.println("Interest: " + formattedInterestAmt);
            System.out.println();
            System.out.print("Continue? (y/n): ");
            wantsToContinue = scanner.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}