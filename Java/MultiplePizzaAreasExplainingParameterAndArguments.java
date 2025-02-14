package Java;

public class MultiplePizzaAreasExplainingParameterAndArguments {
 
   public void printPizzaArea(double pizzaDiameter) {  //A parameter is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.
      double pizzaRadius;
      double pizzaArea;
      double piVal = 3.14159265;
 
      // calculate pizza area given a diameter
      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = piVal * pizzaRadius * pizzaRadius; 
      
      // display results
      System.out.print(pizzaDiameter + " inch pizza is ");
      System.out.println(pizzaArea + " inches squared.");
   }
 
   public static void main (String [] args) {
      MultiplePizzaAreas pizzas = new MultiplePizzaAreas();
      pizzas.printPizzaArea(12.0);
      pizzas.printPizzaArea(16.0); 	// An argument is a value provided to a method's parameter during a 
									// method call. Ex: A pizza area method might be called as myPizza.printPizzaArea(12.0) or as myPizza.printPizzaArea(16.0).
									// An argument may be an expression, like 12.0, x, or x * 1.5.
   }
}

//A parameter is like a variable declaration. Upon a call, the parameter's memory location is allocated, 
// and the parameter is assigned with the argument's value. Upon return, the parameter is deleted from memory.


// This is an example of a statement that uses an object named topStudent to call a method named printAge,
// passing the value 21 as an argument. topStudent.printAge(21);    Another Ex: topStudent.methodName()