import java.util.Scanner;

public class ScoreAdjuster {

// quizzes.updateScoreVals(quizScores, scoreUpdate) passes scoreVals as a reference 
// to quizScores and initializes updateVal with scoreUpdate. 
// updateScoreVals() modifies quizScores by adding scoreUpdate to all elements. In this case adding 3 to the value.
   public void updateScoreVals(int[] scoreVals, int updateVal) {
      int i;

      for (i = 0; i < scoreVals.length; ++i) {
          scoreVals[i] = scoreVals[i] + updateVal;
      }
   }
   public void printScoreVals(int[] scoreVals) {
       int i;

       for (i = 0; i < scoreVals.length; ++i) {
           System.out.println(scoreVals[i]);
       }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_SCORES = 4;
      ScoreAdjuster quizzes = new ScoreAdjuster();
      int[] quizScores = new int[NUM_SCORES];
      int scoreUpdate = 3;
      int i;

      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      quizzes.updateScoreVals(quizScores, scoreUpdate);
      quizzes.printScoreVals(quizScores);
   }
}