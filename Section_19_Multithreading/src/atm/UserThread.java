package atm;

public class UserThread extends Thread {
    private ATM atm;
    private int depositAmount;
    private int withdrawAmount;

    public UserThread(ATM atm, int depositAmount, int withdrawAmount) {
        this.atm = atm;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        atm.deposit(depositAmount);
        atm.withdraw(withdrawAmount);
    }
}
