import java.util.Objects;

public class SavingsAccount {
    private static double annualInterestRate; // class variable to store annual interest rate for all savers
    private double savingsBalance; // instance variable to store current savings balance
    private final int accountNumber; // unique account number assigned by constructor
    private static int accountCounter = 1; // static variable to track number of accounts created

    // constructor that takes initial savings balance and assigns a unique account number
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        accountNumber = accountCounter++;
    }

    // method to calculate monthly interest and update savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    // static method to modify annual interest rate for all savers
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // getter method to retrieve current savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // getter method to retrieve unique account number
    public int getAccountNumber() {
        return accountNumber;
    }

    
}
