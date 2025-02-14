import java.util.Scanner;

public class ArrayTraversal {
	
   //Calls the method printScoreVals which takes an array of integers as an argument and prints each element of the array to the console.
   public void printScoreVals(int[] scoreVals) {
      int i;
	  
	  
	  //		LOOP EXPLAINED ***************************
	  // Iterates over the elements of the scoreVals array and prints each element to the console using the System.out.println() method.
	  // i = 0; The initialization statement initializes the variable i to 0.
	  // i < scoreVals.length; The condition statement checks if i is less than the length of the scoreVals array.
	  // ++i) The update statement increments i by 1 at the end of each iteration of the loop.
	  
      for (i = 0; i < scoreVals.length; ++i) {
         System.out.println(scoreVals[i]);
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayTraversal quizzes = new ArrayTraversal();
	  
	  // Define the number of scores to read in
	  // This means that the value cannot be changed after it is initialized
	  // means that the user will be asked to enter exactly three quiz scores.
      final int NUM_SCORES = 3;
	    
	  // Reads 3 integers from the user using the Scanner class and stores them in an array called quizScores.
	  // Creates an integer array to hold the quiz scores.
	  // Will run exactly three times
	  int[] quizScores = new int[NUM_SCORES];
      int i;

	  //		LOOP EXPLAINED ***************************
	  //Used to read in the three integer values from the user using the Scanner.nextInt() method. 
	  //It iterates over the quizScores array, assigning each element the value entered by the user.
	  
	  // i = 0; The initialization statement initializes the variable i to 0.
	  // i < quizScores.length; The condition statement checks if i is less than the length of the quizScores array.
	  // ++i) The update statement increments i by 1 at the end of each iteration of the loop.
	  
      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }
        
	  // Print out the quiz scores using the printScoreVals method
      quizzes.printScoreVals(quizScores);
   }
}

/*
CODE BASICALLY TAKES CUSTOMER INPUT AND CREATES AND ARRAY.
*/