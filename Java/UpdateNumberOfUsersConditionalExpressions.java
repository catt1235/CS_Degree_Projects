import java.util.Scanner;

public class UpdateNumberOfUsersConditionalExpressions {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numUsers;
      int updateDirection;

      numUsers = scnr.nextInt();
      updateDirection = scnr.nextInt();

      updateDirection = (updateDirection == 1) ? ++numUsers: --numUsers;

      System.out.println("New value is: " + numUsers);
   }
}