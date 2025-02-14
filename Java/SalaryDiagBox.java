 import javax.swing.JOptionPane;
 public class SalaryDiagBox
 {
   public static void main(String[] args)
   {
	  String wageString, dependentsString;
	  double wage, weeklyPay;
	  int dependents;
	  final double HOURS_IN_WEEK = 40;
	  
      wageString = JOptionPane.showInputDialog(null, "Employee's hourly wage", "WAGE DIALOG BOX", JOptionPane.INFORMATION_MESSAGE);
	  
	  //parseDouble() converts wageString to numeric value
	  weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
	  
	  //parseDouble() converts dependentsString to numeric value
	  dependentsString = JOptionPane.showInputDialog(null, "How many dependents do you have?", "DEPENDENTS DIALOG BOX", JOptionPane.QUESTION_MESSAGE);
	  dependents = Integer.parseInt(dependentsString);
	  JOptionPane.showMessageDialog(null, "Weekly salary is $ " + weeklyPay + "\nDeductions wil be made for " +
	  dependents + " dependents", "SALARY BOX", JOptionPane.INFORMATION_MESSAGE);

   }
}