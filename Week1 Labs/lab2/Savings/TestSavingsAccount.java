
public class TestSavingsAccount {

	public static void main(String[] args) {
		/* Create SavingsAccount object and 
		 * call the methods
		 */
		SavingsAccount sa=new SavingsAccount();
		sa.initialiseAccountDetails();
		sa.deposit();
		sa.printStatement();
		sa.withdraw();
		sa.printStatement();
		
		
	}
}