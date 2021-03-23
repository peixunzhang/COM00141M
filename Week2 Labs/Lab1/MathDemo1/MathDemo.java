
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number you wish to raise to the power");
	   base = sc.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = sc.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}
	
	public int generateLottoNumber()
	{
		return (int) (Math.random() * 59) + 1;
		
	}


	static int max(int firstIn, int secondIn, int thirdIn)
	{
		return Math.max(Math.max(firstIn, secondIn), thirdIn);
		
    }
	
	public void bestOfThree()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter fitst number ");
	    int first = sc.nextInt();
	    System.out.println("Enter second number ");
	    int second = sc.nextInt();
	    System.out.println("Enter third number ");
	    int third = sc.nextInt();
		int bestOfThree = max(first, second, third);
		System.out.println("Best number is " + bestOfThree);
	}
}

