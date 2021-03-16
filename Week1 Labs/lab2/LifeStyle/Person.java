
/**
 * To demonstrate boolean.
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.12)
 */
public class Person
{
	double cmHeight = 155 ;
	double kgWeight = 50 ;
	boolean smoker = false;
	int weeklyAlcholUnits = 0;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 100;
	char gender = 'F';

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	
	public void displayDetails()
	{
	   System.out.println(gender);
	}
	
	public void checkDesirability() 
	{
		boolean shape;
		boolean smoker = true;
		boolean abuser;
		boolean desirable;
		shape = ((kgWeight > 100) && (cmHeight < 150));
	    abuser = ((weeklyAlcholUnits > RWAL) && (smoker) );
		desirable = ((shape && abuser));
		System.out.println(desirable);


	}
	
}
