public class LoanAccount extends Account {
    private double loanLimit;
    private double loanBalance;
    private double emiAmount;

    public LoanAccount(String accountNumber, String accountHolderName, String address, String phoneNumber, String dateOfBirth, double balance, double loanLimit) {
        super(accountNumber, accountHolderName, address, phoneNumber, dateOfBirth, balance);
        this.loanLimit = loanLimit;
        this.loanBalance = 0;
        this.emiAmount = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount <= (getBalance() + loanLimit - loanBalance)) {
            setBalance(getBalance() - amount);
            loanBalance += amount;
        } else {
            throw new IllegalStateException("Withdrawal amount exceeds the loan limit.");
        }
    }

    public void payEMI(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("EMI amount must be positive.");
        }
        if (amount > loanBalance) {
            throw new IllegalArgumentException("EMI amount exceeds the loan balance.");
        }
        loanBalance -= amount;
        setBalance(getBalance() - amount);
    }

    public void topUpLoan(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Top-up amount must be positive.");
        }
        if (loanBalance + amount <= loanLimit) {
            loanBalance += amount;
        } else {
            throw new IllegalStateException("Top-up amount exceeds the loan limit.");
        }
    }

    public void repayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Repayment amount must be positive.");
        }
        if (amount > loanBalance) {
            throw new IllegalArgumentException("Repayment amount exceeds the loan balance.");
        }
        loanBalance -= amount;
        setBalance(getBalance() + amount);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Loan Limit: " + loanLimit +
                ", Loan Balance: " + loanBalance;
    }
}
