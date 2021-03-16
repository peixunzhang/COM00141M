
/**
 * A class to hold the declarations and Expressions 
 * 
 * @author (Zhang Peixun) 
 * @version (2021.03.12)
 */
public class Amazing
{
   //Put your data type declarations below. Here is an example
    float x = 2.5f;
    float y = -1.5f;
    int m = 18;
    int n = 4;
    double quOne;
    double quTwo;
    double quThree;
     

//Put the code for your calculations in this method.   
   void doCalculations()
   {
       quOne = x+n*y - (x+n)*y;
       quTwo = m/n + m%n;
       quThree = 5*x - n/5;
       System.out.println(quOne);
       System.out.println(quTwo);
       System.out.println(quThree);
       int x=5;

       System.out.print(x--  + "  ");

       System.out.print(x    + "  ");

     
       
   }//End of doCalculations
}
