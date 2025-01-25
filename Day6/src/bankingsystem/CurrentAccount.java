package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 2.5 / 100;  // Example interest rate for current accounts
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for loan of: " + amount + " for Current Account");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 2000;  // Example eligibility condition for current accounts
    }
}
