import java.util.Scanner;

public class SumOfExcessPrintGreaterThenWithExplanation {
	
//creating the instance of Scanner class
   public static void main (String [] args) {
	   
	  //creating scanner
      Scanner scnr = new Scanner(System.in);
	  
	  //loop will iterate 4 times
      final int NUM_VALS = 4;
	  
	  //creating the array with NUM_VALS
      int[] testGrades = new int[NUM_VALS];
      int i;
      int sumExtra;

	  //using the for loop to enter user's input for testGrades
      for (i = 0; i < testGrades.length; ++i) {
         testGrades[i] = scnr.nextInt();
      }
      sumExtra = 0; // Assign sumExtra with 0 before your for loop
      
	  //for loop to check NUM_VALS and compare to testGrades
      for (i=0; i<NUM_VALS; ++i)
      {
		  //checking the extra credits received 
         if (testGrades[i]>100)
         {
			 //when the test grade is greater than 100 then 
            sumExtra+=testGrades[i] - 100;
         }
      }
		//print the value of sumExtra
      System.out.println("sumExtra: " + sumExtra);
   }
}