import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysVowelCharactersSearchArrays {  //Only works on sorted arrays.
  public static void main(String[] args) {

	char vowels[] = {'e', 'u', 'a', 'o', 'i'};
	
	Arrays.sort(vowels); //Begins from first letter to last in order. 
	
	// Search within an Index.
	int startingIndex = 1;
	int endingIndex = 4;
	
	char key = 'o';
	
	int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);  //This will return the integer of the index IF THE ITEM IS FOUND! vowels is the array, key is the item.)
	
	System.out.println(Arrays.toString(vowels)); //This will print the entire array as it is listed above.
	System.out.println(foundItemIndex); //will print 3 (If you search for a character that is not in the array, the output will be negative values. 
  }
}
    
