import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysVowelCharactersSortingArrays { 
  public static void main(String[] args) {
	char vowels[] = {'e', 'u', 'a', 'o', 'i'};
	
	// Arrays.sort(vowels); //Begins from first letter to last in order. 
	
	// This will sort only from u to o. [e, a, o, u, i]
	int startingIndex = 1;
	int endingIndex = 4;
	
	Arrays.sort(vowels, startingIndex, endingIndex);
	System.out.println(Arrays.toString(vowels)); //This will print the entire array as it is listed above.
  }
}
    
