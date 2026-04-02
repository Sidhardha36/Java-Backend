public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sidhardha", 1000.0);

        // Test deposit
        account.deposit(500);

        // Test valid withdrawal
        try {
            account.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test invalid withdrawal — this will trigger the exception
        try {
            account.withdraw(5000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}