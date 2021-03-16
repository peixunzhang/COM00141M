
/**
 * Write a description of class Lotto here.
 * 
 * @author (Zhnag peixun) 
 * @version (2021.03.14)
 */
public class Lotto
{
	
	//Put the luckyDip() method here
	public  void luckyDip()
	{
		int count;
		 for (count = 1; count < 7; count++) {
			 System.out.println("Ball" + count + "=" + (int)((Math.random()*49)+1));
		 }
	}
}