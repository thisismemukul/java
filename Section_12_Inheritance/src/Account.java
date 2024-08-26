public abstract class Account {
    private String accountNumber;
    private String accountHolderName;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private double balance;

    public Account(String accountNumber, String accountHolderName, String address, String phoneNumber, String dateOfBirth, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder: " + accountHolderName +
                ", Address: " + address +
                ", Phone Number: " + phoneNumber +
                ", Date of Birth: " + dateOfBirth +
                ", Balance: " + balance;
    }
}
