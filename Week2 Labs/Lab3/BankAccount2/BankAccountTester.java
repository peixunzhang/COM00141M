
/**
 * A Class to test the BankAccount Class and demonstrate the use of the Static attribute
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.18)
 */
public class BankAccountTester
{
    
   public static void main(String args[])
   {
      //Create two bank accounts,
      BankAccount account1 = new BankAccount("96723234","Marie Curie");
      BankAccount account2 = new BankAccount("99786754","Nelson Mandela");
      
      
      System.out.println("Before set: Interest Rate for account1: "  + account1.getInterestRate());
      System.out.println("Before set: Interest Rate for account2: "  + account2.getInterestRate());
      
      
      //The code appears to set the interest rate for account2 only, 
      //However interestRate is a static variable, so will apply to all accounts
      account2.setInterestRate(50);
      
      //Now check the interest rate for both accounts
      System.out.println("After set: Interest Rate for account1: "  + account1.getInterestRate());
      System.out.println("After set: Interest Rate for account2: "  + account2.getInterestRate());
      

     }

}
