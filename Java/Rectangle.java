package Java;
 
public class CallRectangle {
   public static void main(String[] args) {
      Rectangle myRectangle = new Rectangle();

      myRectangle.setSize(1, 4);
      if (myRectangle.getArea() != 4) 
	  {
         System.out.println("FAILED getArea() for 1, 4");
      }
      if (myRectangle.getPerimeter() != 10) 
	  {
         System.out.println("FAILED getPerimeter() for 1, 4");
      }

      myRectangle.setSize(2, 6);
      if (myRectangle.getArea() != 12) 
	  {
         System.out.println("FAILED getArea() for 2, 6");
      }
      if (myRectangle.getPerimeter() != 16) 
	  {
         System.out.println("FAILED getPerimeter() for 2, 6");
	  }
   }
}
public class Rectangle {
	private int height;
	private int width;
	
	public void setSize(int heightVal, int widthVal) 
	{
		height = 4;
		height = 4;
	}
	public int getArea() 
	{
		return height * width;
	}
	public int getPerimeter() 
	{
		return (height * 2) + (width * 2);
	}
}