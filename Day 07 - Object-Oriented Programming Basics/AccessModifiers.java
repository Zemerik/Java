public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        
        // Public method - accessible from anywhere
        account.displayBalance();
        
        // Protected method - accessible within package and subclasses
        account.showAccountInfo();
        
        // Default method - accessible within package
        account.showInternalInfo();
        
        // Private method - not accessible from outside the class
        // account.showPrivateInfo(); // This would cause compilation error
    }
}

class BankAccount {
    // Private field - only accessible within this class
    private String accountNumber;
    private double balance;
    
    // Public constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Public method - accessible from anywhere
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
    
    // Protected method - accessible within package and subclasses
    protected void showAccountInfo() {
        System.out.println("Account: " + accountNumber);
    }
    
    // Default (package-private) method - accessible within package
    void showInternalInfo() {
        System.out.println("Internal info - Account: " + accountNumber + ", Balance: $" + balance);
    }
    
    // Private method - only accessible within this class
    private void showPrivateInfo() {
        System.out.println("This is private information");
    }
} 