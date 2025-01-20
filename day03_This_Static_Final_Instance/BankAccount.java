 class BankAccounts {
    // Static variable shared by all accounts
    static String bankName = "HDFC Bank"; 
    private static int totalAccounts = 0; // Tracks the total number of accounts

    // Final variable ensures account number cannot be changed
    private final int accountNumber; 
    private String accountHolderName;

    // Constructor to initialize account details  
      BankAccounts(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts count
    }

    // Static method to return the total number of accounts
    static int getTotalAccounts() {
        return totalAccounts;
    }

    // Display account details, checking if the object is an instance of BankAccount
    void displayDetails() {
        if (this instanceof BankAccounts) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class BankAccount{
    public static void main(String[] args) {
        // Creating BankAccount objects
        BankAccounts acc1 = new BankAccounts("DEEPAK", 101);
        BankAccounts acc2 = new BankAccounts("CHOURSIYA", 102);

        // Displaying account details
        acc1.displayDetails();
        acc2.displayDetails();

        // Display total accounts
        System.out.println("Total Accounts: " + BankAccounts.getTotalAccounts());
    }
}

