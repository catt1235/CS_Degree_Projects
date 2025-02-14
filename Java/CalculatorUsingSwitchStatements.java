package Java;

import java.util.Scanner;

class CalculatorUsingSwitchStatements {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the first number: ");
  double number1 = scanner.nextDouble();
  scanner.nextLine();

  System.out.print("Enter the second number: ");
  double number2 = scanner.nextDouble();
  scanner.nextLine();
    
  System.out.print("What operation do you want to perform? ");
  String operation = scanner.nextLine();

  switch (operation) {
  case "sum":
    System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    break;
	  
  case "sub":
    System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    break;
	  
	case "mult":
	 System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
	 break;
	
	case "div":
	   if(number2 == 0) {
			System.out.println("Cannot divide by zero.");
		} else {
			System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
   }
	break;
	 
    default:
      System.out.print("This is not a supported operation.");
}
    	scanner.close(); 
	}
}
    
