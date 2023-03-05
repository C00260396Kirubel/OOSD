public class SavingsAccountTest{
    public static void main(String[] args) {
        // Instantiate two SavingsAccount objects with balances of 2000.00 and 3000.00 respectively
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%, calculate monthly interest, and print new balances for each saver
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New balance for " +saver1.getAccountNumber() +" "+ saver1.getSavingsBalance());
        System.out.println("New balance for " +saver2.getAccountNumber() +" "+ saver2.getSavingsBalance());

        // Set annual interest rate to 5%, calculate monthly interest for the next month, and print new balances for each saver
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New balance for " +saver1.getAccountNumber() +" "+ saver1.getSavingsBalance());
        System.out.println("New balance for " +saver2.getAccountNumber() +" "+ saver2.getSavingsBalance());
    }
}
