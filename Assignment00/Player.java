/**
  * @author Ben LeDoux
  * @version 2011.01.19.2011
  * @since 2011.01.19
  * Program00
  */
  
  import java.util.Scanner;
  public class Player
  {
  // class variables (fields)
  private static Scanner stdIn = new Scanner(System.in);
  
  // instance variables (fields)
  private String name;
  private int guess; // where the guess goes
  
  // constructor
  public Player()
  {
  		System.out.print("What's your name? ");
		name = stdIn.nextLine();
	}
	
	// instance methods
	public void guess()
	{
		System.out.print(name + ", Guess a whole number between 1 and 10 inclusive: ");
		guess = Integer.parseInt(stdIn.nextLine());
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGuess()
	{
		return guess;
	}
}