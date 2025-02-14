import java.util.Arrays; //This will allow you to convert arrays to strings.

class ArraysVowelCharacters {  //The point of arrays is to store multiple values within a single variable.
  public static void main(String[] args) {
	  char vowels[] = new char[5]; 	//Declare an array of characters and store the vowels in the english character. 
									//The 5 is the length of the array. There are 5 vowels in english language. You now have the array, however, it is still completely empty.
									
									
	// a e i o u (Each of these will have a number associated with them. The number is called the index. (0, 1, 2, 3, etc...)
	vowels[0] = 'a'; 	//This is the index of the array "0" and value you want to save array. 
						//So you are essentially assigning "a" to the index "0" or the first position within the array.
	vowels[1] = 'e';
	vowels[2] = 'i';
	vowels[3] = 'o';
	vowels[4] = 'u';
	
	/*
	You do not have to list the arrays as you see above. You can also run arrays like below. 
	
	  char vowels[] = {'a', 'e', 'i', 'o', 'u'};
	*/
	
	System.out.println(vowels[2]);  //This will print 'i' Before you can print the entire array, you will need to convert it to a string value.
	
	System.out.println(Arrays.toString(vowels)); //This will print the entire array.

  }
}
    
