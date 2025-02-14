import java.util.Scanner;

public class ArrayPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements in array
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index

      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
	  
	  
	  //An array's length property, accessed by appending .length after the array's name, userVals.length is 8 because the array was allocated with 8 elements.
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }
      
      System.out.print("You entered: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print(userVals[i] + " ");
      }
      System.out.println();
   }


//  A programmer may initialize an array's elements with non-default values by specifying the initial values in braces {} 
// int[] myArray = {5, 7, 11}; creates an array of three integer elements with values 5, 7, and 11


// int[] myVals = {10, 10, 10 ,10};  <---  an array of ints named myVals with 4 elements each initialized to 10.