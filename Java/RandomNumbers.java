package Java;

import java.util.Random;

public class RandomNumbers {
	
   private int var1;
   private int var2;
   private int var3;
   
   public int getVar1()
   {
      return var1;
   }
   
   public int getVar2()
   {
      return var2;
   }
   
   public int getVar3()
   {
      return var3;
   }
   
   public void setRandomValues(int low, int high)
   {
	   
	  //To generate random numbers, start by making the instance of the class
      Random rand = new Random();
	  
	  //This assigns the variables var1, var2 and var3, to the value of a random number
      var1 = rand.nextInt(high - low + 1) + low;
      var2 = rand.nextInt(high - low + 1) + low;
      var3 = rand.nextInt(high - low + 1) + low;
   }
   
   public void getRandomValues()
   {
      System.out.println("Random values: " + var1 + " " + var1 + " " + var3);
   }
}

// Use the formula Math.floor(Math.random() *(max - min + 1) + min) to generate values with the min and the max value inclusive.