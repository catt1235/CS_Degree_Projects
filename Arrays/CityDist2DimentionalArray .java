//					Two-dimensional arrays
// An array can be declared with two dimensions. int[][] myArray = new int[R][C] represents a table of int variables with R rows and C columns, 
// so R*C elements total. For example, int[][] myArray = new int[2][3] creates a table with 2 rows and 3 columns, for 6 int variables total. 
//Example accesses are myArray[0][0] = 33; or num = myArray[1][2].


// Ex: int[][] myArray = new int[2][3] allocates a 2-element array,


import java.util.Scanner;

/* Direct driving distances between cities, in miles */
/* 0: Boston  1: Chicago  2: Los Angeles */
public class CityDist2DimentionalArray {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cityA;                                 // Starting city
      int cityB;                                 // Destination city
      int [][] drivingDistances = new int[3][3]; // Driving distances

      // Initialize distances array
	  //EX :  numVals[4][2] = 99;  assigns 99 into the fifth row, third column of array numVals.
      drivingDistances[0][0] = 0;
      drivingDistances[0][1] = 960;  // Boston-Chicago
      drivingDistances[0][2] = 2960; // Boston-Los Angeles
      drivingDistances[1][0] = 960;  // Chicago-Boston
      drivingDistances[1][1] = 0;
      drivingDistances[1][2] = 2011; // Chicago-Los Angeles
      drivingDistances[2][0] = 2960; // Los Angeles-Boston
      drivingDistances[2][1] = 2011; // Los Angeles-Chicago
      drivingDistances[2][2] = 0;

      System.out.println("0: Boston 1: Chicago  2: Los Angeles");

      System.out.print("Enter city pair (Ex: 1 2) -- ");
      cityA = scnr.nextInt();
      cityB = scnr.nextInt();

      if ((cityA >= 0) && (cityA <= 2) && (cityB >= 0) && (cityB <= 2)) {
         System.out.print("Distance: " + drivingDistances[cityA][cityB]);
         System.out.println(" miles.");
      }
   }
}

/*
A programmer can initialize a two-dimensional array's elements during declaration using nested braces

// Initializing a 2D array
int[][] numVals = { {22, 44, 66}, {97, 98, 99} };

// Use multiple lines to make rows more visible
int[][] numVals = {
      {22, 44, 66}, // Row 0
      {97, 98, 99}  // Row 1
};
*/