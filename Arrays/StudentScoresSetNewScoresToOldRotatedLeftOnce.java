import java.util.Scanner;

// Write a loop that sets newScores to oldScores rotated once left, with element 0 copied to the end. Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}.
public class StudentScoresSetNewScoresToOldRotatedLeftOnce {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      for (i=1; i< oldScores.length; ++i)
      {
         newScores[i-1] = oldScores[i];
      }
      newScores[newScores.length-1] = oldScores[0];

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}