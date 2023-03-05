public class BankCustomer {
    private String name;
    private String address;
    private SavingsAccount[] accounts;
    private int numAccounts;

    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
        accounts = new SavingsAccount[3];
        numAccounts = 0;
    }

    public void addAccount(SavingsAccount account) {
        if (numAccounts < 3) {
            accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    public double balance() {
        double totalSavings = 0;
        for (int i = 0; i < numAccounts; i++) {
            totalSavings += accounts[i].getSavingsBalance();
        }
        return totalSavings;
    }

    public void summary() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Account Number: " + accounts[i].getAccountNumber() + " Balance: " + accounts[i].getSavingsBalance());
        }
    }
}
