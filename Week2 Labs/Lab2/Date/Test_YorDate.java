// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author	Tommy Yuan
 * @version	24 January 2019 */
 
public class Test_YorDate
{
	public static void main(String args[])
	{
		//Create a reference to a YorDate object
		YorDate date1;
			
	    // This creates an object which sets the date to the current date
		 date1 = new YorDate();
		
		//Using the appropriate methods set, set date1 to your birthdate
		 YorDate date2 = new YorDate(9,2,1997);

		
		//Using appropriate date1 method(s) display your birthday
		date1.setDay(9);
		date1.setMonth(2);
		date1.setYear(1997);
		System.out.println(date1.getDayOfWeek());
		
	}
}