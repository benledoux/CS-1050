/**    
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2012.01.23.01
  *  ObjectTester
  *  
  */

import java.util.Scanner;

public class ObjectTester
{
   // instance variables (fields)
   
   public Scanner stdIn;
	  
   // constructors
   public ObjectTester()
   {
      stdIn = new Scanner(System.in);
   }   
   // instance methods
   public String getInputString()
   {
      System.out.print("Enter a String: ");
      return stdIn.nextLine();
   }
   
   public int getInputInt()
   {
      System.out.print("Enter an int: ");
      return Integer.parseInt(stdIn.nextLine());
   }
   
   public double getInputDouble()
   {
      System.out.print("Enter a double: ");
      return Double.parseDouble(stdIn.nextLine());
   }
   
   public char getInputChar()
   {
      System.out.print("Enter a char: ");
      return stdIn.nextLine().charAt(0);
   }
   
   public void testSphere()
   {
      System.out.println("\n================ BEGIN Testing Sphere Class ===============");
      System.out.println("Create a Sphere object, sphere1, using No-Arg Constructor");
      Sphere sphere1 = new Sphere();
      System.out.println("Examine the object sphere1 using the outputInfo() method");
      sphere1.outputInfo();
      System.out.println("Create a Sphere object, sphere2, using Constructor with an argument of 3.3");
      Sphere sphere2 = new Sphere(3.3);
      System.out.println("Examine the object sphere2 using the outputInfo() method");
      sphere2.outputInfo();
      System.out.println();
      
      System.out.println("Change the radius of sphere1 using setRadius(4.1) method");
      sphere1.setRadius(4.1);
      System.out.println("Check sphere1 with the get radius() method to see that the radius is 4.1");      
      System.out.println("Get the radius");
      double r = sphere1.getRadius();
      System.out.println("The radius is " + r);
      System.out.println();
      
      System.out.println("Test the calculateSurfaceArea() method for sphere2");
      sphere2.outputInfo();
      double area = sphere2.calculateSurfaceArea();
      System.out.println("The surface area of sphere2 is " + area);
      System.out.println();
      
      System.out.println("Test the calculateVolume() method for sphere1");
      sphere1.outputInfo();
      double volume = sphere1.calculateVolume();
      System.out.println("The volume of sphere1 is " + volume);
      System.out.println();
            
      System.out.println("Creating yet another Sphere object");
      Sphere sphere3 = new Sphere(2.0);
      sphere3.outputInfo();
      System.out.println("------------------------------------");
      System.out.println("The info for the three spheres");
      System.out.println("------------------------------------");
      sphere1.outputInfo();
      sphere2.outputInfo();
      sphere3.outputInfo();
      System.out.println("================ END Testing Sphere Class ===============\n");
   }
   
   public void testRectangle()
   {
  		Rectangle rect1 = new Rectangle();
		System.out.println("\n================ BEGIN Testing Rectangle Class ===============");
   	
		double len = getInputDouble();
		rect1.setLength(len);
		
		double wid = getInputDouble();
		rect1.setWidth(wid);
		
		System.out.println(rect1.toString());
		
		   
   
      System.out.println("================ END Testing Rectangle Class ===============\n");   
   }

   public void testDie()
   {
  		Die first = new Die();    
		System.out.println("\n================ BEGIN Testing Die Class ===============");
      
		System.out.println("Press 1 and hit enter to roll a 6-sided die");
		int num1 = Integer.parseInt(stdIn.nextLine());
		
		while(num1 != 1)
		{
			System.out.println("Press 1 and hit enter to roll a 6-sided die");
			num1 = Integer.parseInt(stdIn.nextLine());
		}
		
		first.roll();
		
		System.out.println("\n" + "You rolled a " + first.getFaceValue());
		
		System.out.println("Now, please input the number of sides you would like a die to have: ");
		num1 = Integer.parseInt(stdIn.nextLine());
		
		Die second = new Die(num1);
		
		second.roll();
		
		System.out.println("\n" + "Rolling your " + num1 + " sided die, you rolled " + second.getFaceValue() + ".");
			
		
		
		
      System.out.println("================ END Testing Die Class ===============\n");   
   }
   
   public void testDice()
   {
      System.out.println("\n================ BEGIN Testing Dice Class ===============");
      Dice objects = new Dice();
		
		System.out.println("Press 1 and hit enter to roll your dice");
		int num1 = Integer.parseInt(stdIn.nextLine());
		
		while(num1 != 1)
		{
			System.out.println("Press 1 and hit enter to roll your dice");
			num1 = Integer.parseInt(stdIn.nextLine());
		}
 
		objects.roll();
		
		if(objects.isDoubles() == true)
		{
			System.out.println("You scored doubles! Your rolled a " + objects.getDie1FaceValue() + " and a " + objects.getDie2FaceValue());
		}
		
		else
		{
			System.out.println("You rolled a " + objects.getDie1FaceValue() + " and a " + objects.getDie2FaceValue());
		}
			
   
      System.out.println("================ END Testing Dice Class ===============\n");   
   }
   
   public void testBlock()
   {
  		Block bloc1 = new Block();
      System.out.println("\n================ BEGIN Testing Block Class ===============");
  
   	
		double len = getInputDouble();
		bloc1.setLength(len);
		
		double wid = getInputDouble();
		bloc1.setWidth(wid);
		
		double hei = getInputDouble();
		bloc1.setHeight(hei);
		
		System.out.println(bloc1.toString());
    
		 
      System.out.println("================ END Testing Block Class ===============\n");   
   }

   
   // class methods
   public static void main(String[] args)
   {
      ObjectTester myTester = new ObjectTester();
      myTester.testSphere();
      myTester.testRectangle();
		myTester.testDie();
		myTester.testDice();
		myTester.testBlock();
   }
}



















