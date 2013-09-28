/**    
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2011.12.28.01
  *  @since 2011.12.28
  *  Rectangle
  *  
  */

public class Rectangle
{
   // instance variables (fields)
   private double length;
   private double width;
   // class variables (fields)

   // constructors
   public Rectangle()
   {
      length = 2;
      width = 1;
   }   
   // instance methods
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public void setLength(double len)
   {
      length = len;
   }
   
   public void setWidth(double wid)
   {
      width = wid;
   }
   
   public double calculateArea()
   {
      return length * width;
   }
   
   public boolean isSquare()
   {
      return length == width;
   }
   
   public String toString()
   {
      return "Rectangle:\n  Length = " + length + "\n  Width = " + 
              width + "\n  Area = " + calculateArea() +
              "\n  Is a square = " + isSquare();
   }

}















