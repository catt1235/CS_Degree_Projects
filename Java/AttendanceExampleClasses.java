package Java;

public class AttendanceExampleClasses {
   public static void main(String[] args) {
      PeopleCounter attendeeCounter = new PeopleCounter();
      
      attendeeCounter.incrementCount();
      attendeeCounter.incrementCount();
      attendeeCounter.incrementCount();
      
      System.out.print("Attendee count: ");
      attendeeCounter.incrementCount();
   }
}

/*

A class defines a type that groups data and methods to form an object. A class' 
public methods define the operations that can be performed on objects of that class type. 
The class definition (discussed later) is like a blueprint explaining how to create objects and an instruction manual explaining how to use an object.

The below code creates an object attendeeCounter using a class named PeopleCounter, with relevant code highlighted below.

*/