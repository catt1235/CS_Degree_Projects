import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysVowelCharactersReplaceCharacterInArray {  //The point of arrays is to store multiple values within a single variable.
  public static void main(String[] args) {
	 // char vowels[] = new char[5]; //No longer needed, see why below.
	
	//	You do not have to list arrays individually like in file ArraysVowelCharacters. You can also run arrays like below. 
	
	char vowels[] = {'a', 'e', 'i', 'o', 'u'};  //The array will infer it's length from the number of values you are defining it with.
	
	//To replace 'i' with 'x' 
	vowels[2] = 'x';
	
	System.out.println(vowels[2]);  //This will print 'i' Before you can print the entire array, you will need to convert it to a string value.
	
	System.out.println(Arrays.toString(vowels)); //This will print the entire array.
	
	System.out.println(vowels.length); //will show you the length of the array. The length is considered a property of the array. 

  }
}
    
