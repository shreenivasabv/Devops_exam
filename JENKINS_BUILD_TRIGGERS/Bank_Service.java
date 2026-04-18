public class Bank_Service {

    // Nested static class
    static class BankAccount {
        private double balance;

        // Constructor
        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Invalid withdrawal");
            }
            balance -= amount;
        }

        // Get balance
        public double getBalance() {
            return balance;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create account
        BankAccount acc = new BankAccount(7000);

        System.out.println("Initial Balance: " + acc.getBalance());

        // Deposit
        acc.deposit(700);
        System.out.println("Balance after deposit of 700: " + acc.getBalance());

        // Withdraw
        acc.withdraw(300);
        System.out.println("Balance after withdrawal of 300: " + acc.getBalance());

        // Final balance
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
