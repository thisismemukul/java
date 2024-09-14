package atm;
public class ATMApp {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);

        // Create and start user threads
        Thread user1 = new UserThread(atm, 200, 150);
        Thread user2 = new UserThread(atm, 100, 200);
        Thread user3 = new UserThread(atm, 50, 100);

        user1.start();
        user2.start();
        user3.start();

        try {
            // Wait for all threads to finish
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check final balance
        System.out.println("Final balance: " + atm.checkBalance());
    }
}
