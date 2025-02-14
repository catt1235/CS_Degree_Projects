package Java;

import java.util.Scanner;

/* Program that has a conversation with the user. 
   Uses a if-else statements and a random number (sort of) 
   to mix up the program's responses. */

public class ConversationUsingWhileLoops {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int randNum;       // Random number 0 to 3
      String userText;      // User input

      System.out.println("Tell me something about yourself.");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.println();
      System.out.print("> ");

      userText = scnr.nextLine();

      while (!userText.equals("Goodbye")) {
         randNum = userText.length() % 4; // "Random" num. %4 ensures 0-3 (Takes the character length and performs remainder math. The result depends on the message. 
		 //For example, if use enters "Ouch"..it is 4 characters long. 4 % 4 = 0. Message displayed would be "Please expalin further."
		 //For example, if use enters "Bye"..it is 3 characters long. 3 % 4 = 1 remainder 3. Message displayed would be "What else can you share?"
		 
         System.out.println();

         if (randNum == 0) {
            System.out.println("Please explain further.");
         }
         else if (randNum == 1) {
            System.out.println("Why do you say: \"" + userText + "\"?");
         }
         else if (randNum == 2) {
            System.out.println("I don't think that's right.");
         }
         else if (randNum == 3) {
            System.out.println("What else can you share?");
         }
         else {
            System.out.println("Uh-oh, something went wrong. Try again.");
         }
         System.out.println();
                   System.out.print("> ");
         userText = scnr.nextLine();
      }
      System.out.println();

      System.out.println("It was nice talking with you. Goodbye.");
	  
	  //If the user plans to type "I'm hungry", "You are weird", "Goodbye", and "I like you".
	  //After the second iteration, the user typed "Goodbye". The while loop condition will be 
	  //false, and so the third iteration will not execute. The additional inputs are not relevant.
   }
}


/*

Tell me something about yourself.
You can type "Goodbye" at anytime to quit.


> I'm 26 years old.

Why do you say: "I'm 26 years old."?

> Well, I was born 26 years ago.

I don't think that's right.

> I am sure it is correct.

Please explain further.

> Goodbye
It was nice talking with you. Goodbye.
*/