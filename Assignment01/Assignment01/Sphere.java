/**    
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2011.12.28.01
  *  @since 2011.12.28
  *  Sphere
  *
  *  This class is used to create and work with Sphere objects
  *
  */

import java.util.Scanner;

public class Sphere
{
   // instance data
   private double radius;
   private Scanner stdIn;
      
   // constructor(s)
   public Sphere()
   {
      radius = 1;
      stdIn = new Scanner(System.in);
   }
   
   public Sphere(double r)
   {
      radius = r;
      stdIn = new Scanner(System.in);
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public void setRadius(double r)
   {
      radius = r;
   }
   
   public double calculateVolume()
   {
      double volume = 4.0/3.0 * Math.PI * radius * radius * radius;
      return volume;
   }
   
   public double calculateSurfaceArea()
   {
      return 4.0 * Math.PI * Math.pow(radius, 2.0);   
   }
   
   public void askForRadius()
   {
      System.out.print("Enter the radius: ");
      radius = stdIn.nextDouble();
      stdIn.nextLine();
   }
   
   public void outputInfo()
   {
      System.out.println("Sphere info:");
      System.out.println(" Radius = " + getRadius());
      System.out.println(" Volume = " + calculateVolume());
      System.out.println(" Surface area = " + calculateSurfaceArea());
   }
}


