package miller.account;

public class SavingsAccount extends Account{
    double monthlyInterestRate;
    double monthlyInterestPayment;

    public SavingsAccount(double monthlyInterestRate) {
        super();
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void calcInterestPayment() {
        double balance = super.getBalance();
        monthlyInterestPayment = monthlyInterestRate * balance;
        double updatedBalance = balance + monthlyInterestPayment;
        super.setBalance(updatedBalance);

    }

    public double getMonthlyInterestPayment() {
        return monthlyInterestPayment;
    }

}
