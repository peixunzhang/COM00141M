
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 */

import javax.swing.*;

public class Histogram {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Build an array.
      int hArray[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
      hArray = addToArray(removeFromArray(hArray, 1), 3, 1);
      

     //String to hold output
      String output = "Element\tValue\tHistogram";

      // for each array element, output a bar in histogram
      for ( int counter = 0; counter < hArray.length; counter++ ) {
         output += 
            "\n" + counter + "\t" + hArray[ counter ] + "\t";

         // print bar of asterisks
         for ( int stars = 0; stars < hArray[ counter ]; stars++ )
            output += "~";
      }
      //Create a new text area object to hold the text
      JTextArea outputArea = new JTextArea();
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );
      
 
   }
   //remove
   static int[] removeFromArray(int[] arr, int indexToRemove) {
	  int result[] = new int[arr.length - 1];
	  int i = 0;
	  for (int j = 0; j < arr.length; j ++) {
		  if (j != indexToRemove) {
			  result[i] = arr[j];
			  i++;
		  }
	  }
	  return result;
	
   }
   
   //add
   static int[] addToArray(int[] arr, int addition, int where) {
		  int result[] = new int[arr.length + 1];
		  int i = 0;
		  for (int j = 0; j < arr.length; j ++) {
			  if (j == where) {
				 
				  result[i] = addition;
				  i++;
			  }
			  result[i] = arr[j];
			  i++;
		  }
		  return result;
		
	   }
}