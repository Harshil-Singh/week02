package bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for loan of: " + amount + " for Savings Account");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;  // Example eligibility condition
    }
}
