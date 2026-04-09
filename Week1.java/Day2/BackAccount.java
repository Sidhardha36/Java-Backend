class BankAccount {
    
    String name;
    double balance;

    // Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}



