package Java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author katherine.munoz
 */
public class DemoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       double[] salaries = new double[4];
       
       salaries[0] = 16.25;
       salaries[1] = 17.55;
       salaries[2] = 18.25;
       salaries[3] = 19.85;
       
       System.out.println("Salaries one by one are: ");
       System.out.println(salaries[0]);
       System.out.println(salaries[1]);
       System.out.println(salaries[2]);
       System.out.println(salaries[3]);       
    }
}

/*
OUTPUT: 
Salaries one by one are: 
16.25
17.55
18.25
19.85
*/
