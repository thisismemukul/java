import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Cylinder cylinder = new Cylinder();
        cylinder.setDimensions(3, 5); // Set both radius and height
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Perimeter: " + cylinder.getPerimeter());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Lateral Surface Area: " + cylinder.getLateralSurfaceArea());
        System.out.println(cylinder);

        try {
            circle.setRadius(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            cylinder.setHeight(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        SavingsAccount savingsAccount = new SavingsAccount("SA123456", "Alice", "123 Maple St", "555-1234", "1990-01-01", 1500.0);
        System.out.println("Savings Account Details:");
        System.out.println(savingsAccount);

        // Depositing money
        savingsAccount.deposit(500.0);
        System.out.println("After depositing $500:");
        System.out.println(savingsAccount);

        // Withdrawing money
        try {
            savingsAccount.withdraw(800.0);
            System.out.println("After withdrawing $800:");
            System.out.println(savingsAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Fixed deposit
        savingsAccount.fixedDeposit(1000.0, LocalDate.now());
        System.out.println("After fixed deposit:");
        System.out.println(savingsAccount);

        // Liquidate fixed deposit
        savingsAccount.liquidateDeposit();
        System.out.println("After liquidating fixed deposit:");
        System.out.println(savingsAccount);

        // Creating a LoanAccount
        LoanAccount loanAccount = new LoanAccount("LA654321", "Bob", "456 Oak St", "555-5678", "1985-05-15", 2000.0, 5000.0);
        System.out.println("\nLoan Account Details:");
        System.out.println(loanAccount);

        // Top-up loan
        try {
            loanAccount.topUpLoan(1500.0);
            System.out.println("After topping up loan by $1500:");
            System.out.println(loanAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Repayment
        try {
            loanAccount.repayment(1000.0);
            System.out.println("After repayment of $1000:");
            System.out.println(loanAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Pay EMI
        try {
            loanAccount.payEMI(500.0);
            System.out.println("After paying EMI of $500:");
            System.out.println(loanAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}