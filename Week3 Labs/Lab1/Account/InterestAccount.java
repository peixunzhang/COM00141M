
/**
 * 
 * @author pzhang
 *
 */
public class InterestAccount extends Account
{
	// instance variables 
	private double monthlyInterestRate;
	
	//consructor
	public InterestAccount(double balance)
	{
		super(balance);
		monthlyInterestRate = 0.1;
	}
	
	//cal
	public void addMonthlyInterest()
	{
		double interest = getBalance() * monthlyInterestRate;
		super.credit(interest);
	}
	
	//setters and getters
	public void setMonthlyInterestRate(double monthlyInterestRateIn)
	{
		monthlyInterestRate = monthlyInterestRateIn;
	}
	public double getmonthlyInterestRate()
	{
		return monthlyInterestRate;
	}


	//toString
	public String toString()
	{
		return super.toString() + " monthlyInterestRate : " + monthlyInterestRate;

	}

}
