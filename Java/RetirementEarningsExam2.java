package Java;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Katherine Munoz
 */
public class RetirementEarningsExam2 {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	

		int STARTING_SALARY = 0;
		int RETIRE_AGE = 62;
		String name;
		int age;
		int i;
		int retirement = 0;

		
		System.out.println("Enter user(your first name): ");
		name = input.nextLine();
		System.out.println("\n");
	
		System.out.println("Enter your age: ");
		age = input.nextInt();
		System.out.println("\n");
		
		System.out.println("Enter starting salary: ");
		STARTING_SALARY = input.nextInt();
		System.out.println("\n");
		
		int startingSalary = STARTING_SALARY;
		for (i = age; i <= RETIRE_AGE; i++)
		{
			startingSalary = (int)Math.round(startingSalary * 1.03);
			retirement = retirement + startingSalary;
		}
		
		NumberFormat money = NumberFormat.getNumberInstance(Locale.US);
                money.setGroupingUsed(true);
	
		System.out.println("Enter user(your first name): " + name);
		System.out.println("Enter age: " + age);
		System.out.println("Enter starting salary: $" + money.format(STARTING_SALARY));
		System.out.println(name + " will have earned around $" + money.format(retirement) + " at age " + RETIRE_AGE);
	}
}

/*OUTPUT When I enter example info:
Enter user(your first name): Steven
Enter age: 45
Enter starting salary: $50,000
Steven will have earned around $1,205,834 at age 62

OUTPUT When I enter my info:
Enter user(your first name): Kat
Enter age: 41
Enter starting salary: $50,000
Kat will have earned around $1,572,632 at age 62
 
*/