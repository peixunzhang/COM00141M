
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;

public class BirdTable {
	

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Declare and build an array interactively - see the Temperature Project
	   int[] birdTable = new int[7];
	   
	   birdTable[0] =19;
	   birdTable[1] =15;
	   birdTable[2] =7;
	   birdTable[3] =11;
	   birdTable[4] =9;
	   birdTable[5] =13;
	   birdTable[6] =5;
	   
      
      //Display Output using a histogram of '*' - see Histogram Project
   
   		String output = "histogram";
   		
   		for (int i = 0; i < birdTable.length; i++) {
   			output +=
   					"\n" + i + "\t" + birdTable[i] + "\t";
   			for (int day = 0; day < birdTable[i]; day++)
   				output += "*";
      }
   		JTextArea outputArea = new JTextArea();
   		outputArea.setText(output);
   		JOptionPane.showMessageDialog( null, outputArea,
   	         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );
   
   }
}