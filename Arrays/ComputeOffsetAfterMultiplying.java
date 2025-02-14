//While the arrays are related, they should be declared separately. int[] seatPosition = new int[130]; declares an integer array named seatPostion that stores 130 elements, 
//while int[] testScore = new int[130]; declares an integer array named testScore that stores 130 elements.

//int[] seatPosition = new int[130]; int[] testScore = new int[130];  

//Multiply each element in origList with the corresponding value in offsetAmount. Print each product followed by a space.

import java.util.Scanner;

public class ComputeOffsetAfterMultiplying {

   public static void main(String[] args) {
      final int NUM_VALS = 4;
      int[] origList = new int[NUM_VALS];
      int[] offsetAmount = new int[NUM_VALS];
      int i;
      Scanner input = new Scanner(System.in);

      origList[0] = input.nextInt();
      origList[1] = input.nextInt();
      origList[2] = input.nextInt();
      origList[3] = input.nextInt();

      offsetAmount[0] = input.nextInt();
      offsetAmount[1] = input.nextInt();
      offsetAmount[2] = input.nextInt();
      offsetAmount[3] = input.nextInt();
      int total = 0;
      
      for (i=0; i<origList.length; ++i)
      {
         origList[i]*=offsetAmount[i];
      }
      
      for(i=0; i<origList.length; ++i)
      { 
         System.out.print(origList[i] + " ");
      }

      System.out.println();
  }
}