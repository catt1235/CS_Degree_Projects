package Java;

 import javax.swing.JOptionPane;
 public class InputDiagBoxQuestion
 {
   public static void main(String[] args)
   {
	  String areaCode;
      areaCode = JOptionPane.showInputDialog(null, "What is your area code?", "Area code Information", JOptionPane.QUESTION_MESSAGE);
	  JOptionPane.showMessageDialog(null, "You have entered, " + areaCode + ". Is this correct?");

   }
}