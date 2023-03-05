public class BankCustomerTest {
    public static void main(String[] args) {
        // Create a new BankCustomer object
        BankCustomer customer = new BankCustomer("John Doe", "123 Main St");

        // Create three SavingsAccount objects and add them to the customer's accounts
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);
        SavingsAccount account3 = new SavingsAccount(4000.00);
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3);

        // Print the total savings balance for the customer
        System.out.println("Total savings balance: €" + customer.balance());

        // Print a summary of each account and its balance
        customer.summary();
    }
}
