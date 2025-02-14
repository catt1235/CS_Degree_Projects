// An array is an ordered list of items of a given data type. Each item in an array is called an element.
//					dataType[] arrayName = new dataType[numElements];
//						Ex: int[] gameScores = new int[4];



/*
A programmer can declare an array reference variable without allocating the array at that time and later assign the variable with an allocated array.

int[] gameScores;

...

gameScores = new int[4];   <------------ Creates 4 elements in memory.
If the size of an array is known, good practice is to combine the array reference variable declaration with the array allocation
*/

//the index is nthPerson - 1 rather than just nthPerson because an array's indices start at 0, so the 1st age is at index 0, the 2nd at index 1, etc.


import java.util.Scanner;

public class OldestPeople {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] oldestPeople = new int[5]; 
      int nthPerson;                   // User input, Nth oldest person

      oldestPeople[0] = 122; // Died 1997 in France
      oldestPeople[1] = 119; // Died 1999 in U.S.
      oldestPeople[2] = 117; // Died 1993 in U.S.
      oldestPeople[3] = 117; // Died 1998 in Canada
      oldestPeople[4] = 116; // Died 2006 in Ecuador

      System.out.print("Enter N (1-5): ");
      nthPerson = scnr.nextInt();

// this ensures only valid array elements are accessed because the array oldestPeople only has 5 elements.
      if ((nthPerson >= 1) && (nthPerson <= 5)) {
         System.out.print("The " + nthPerson + "th oldest person lived ");
         System.out.println(oldestPeople[nthPerson - 1] + " years.");
      }
   }
}

//int[] myVals = new int[10];  <- declared and initialized new array named myVals which stores 10 elements


//	myVals[currIndex] = 777;  <---- The value held in currIndex is used as the array index. An array index may be any expression that evaluates to an integer value.

//   tempVal = myVals[i + 1]; <--------- Assign tempVal with the myVals array element at the index one after the value held in variable i. 
//										The expression i + 1 is evaluated, and the result is used as the array index.