import java.util.*;
public class LetterArrayInReverseOrder {
   
   // This method reverses contents of input argument arr.
   public char[] reverse(char[] arr) {
      char[] reverse = new char[arr.length];
      for (int i = 0; i < reverse.length; i++)
      {
         reverse[i] = arr[arr.length-i-1];
      }
      return reverse;
         
   }
   
   public static void main(String[] args) {
      Letters lettersObject = new Letters();
      char [] ch = {'a','b','c'};
      System.out.println(lettersObject.reverse(ch));  // Should print cba
   }
}