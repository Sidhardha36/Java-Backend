
import java.util.Objects;
public class BankAccount {
    private String owner;
    private double owner;


    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw " + amount + ". Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }

    //  Override equals
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof BankAccount)) return false;
        BackAccount other=(BackAccount) o;
        return Double.compare(balance, other.balance) == 0
            &&  Objects.equals(owner, other.owner);
    }
    

    // Override hashcode
    @Override
    public int hashCode(){
        return Objects.hash(owner,balance);
    }

    // Override toString
    @Override
    public String toString() {
        return "BankAccount{owner='" + owner + "', balance=" + balance + "}";
    }

    public double getbalance() { return balance};
    public String getOwner() { return owner};
}
