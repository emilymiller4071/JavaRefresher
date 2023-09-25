package miller.app;

import miller.account.Account;
import miller.account.CheckingAccount;
import miller.account.SavingsAccount;
import miller.presentation.Console;

import java.text.NumberFormat;

public class AccountBalanceApp {
    public static void main(String[] args) {


        System.out.println("Welcome to the Account Application!\n");

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // create checking account with monthly fee
        // set checking balance
        CheckingAccount checking = new CheckingAccount(5);
        checking.setBalance(1000);

        // create savings account with monthly interest
        // set savings balance
        SavingsAccount savings = new SavingsAccount(.01);
        savings.setBalance(1000);

        System.out.println("Starting Balances");
        System.out.println("Checking: " + currency.format(checking.getBalance()));
        System.out.println("Savings: " + currency.format(savings.getBalance()) + "\n");

        System.out.println("Enter the transactions for the month\n");

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            String transaction = Console.getString("Withdrawal or deposit? (w/d): ", "w", "d");
            String whichAccount = Console.getString("Checking or savings? (c/s): ", "c", "s");

            Account account;
            if (whichAccount.equalsIgnoreCase("c")) {
                account = checking;
            } else {
                account = savings;
            }

            if (transaction.equalsIgnoreCase("w")) {
                double withdrawalAmount = Console.getDouble("Amount?: ", 0, account.getBalance());
                account.withdraw(withdrawalAmount);
            } else {
                double depositAmount = Console.getDouble("Amount?: ", 0, 5000);
                account.deposit(depositAmount);
            }

            wantsToContinue = Console.getString("Continue? (y/n): ", "y", "n");
        }

        checking.subtractMonthlyFee();
        savings.calcInterestPayment();

        System.out.println("Monthly Payments and Fees");
        System.out.println("Checking fee:\t\t" + currency.format(checking.getMonthlyFee()));
        System.out.println("Savings interest payment:\t" + currency.format(savings.getMonthlyInterestPayment()) + "\n");
        System.out.println("Final Balances");
        System.out.println("Checking: " + currency.format(checking.getBalance()));
        System.out.println("Savings: " + currency.format(savings.getBalance()) + "\n");
        System.out.println("Goodbye!");
    }

}