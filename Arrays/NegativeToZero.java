import java.util.Scanner;

public class NegativeToZero {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index

      // Prompt user to input values
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();
      }

      // Convert negatives to 0
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] < 0) {
            userVals[i] = 0;
         }
      }

      // Print numbers
      System.out.print("New numbers: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print(userVals[i] + " ");
      }
   }
}

/*
If the array (itemsList = -55, -1, 0, 9) the ints will be converted to positive values. 
for (i = 0; i < 4; ++i) {
   if (itemsList[i] < 0) {
      itemsList[i] = itemsList[i] * -1; 
   }
}

__________________________
When i is 3, the loop tries to assign element 3+1, or 4, to element 3. But element 4 does not exist, yielding an out-of-range access.


for (i = 0; i < 4; ++i) {
   itemsList[i] = itemsList[i+1];  
}

__________________________
For each iteration, the next element is assigned to the current element. The loop expression exits before the last element.


for (i = 0; i < 3; ++i) {
   itemsList[i] = itemsList[i+1]; 
   
___________________________
After iteration with i = 0: -55, -55, 0, 9. With i = 1: -55, -55, -55, 9. Etc. New programmers commonly forget that each iteration deals with the latest modified array.

for (i = 0; i < 3; ++i) {
   itemsList[i+1] = itemsList[i]; 
}
   
}
*/