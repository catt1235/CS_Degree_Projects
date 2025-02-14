import java.util.ArrayList;
import java.util.Comparator;
public class ArraysUsingForEachLoops {
  public static void main(String[] args) {
	  
	ArrayList<Integer> numbers = new ArrayList<Integer>();  
	
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);

  System.out.println("before: " + numbers.toString());
    
	numbers.forEach(number -> {
    numbers.set(numbers.indexOf(number), number * 2); // getting the index of the current value of the number variable and updating its element with the multiplier
	//	System.out.println(number * 2);
	});
	
	// System.out.pintln(number.toString()); // print values
	System.out.println("after: " + numbers.toString());
  }
}