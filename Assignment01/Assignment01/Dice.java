/**    
  *  @author Noel LeJeune \ Ben LeDoux
  *  @version  2011.10.13.01
  *  @since 2011.10.11
  *  Dice
  *  
  */

public class Dice
{
   private Die die1, die2;
   
   public Dice()
   {
      die1 = new Die(6);
      die2 = new Die(6);
   }
   
   public void roll()
   {
      die1.roll();
      die2.roll();
   }
   
   public boolean isDoubles()
   {
      return die1.getFaceValue() == die2.getFaceValue();
   }
   
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }  
}

