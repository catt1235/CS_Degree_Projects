import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysIntegersCopying {  //Only works on sorted arrays.
  public static void main(String[] args) {

	int numbers[] = {1, 2, 3, 4, 5};
	
	//  int copyOfNumbers[] = numbers; //does not actually make a copy, it is still pointing to the same value.
	int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
	
	int copyOfNumbers[] = Arrays.copyOf(numbers, 10); 	// <-- will make the last print statement print [1, 2, 3, 4, 5, 0, 0, 0, 0, 0] . If you add a 5 instead of a 10, the out will be
														// [0, 0, 0, 0, 0]
														// [1, 2]
	/*
	This will copy ONLY within the specified index. 
    OUTPUT -->  [0, 0, 0, 0, 0]
				[2, 3, 4]
  
	
	int startingIndex = 1;
	int endingIndex = 4;
	
	int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
	*/
	
	Arrays.fill(numbers, 0);
	
	System.out.println(Arrays.toString(numbers));   // will print [0,0,0,0,0]
	System.out.println(Arrays.toString(copyOfNumbers); // will print [1, 2, 3, 4, 5]
  }
}