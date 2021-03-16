
/**
 * To demonstrate boolean.
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.12)
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcoholUnits = 50; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcoholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   
	}
	//Put curseAndSwear method here
	public void curseAndSwear()
	{
		int numb = (int)(Math.random()*6)+1;
		switch (numb) {
		case 1:
			System.out.println("Oh damn!! What a nuisance");
			break;
		case 2:
			System.out.println("Oh damn!! What a nuisance2");
			break;
		case 3:
			System.out.println("Oh damn!! What a nuisance3");
			break;
		case 4:
			System.out.println("Oh damn!! What a nuisance4");
			break;
		case 5:
			System.out.println("Oh damn!! What a nuisance5");
			break;
			
		}
			
	}
	
	
	
}
