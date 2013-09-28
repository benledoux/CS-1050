import java.util.*;

public class hangman
{

private char[] word;
private String wholeWord;
private Player player1;
private Player player2;
private static Scanner keys = new Scanner(System.in);


public hangman()
{
	System.out.print("First player: ");
	player1 = new Player();
	System.out.print("Second player: ");
	player2 = new Player();
}

public void run()
{
	boolean done = false;
	
	while(!done)
	{
	System.out.print("Player 1, enter your word(Type quit to stop): ");
	wholeWord = keys.nextLine();
	wholeWord = wholeWord.toUpperCase();
	if(wholeWord.equals("quit"))
	{
		break;
	}
	word = wholeWord.toCharArray();
	player1.guess(word,wholeWord);
	System.out.print("Player 2, enter your word(Type quit to done): ");
	wholeWord = keys.nextLine();
	wholeWord = wholeWord.toUpperCase();
	if(wholeWord.equals("quit"))
	{
		done = true;
	}
	word = wholeWord.toCharArray();
	player2.guess(word,wholeWord);
	}
}

public static void main(String[] args)
{
	hangman hang = new hangman();
	hang.run();
}

}