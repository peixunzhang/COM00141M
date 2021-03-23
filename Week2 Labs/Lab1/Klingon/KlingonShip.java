
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.16)
 */
import java.util.*;
public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	public void displayKlingonDetails()
	{
		System.out.print("photonPower is"+ "\t");
		System.out.println(photonPower + "\n");
		System.out.print("threatFactor is"+ "\t");
		System.out.println(threatFactor+ "\n");
		System.out.print("cosmicProximity is"+ "\t");
		System.out.println(cosmicProximity + "\n");
		System.out.print("DangerLeve ="+ "\t");
	    System.out.println( getDangerLevel() );
	}
	
	public double getDangerLevel()
	{
		double dangerLevel;
		dangerLevel = (photonPower * threatFactor)/cosmicProximity;
		return dangerLevel;
	}
	
	public void promptSettings()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the photonPower ");
		photonPower = sc.nextInt();
	}
	
}
