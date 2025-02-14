import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);

      final int NUM_VALS = 4;
      int[] userValues = new int[NUM_VALS];
      int i;
      int matchValue;
      int numMatches; // Assign numMatches with 0 before your for loop

      matchValue = scnr.nextInt();  // Input matchValue by user
      for (i = 0; i < userValues.length; ++i) {
         userValues[i] = scnr.nextInt();  // Input userValues by user
      }

      numMatches = 0; // intialize variable numMatches to 0
	  
	  
      // for loop run from 0 to NUM_VALS - 1
	  for (i=0; i<NUM_VALS; ++i)
      {
		  // check if the matchValue is equal to the number in userVaues at index i
         if(userValues[i]==matchValue)
         ++numMatches; // increment numMatches by 1
      }
      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}