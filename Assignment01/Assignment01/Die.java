/**  
  
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2011.12.29.01
  *  @since 2011.12.29
  *  Die
  */

import java.util.Random;
public class Die
{
   // instance variables (fields)
   private int sides;
   private int faceValue;
   private Random rand;

   // constructors
   public Die()
   {
      sides = 6;
      rand = new Random();
   }
   
   public Die(int n)
   {
      sides = n;
      rand = new Random();
   }   


   // instance methods
   public int roll()
   {
      faceValue = rand.nextInt(sides) + 1;
      return faceValue;
   }
   
   public int getFaceValue()
   {
      return faceValue;
   }
   
}
