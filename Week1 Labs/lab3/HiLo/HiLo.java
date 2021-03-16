/*
 * @author Tommy Yuan
 * The purpose is to practise the use of if statement.
 * 
 * */


import java.util.*;

public class HiLo {
    
     int random;
    
    public void generateNumber() 
    {
       //The following lines generate and output a random number between 1 and 10
        random = (int)(Math.random()*100)+1;
    }
    
   //Write the guess() method below 
   public void guess()
   {
	   //Use scanner to accept a user input 
	   //Create a new scanner object to receive user input
	      Scanner sc=new Scanner(System.in);
	    
	      System.out.println("Enter you guess ");
	      int guess = sc.nextInt();
	      
	      //write your code below
	      if (guess > random) {
		      System.out.println("High");
	      } else if (guess < random) {
		      System.out.println("Low"); 
		  } else {
		      System.out.println("Hit");
		  }
   }
   public void startGuessing()
   {
	      Scanner sc=new Scanner(System.in);
	    
	      System.out.println("Enter you guess ");
	      int guess = sc.nextInt();
	      int count = 0;
	      
	      while  (guess != random)
	      {
	    	  count++;
	    	  if (guess > random) {
	    		System.out.println("High");
	    		System.out.println("Enter you guess ");
	  	      	guess = sc.nextInt();
	    	  } else if (guess < random) {
	    	  	System.out.println("Low"); 
	    	  	System.out.println("Enter you guess ");
	    	  	guess = sc.nextInt();
	    	  }
	      } 	
	      System.out.println("Hit");
	      System.out.println("TotalGuess=" + (count++));
    }
}