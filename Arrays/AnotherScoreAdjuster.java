import java.util.Scanner;

public class AnotherScoreAdjuster {

	// 3 Parameters
	// int[] scoreVals -> user input
	// int updateVal -> updates updatedScoreVals with scoreVals value leaving quizScores unchanged.
	
   public void updateScoreVals(int[] scoreVals, int updateVal) {
      int i;
      int[] updatedScoreVals = new int[scoreVals.length];

      for (i = 0; i < scoreVals.length; ++i) {
          updatedScoreVals[i] = scoreVals[i] + updateVal;
      }
      scoreVals = updatedScoreVals;
   }

   public void printScoreVals(int[] scoreVals) {
       int i;

       for (i = 0; i < scoreVals.length; ++i) {
           System.out.println(scoreVals[i]);
       }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      AnotherScoreAdjuster quizzes = new AnotherScoreAdjuster();
	  
	  //iterates 4 times
      final int NUM_SCORES = 4;
      int[] quizScores = new int[NUM_SCORES];
      int scoreUpdate = 1;
      int i;

      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      quizzes.updateScoreVals(quizScores, scoreUpdate);
      quizzes.printScoreVals(quizScores);
   }
}