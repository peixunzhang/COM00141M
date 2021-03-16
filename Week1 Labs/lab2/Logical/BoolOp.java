
/**
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.12)
 */
public class BoolOp
{
    //Put your data type declarations here - I have put bresult there to hold the results 
    // of your calculations (see the Boolbag example)
      boolean bresult;
      boolean finished = false;
      int  m = 3;
      int  n = 8;


/* Put the code for your calculations in this method.
 * The result of the expression should be calculated and assigned to 'bresult'
 */
   public void a_boolOperation()
   {
	   bresult = (n > m) && (m < -2);
	   System.out.println("( (n > m) && (m < -2) ) = " + bresult);

	   bresult = (m > 5) || ! (finished);
	   System.out.println("( (m > 5) || ! (finished) ) = " + bresult);

    	  
	   bresult = !(n < 5) && !(finished);
	   System.out.println("( !(n < 5) && !(finished) ) = " + bresult);
   }
    
	
}
