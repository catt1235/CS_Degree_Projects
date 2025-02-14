import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysIntegersComparingArrays {  //Only works on sorted arrays.
  public static void main(String[] args) {

	int numbers[] = {1, 2, 3, 4, 5};

	int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

	
	System.out.println(Arrays.toString(Arrays.equals(numbers, copyOfNumbers)); //output will be true

  }
}