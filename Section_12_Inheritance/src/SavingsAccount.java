import java.time.LocalDate;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000.0;
    private LocalDate fixedDepositDate;
    private double fixedDepositAmount;

    public SavingsAccount(String accountNumber, String accountHolderName, String address, String phoneNumber, String dateOfBirth, double balance) {
        super(accountNumber, accountHolderName, address, phoneNumber, dateOfBirth, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (getBalance() - amount >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
        } else {
            throw new IllegalStateException("Insufficient balance. Minimum balance requirement not met.");
        }
    }

    public void fixedDeposit(double amount, LocalDate date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Fixed deposit amount must be positive.");
        }
        this.fixedDepositAmount = amount;
        this.fixedDepositDate = date;
    }

    public void liquidateDeposit() {
        if (fixedDepositAmount > 0) {
            deposit(fixedDepositAmount);
            fixedDepositAmount = 0;
            fixedDepositDate = null;
        } else {
            throw new IllegalStateException("No fixed deposit to liquidate.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Fixed Deposit Amount: " + fixedDepositAmount +
                ", Fixed Deposit Date: " + (fixedDepositDate != null ? fixedDepositDate.toString() : "None");
    }
}
