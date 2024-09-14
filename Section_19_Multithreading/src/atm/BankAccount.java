package atm;

public class BankAccount {
    public double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance while deposit: " + balance);
        System.out.println("Deposited " + amount + " to the bank");
        System.out.println("Updated Balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            balance -= amount;
            System.out.println("Current Balance: " + balance);
            System.out.println("Withdrawn " + amount + " to the bank");
            System.out.println("Updated Balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds for the withdrawal of amount: " + amount);
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
