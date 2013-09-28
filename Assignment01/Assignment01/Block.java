/**    
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2011.12.28.01
  *  @since 2011.12.28
  *  Rectangle
  *  
  */

public class Block
{
   // instance variables (fields)
   private double length;
   private double width;
	private double height;
   // class variables (fields)

   // constructors
   public Block()
   {
      length = 2;
      width = 1;
		height = 2;
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
	
	public double getHeight()
	{
		return height;
	}
   
   public void setLength(double len)
   {
      length = len;
   }
   
   public void setWidth(double wid)
   {
      width = wid;
   }
   
	public void setHeight(double hei)
	{
		height = hei;
	}
	
   public double calculateSurfaceArea()
   {
      return length * width * height;
   }
   
   public boolean isCube()
   {
      return length == width && length == height;
   }
   
   public String toString()
   {
      return "Rectangle:\n  Length = " + length + "\n  Width = " + 
              width + "\n Height: " + height + "\n  Surface Area = " + calculateSurfaceArea() +
              "\n  Is a cube = " + isCube();
   }

}
















