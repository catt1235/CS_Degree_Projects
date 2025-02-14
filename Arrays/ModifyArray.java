import java.util.Scanner;

public class ModifyArray {

   /* Display array values */
   public void displayValues(int [] arrayVals) {
      int i;

      for (i = 0; i < arrayVals.length; ++i) {
         System.out.print(arrayVals[i] + " ");
      }
      System.out.println("");
   }

public static void swapArrayEnds(int sortArray[])
{
   int numElem = sortArray.length;
   int temp = sortArray[0];
   sortArray[0]=sortArray[numElem-1];
   sortArray[numElem-1]=temp;
}

   public static void main (String [] args) {
      int numElem = 4;
      int[] sortedArray = new int[numElem];
      ModifyArray numInverter = new ModifyArray();

      // Add values to the array
      sortedArray[0] = 10;
      sortedArray[1] = 20;
      sortedArray[2] = 30;
      sortedArray[3] = 40;

      numInverter.swapArrayEnds(sortedArray);
      numInverter.displayValues(sortedArray);
   }
}