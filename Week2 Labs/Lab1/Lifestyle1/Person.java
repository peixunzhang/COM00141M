
/**
 * To demonstrate boolean.
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.16)
 */
import java.util.*; 
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.println("Abusing Body = " + checkAbuser());
	   System.out.println("BMI= " );
	   System.out.println( getBMI() );
	   
	}
	
	public void promptdata()
	{
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter weight ");
	     kgWeight = sc.nextDouble();
	     System.out.println("Enter height ");
	     cmHeight = sc.nextDouble();
	     System.out.println("Enter weeklyAlcholUnits ");
	     weeklyAlcholUnits = sc.nextInt();
	     System.out.println("Enter restPulse ");
	     restPulse = sc.nextInt();
	}
	
	public double getBMI()
	{
		double bmi;
		bmi = kgWeight/(cmHeight*cmHeight)*10000;
		return bmi;
	}
}
