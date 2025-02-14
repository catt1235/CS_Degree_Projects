
public class arrayOutputPrintsInReverseOrder {
   public static void main (String [] args) {
      final int NUM_ELEMENTS = 3;
      int [] userVals = new int[NUM_ELEMENTS];
      int i;
   
      userVals[0] = 3;
      userVals[1] = 6;
      userVals[2] = 8;
   
      for (i = userVals.length - 1; i >= 0; --i) {
         System.out.println(userVals[i]);
      }
   }
}