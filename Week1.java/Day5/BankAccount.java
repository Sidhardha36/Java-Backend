public class BankAccount {
    private String owner;
    private double balance;


    public BankAccount(String owner,double initialbalance){
        this.owner=owner;
        this.balance=initialbalance;
    }
    
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited:"+amount+"Balance:"+balance);
    }

    
public void withdraw(double amount) throws InsufficientFundsException {
        if(amount>balance){
            throw new InsufficientFundsException("Cannot withdraw:"+ amount+", Check Balance:"+ balance);
        }
        balance-=amount;
        System.out.println("Withdraw: "+amount+"Balance:"+balance);
    }
   
    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }

}
