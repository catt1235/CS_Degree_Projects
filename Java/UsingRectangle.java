import java.awt.Rectangle;

public class UsingRectangle {
   public static void main(String[] args) {

      Rectangle redRect = new Rectangle(20, 20, 60, 20);

	  //method changes the width and height
      redRect.setSize(120, 20);
	  
	  //repositions the Rectangle by the specified distances in the X and Y direction
	  //	- Ex: translate(30, 40) moves the rectangle to the right 30 units and downward 40 units.
	  //	- Ex: translate(0, -40) moves the rectangle moves -40 units along the y-axis, which is 40 units upwards.
      redRect.translate(40, 40);
	  
	  //method changes the location of the upper left corner
      redRect.setLocation(10, 160);

      Rectangle blueRect = new Rectangle(150, 30, 40, 100);
      blueRect.translate(-75, 0);   
   }
}


/*
Upper left corner (40, 80), the rectangle's width(100), and the rectangle's height(120)
 
 Ex: new Rectangle(40, 80, 100, 120)
*/