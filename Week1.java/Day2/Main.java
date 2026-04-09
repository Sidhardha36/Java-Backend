public class Main {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Sidhardha", 1000);

        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.withdraw(1500); // edge case

        acc1.display();
    }
}