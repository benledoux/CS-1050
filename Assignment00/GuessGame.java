/**
  * @author Ben LeDoux
  * @version 2012.01.17.01
  * @since 2012.01.17
  * Program00
  */
  
  import java.util.Random;
  public class GuessGame
  {
  // instance variables (fields)
  		private Player player1;
		private Player player2;
		private int targetNumber;
		private static Random randomGenerator = new Random();
		
	public GuessGame()
	{
		System.out.println("First player:");
		player1 = new Player();
		System.out.println("Second Player:");
		player2 = new Player();
		targetNumber = randomGenerator.nextInt(10) +1;
	}
	
	// instance methods
	public void run()
	{
		System.out.println("I'm thinking of a number between 1 and 10...");
		
		boolean done = false;
		int attempts = 0;
		boolean player1IsRight = false, player2IsRight = false;
		
		while(!done)
		{
			attempts++;
			System.out.println("Guess Number: " + attempts);
			
			player1.guess();
			player2.guess();
			
			System.out.println(player1.getName() + " guessed " + player1.getGuess());
			System.out.println(player2.getName() + " guessed " + player2.getGuess());
			
			if(player1.getGuess() == targetNumber)
			{
				player1IsRight = true;
			}
			if(player2.getGuess() == targetNumber)
			{
				player2IsRight = true;
			}
			
			if(player1IsRight || player2IsRight)
			{
				System.out.println("We have a winner!");
				System.out.println("The target number was: " + targetNumber);
				if(player1IsRight)
				{
					System.out.println(player1.getName() + " got it right!!!");
				}
				else
				{
					System.out.println(player2.getName() + " got it right!!!");
				}
				System.out.println("Game is over.");
				done = true;
			}
			else
			{
				System.out.println("Sorry! No one guessed correctly -- try again!!");
			}
		}
	}
}

			