import java.util.Scanner;
 
public class PostageCalcMultipleArrays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Weights in ounces
	  
	  //The program will visit letterWeights[7] which is 7. 
	  //Because 7.5 is not <= 7, the program will visit letterWeights[8] which is 8. Because 7.5 <= 8, the program will print postageCosts[i] which is 245.
	  
      double[] letterWeights = {1.0, 2.0, 3.0, 3.5, 4.0, 5.0, 6.0,
                                7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0};
      // Costs in cents (usps.com 2017) EX: postageCosts[2] represents the cost for a weight of 2 ounces. letterWeights[2] is 3, meaning postageCosts[2] corresponds to 3 ounces.
      int[] postageCosts = {49, 70, 91, 112, 161, 182, 203,
                            224, 245, 266, 287, 308, 329, 350};
      double userLetterWeight;
      boolean foundWeight;
      int i;
 
      // Prompt user to enter letter weight
      System.out.print("Enter letter weight (in ounces): ");
      userLetterWeight = scnr.nextDouble();
 
      // Postage costs is based on smallest letter weight greater than
      // or equal to mailing letter weight
      foundWeight = false;
 
      for (i = 0; (i < letterWeights.length) && (!foundWeight); ++i) { // depends on the value of the variable foundWeight. This expression 
																	   //prevents the loop from iterating through the entire array once the correct letter weight has been found
		  
		  // compares the user-entered letter weight with the current element in the letterWeights array.  
		  //If the entered weight is less than or equal to the current element in the letterWeights array, the program prints the element in postageCosts at the same index.
         if( userLetterWeight <= letterWeights[i] ) {
            foundWeight = true;
            System.out.print("Postage for USPS first class mail is ");
            System.out.print(postageCosts[i]);
            System.out.println(" cents");
         }
      }
 
      if( !foundWeight ) {
         System.out.println("Letter is too heavy for USPS " +
                            "first class mail.");
      }
   }
}