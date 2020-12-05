
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account laurensAccount = new Account("Laurens' account", 100.00);
       
        
        laurensAccount.deposit(20);
        System.out.println("The balance of your account is: " + laurensAccount);
        
        
    }
}
