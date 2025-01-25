package bankingsystem;

import java.util.List;

public class BankingSystem {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: " + interest);
            System.out.println("Balance: " + account.getBalance());
            System.out.println();

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(5000);  // Example loan amount
                boolean isEligible = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + (isEligible ? "Eligible" : "Not Eligible"));
            }
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA1001", "Alice", 5000, 5);
        CurrentAccount currentAccount = new CurrentAccount("CA1001", "Bob", 3000, 1000);

        List<BankAccount> accounts = List.of(savingsAccount, currentAccount);
        processAccounts(accounts);
    }
}
