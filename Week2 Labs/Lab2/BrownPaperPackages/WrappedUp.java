
/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version (2021.03.18)
 */
import java.util.*;
public class WrappedUp
{
	private String myFavThing;
	public WrappedUp(String myFavThing)
	{
		this.myFavThing = myFavThing;
	}
	public boolean guessMyFavouriteThing()
	{
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
	   /* Now prompt for a guess - using the Scanner class
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Guess my favourite thing. It has " + myFavThing.length() + " characters and begins with " + myFavThing.charAt(0));
		String guess = sc.next();
		if (myFavThing.equalsIgnoreCase(guess))
		{
			System.out.println("correct");
			return true;
		}else {
			System.out.println("wrong");
			return false;

		}
		

	   
	  
	  
	  // Now test if the guess was correct - ignore case 
	 
	
	
	
	}//end guessing


	public static void main(String args[]) {
		//Create WrappedUp object and test the methods
		WrappedUp myFav;  
		myFav = new WrappedUp("food");
		while (!myFav.guessMyFavouriteThing());
		

		
	}
}
