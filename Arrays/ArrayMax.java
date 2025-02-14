import java.util.Scanner;

public class ArrayMax {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // Array of user numbers
      int i;                                  // Loop index
      int maxVal;                             // Computed max

      // Prompt user to populate array
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }

      // Determine largest (max) number
      maxVal = userVals[0];                   // Largest so far , userVals must be initialized to an element in the array. Using the 0'th element ensures the code works for any size array.
      
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] > maxVal) {
            maxVal = userVals[i];
         }
      }
      System.out.println("Max: " + maxVal);
   }
}

/*

Counts how many negative numbers exist in the array.
 
cntNeg = 0;
for (i = 0; i < myVals.length; ++i) {
   if ( 
myVals[i] < 0
 ) {
      ++cntNeg;
   }
}
_____________________________________

Count how many odd numbers exist in the array.

cntOdd = 0;
for (i = 0; i < myVals.length; ++i) {
   if ( (myVals[i] % 2) == 1 ) {
	  ++cntOdd;      
 ;
   }
}

*/