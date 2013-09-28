import java.util.*;
  
  
public class Player
{
	private static Scanner keys = new Scanner(System.in);
	private String name;
	
	public Player()
	{
		name = keys.nextLine();
	}
	
	public boolean guess(char[] word, String wholeWord)
	{
		int i = 0;
		char guess;
		String input;
		int size = word.length;
		char[] myGuess = new char[size];
		int tries = size + 5;
			
		while(i<tries)
		{
			System.out.print("The word is " + size + " letters. You have " + tries + " tries.");
			System.out.print("Select a letter: ");
			input = keys.nextLine();
			input = input.toUpperCase();
			guess = input.charAt(0);
			for(int a = 0; a < size; a++)
			{
				if(guess == word[a])
				{
					myGuess[a] = guess;
				}		
			}
			if(Arrays.equals(myGuess,word))
			{
				System.out.print("Correct, the word was " + wholeWord + "\n");
				return true;
			}
			i++;
		}
		System.out.print("Sorry, the word was " + wholeWord + "\n");
		return false;
	}
}