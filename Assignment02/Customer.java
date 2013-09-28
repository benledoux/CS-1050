/**    
  *  @author Ben LeDoux
  *  @version 2012.02.23.12
  *  Account
  *  
  */

import java.util.Scanner;  

public class Customer
{

Account acc = new Account();
	public void run()
	{
		Scanner keys = new Scanner(System.in);
		acc.setName();
		acc.getAccountInfo();
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
				System.out.print("How much would you like to withdraw: ");
				double w = Double.parseDouble(keys.nextLine());
				acc.withdraw(w);
				break;
				}
				
			case 'D':
				{
				System.out.print("How much would you like to deposit: ");
				double d = Double.parseDouble(keys.nextLine());
				acc.deposit(d);
				break;
				}
				
			case 'B':
				{
				acc.getAccountInfo();
				break;
				}
				
			case 'Q':
				{
				quitter = false;
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

