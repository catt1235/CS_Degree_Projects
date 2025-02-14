public class arrayOutputPrintsNegativeValuesOnly {
   public static void main (String [] args) {
      final int NUM_ELEMENTS = 4;
      int [] userVals = new int[NUM_ELEMENTS];
      int i;
   
      userVals[0] = -1;
      userVals[1] = 4;
      userVals[2] = 5;
      userVals[3] = -8;
   
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] < 0) {
            System.out.println(userVals[i]);
         }
      }
   }
}