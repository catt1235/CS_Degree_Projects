//For any element in keysList with a value greater than 50, print the corresponding value in itemsList, followed by a comma (no spaces).

import java.util.Scanner;

public class CompareListsPrintIfOver50 {

   public static void main(String args[]) {
      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      int[] itemsList = new int[SIZE_LIST];
      int i;
      Scanner input = new Scanner(System.in);

      keysList[0] = input.nextInt();
      keysList[1] = input.nextInt();
      keysList[2] = input.nextInt();
      keysList[3] = input.nextInt();

      itemsList[0] = input.nextInt();
      itemsList[1] = input.nextInt();
      itemsList[2] = input.nextInt();
      itemsList[3] = input.nextInt();

         for (i=0; i<SIZE_LIST; ++i)
      {
         if (keysList[i]>50)
         {
            System.out.print(itemsList[i] + ",");
         }
}
      System.out.println();
   }

}