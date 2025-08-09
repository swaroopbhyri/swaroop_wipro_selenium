package Day_5;
import java.util.ArrayList;
import java.util.List;

public class BankAcc {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory;

    private class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return type + ": " + amount;
        }
    }

    public BankAcc(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed: insufficient funds or invalid amount!");
            return false;
        }
    }

    
    public double getBalance() {
        return balance;
    }

  
    public String getLastTransaction() {
        if (!transactionHistory.isEmpty()) {
            return transactionHistory.get(transactionHistory.size() - 1).toString();
        }
        return "No transactions yet.";
    }

  
    private String maskAccountNumber() {
        if (accountNumber.length() > 4) {
            return "****" + accountNumber.substring(accountNumber.length() - 4);
        }
        return accountNumber;
    }

 
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
               "\nAccount Number: " + maskAccountNumber() +
               "\nBalance: " + balance;
    }

    public static void main(String[] args) {
        BankAcc acc = new BankAcc("1234567890", "Swaroop Bhyri", 1000);

        System.out.println(acc);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); 

        System.out.println("\nLast Transaction: " + acc.getLastTransaction());
        System.out.println("\nAccount Summary:\n" + acc);
    }
}
