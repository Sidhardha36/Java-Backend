
import java.util.HashMap;
public class Main {
    public static void main(String args[]){
        BankAccount a1=new BankAccount("Sidhardha",95000.0);
        BankAccount a2=new BankAccount("Varma", 75000.0);
        BankAccount a3=new BankAccount("Rudra", 85000.0);
    }
    // Test Equals
    System.out.println("--- equals() test ---");
    System.out.println("a1.equals(a2): " + a1.equals(a2)); 
    System.out.println("a1.equals(a3): " + a1.equals(a3)); 

    // Test hashCode
    System.out.println("\n--- hashCode() test ---");
    System.out.println("a1 hashCode: " + a1.hashCode());
    System.out.println("a2 hashCode: " + a2.hashCode()); 
    System.out.println("a3 hashCode: " + a3.hashCode());

    // Test in HashMap —
    System.out.println("\n--- HashMap test ---");
    HashMap<BankAccount, String> map = new HashMap<>();
    map.put(a1, "primary account");

    System.out.println("map.get(a2): " + map.get(a2)); 

    // Test toString
    System.out.println("\n--- toString() test ---");
    System.out.println(a1);
    System.out.println(a3);
}
