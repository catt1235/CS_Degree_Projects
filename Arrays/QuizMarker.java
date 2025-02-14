import java.util.Scanner;

public class QuizMarker {

   //   method takes two parameters: 
   // - an integer array scoreVals that contains the quiz scores
   // - an integer quizThres that represents the pass threshold
   public void passFail(int[] scoreVals, int quizThres) {
      int i;

      for (i = 0; i < scoreVals.length; ++i) {
          System.out.print(scoreVals[i]);
          System.out.print(" ");
		  
		  //Each score in this if condition is compared to the pass threshold.
          if (scoreVals[i] >= quizThres) {
            System.out.println("p");
          }
          else {
            System.out.println("f");
          }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      QuizMarker quizzes = new QuizMarker();
	  
	  // Define the number of scores to read in
	  // This means that the value cannot be changed after it is initialized
	  // means that the user will be asked to enter exactly three quiz scores.	  
	  final int NUM_SCORES = 3;
	  
      int[] quizScores = new int[NUM_SCORES];
	  
	  // int threshold refers to the pass threshold for the quiz scores.
	  // = 6 means that any score equal to or greater than 6 will be considered a pass.
	  // represents the minimum score a student needs in order to pass. 
      int threshold = 6;
      int i;

	  // Will run exactly three times.
      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      quizzes.passFail(quizScores, threshold);
   }
}