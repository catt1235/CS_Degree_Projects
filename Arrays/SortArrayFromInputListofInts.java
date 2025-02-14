import java.util.Scanner;

public class SortArrayFromInputListofInts {

   public static void sortArray(int[] myArr, int arrSize)
   {
      int i, j, k;
      
      for (i = 0; i < arrSize; i++)
      {
      for (j = 0; j < arrSize-i-1; j++)
      {
         if (myArr[j] < myArr[j+1])
         {
         
         k = myArr[j];
         myArr[j] = myArr[j+1];
         myArr[j+1] = k;
         
         }
      }
   }
   
   for (i = 0; i < arrSize; i++)
   {
      System.out.print(myArr[i] + ",");
   }
   System.out.println();
}

   public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      int arrSize=input.nextInt();
      int myArr[]=new int[arrSize];
      
         for(int i=0;i<arrSize;i++)
         {
            myArr[i]=input.nextInt();
         }
         
      sortArray(myArr,arrSize);
   }
}
