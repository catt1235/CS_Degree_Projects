import java.util.Scanner;

public class Salary {                         
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int hourlyWage;
      int workHoursPerWeek;      
      int workWeeksPerYear;
      int annualSalary; 
      int monthlySalary; 

      final int monthsPerYear = 12;
      //monthsPerYear = 99;
      workHoursPerWeek = 0;      
      workWeeksPerYear = 0;
      
      System.out.println("Enter hourly wage: ");
      hourlyWage = scnr.nextInt();

      // FIXME: Get user input values for workHoursPerWeek and workWeeksPerYear
      System.out.println("Enter hours per week: ");
      workHoursPerWeek = scnr.nextInt();
      System.out.println("Enter weeks per year ");
      workWeeksPerYear = scnr.nextInt();


      annualSalary = hourlyWage * workHoursPerWeek * workWeeksPerYear;
      System.out.print("Annual salary is: ");         
      System.out.println(annualSalary);  
      
      // TODO: Change monthsPerYear to the final variable that uses the standard naming
      monthlySalary = (hourlyWage * workHoursPerWeek * workWeeksPerYear) / monthsPerYear;
      System.out.print("Monthly salary is: ");
      System.out.println(monthlySalary); 
   } 
}