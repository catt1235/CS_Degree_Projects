import java.util.Scanner;

public class ArrayReversal {

   /* Reverse values in the array */
   public void reverseValues(int[] arrayVals) {
      int i;         
      int tempStore;  // Temp variable for swapping

      for (i = 0; i < (arrayVals.length / 2); ++i) {
         // Swap two values 
         tempStore = arrayVals[i]; 
         arrayVals[i] = arrayVals[arrayVals.length - 1 - i];
         arrayVals[arrayVals.length - 1 - i] = tempStore;
      }
   }

   /* Prompt user to enter values */
   public void fillValues(int[] arrayVals) {
      Scanner scnr = new Scanner(System.in);
      int i;
      
      System.out.println("Enter " + arrayVals.length + " values...");
      for (i = 0; i < arrayVals.length; ++i) {
         System.out.print("Value:  ");
         arrayVals[i] = scnr.nextInt();
      }
   }
   
   /* Display array values */
   public void displayValues(int[] arrayVals) {
      int i;
      
      System.out.print("\nNew values: ");
      for (i = 0; i < arrayVals.length; ++i) {
         System.out.print(arrayVals[i] + " ");
      }
      System.out.println();
   }   
   
   public static void main(String[] args) { 
      ArrayReversal studentGrades = new ArrayReversal();
      final int NUM_VALUES = 8;              // Array size
      int[] userVals = new int[NUM_VALUES];                           

      studentGrades.fillValues(userVals);
      studentGrades.reverseValues(userVals);
      studentGrades.displayValues(userVals);
   }
}