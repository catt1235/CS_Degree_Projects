import java.util.ArrayList;
import java.util.Comparator;  // Need to import this for sorting Array Lists
public class DynamicArraysInsertingtoList {
  public static void main(String[] args) {
	  
	ArrayList<Integer> numbers = new ArrayList<Integer>();  
	
	//int double float boolean etc... < -- Primitive Types
	//Below are reference type form using "reference wrapper classes" of the primitive data types seen above. You cannot use the primitive types in Array Lists
	// Integer Double Float Boolean etc...
	
	numbers.add(1); //Insert a new item in the array list.
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	
	int sum = 0;
	
	numbers.clear(); //Will clear out entire array list.
	number.sort(Comparator.naturalOrder()); // Sort in its natural order. Please import util, see above.
	number.sort(Comparator.reverseOrder()); // Sort in the reverse order. 
	numbers.set(2, Integer.valueOf(4)); //Will replace the number in the position/index 2, which is the number 3... with the number 4.
	numbers.remove(2); //Will remove the number in position/index 2, which is the number 3
	numbers.remove(Integer.valueOf(4)); //Will remove the number 4. 

	System.out.println(numbers.size());// If you need to know how many elements are inside an array list. 
	System.out.println(numbers.contains(Integer.valueOf(1))); // Will search list and print either true or false.
	System.out.println(numbers.isEmpty());	// Will check if there are any elements in the array list. Prints true or false.
	System.out.println(numbers.get()); //Will print full list
	System.out.println(numbers.get(0)); //Will read array list and print the one in the index indicated
	
	
    }
}

//LIMITATIONS ON AN REGULAR ARRAY LISTS: You cannot resize them! But you can create dynamic arrays.
//Array list can store anything, boolean, string, etc...