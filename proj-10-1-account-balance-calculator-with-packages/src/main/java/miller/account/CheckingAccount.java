package miller.account;

public class CheckingAccount extends Account{
    private double monthlyFee;

    public CheckingAccount(double monthlyFee) {
        super();
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void subtractMonthlyFee() {
        double balance = super.getBalance();
        double updatedBalance = balance - monthlyFee;
        super.setBalance(updatedBalance);
    }
}
