import java.util.Scanner;

//When copying lists,  Changes to either array do not affect the other.

public class NegativeToZeroCopyArrayList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;               // Number of elements
      int[] userVals = new int[NUM_ELEMENTS];   // User numbers
      int[] copiedVals = new int[NUM_ELEMENTS]; // New numbers
      int i;                                    // Loop index

      // Prompt user for input values
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();
      }

      // Convert nums to newNums
      for (i = 0; i < userVals.length; ++i) {
         copiedVals[i] = userVals[i];
      }

      // Convert negatives to 0
      for (i = 0; i < copiedVals.length; ++i) {
         if (copiedVals[i] < 0) {
            copiedVals[i] = 0;
         }
      }

      // Print numbers
      System.out.println("\nOriginal and new values: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.println(userVals[i] + " became " + copiedVals[i]);
      }
      System.out.println();
   }
}

/*
This loop copies firstList to secondList, so that secondList becomes 33, 44, 55, 66:
for (i = 0; i < 4; ++i) {
   secondList[i] = firstList[i];
   
   _______________________________________
   
   
   The last iteration will attempt firstList[4] = thirdList[4]. But element firstList[4] doesn't exist (the array's size is 4, 
   so last element is firstList[3]), an error occurs. Copying arrays should involve same sized array (or a smaller array copied to the beginning of a larger array).
}
*/