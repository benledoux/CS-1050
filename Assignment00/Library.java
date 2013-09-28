/* Ben LeDoux
	Assigment03
	CS 1050
	03/06/12
	*/
	
	import java.util.*;
	
	public class Library
	{
		private Patron pat;
		
			public void run()
			{
					Scanner keys = new Scanner(System.in);
					pat.login();
					boolean quitter = true;
		
					while(quitter == true)
					{
						System.out.println("\n" +
						"(W)ithdraw            (D)eposit\n" +
						"(B)alance             (Q)uit");
						System.out.print("What would you like to do today?");
						String input = keys.nextLine();
						input = input.toUpperCase();
						char choice = input.charAt(0);
			
						switch (choice)
						{
						case 'W':
						{
							break;
						}
				
						case 'D':
						{
							break;
						}
				
						case 'B':
						{
							break;
						}
				
						case 'Q':
						{
							break;
						}
						default:
						{
							break;
						}
				
			}
		}      
	}
}