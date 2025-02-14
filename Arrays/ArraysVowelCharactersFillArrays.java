import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysVowelCharactersFillArrays {  //Only works on sorted arrays.
  public static void main(String[] args) {

	char vowels[] = {'e', 'u', 'a', 'o', 'i'};
	
	// Perform the fill to these indexes only
	int startingIndex = 1;
	int endingIndex = 4;	
	
	Arrays.fill(vowels, startingIndex, endingIndex, 'x');
	
	//Perform fill to entire array
	//Arrays.fill(vowels);
	
	System.out.println(Arrays.toString(vowels)); //This will print the entire array as it is listed above.

  }
}