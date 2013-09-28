/**    
  *  @author Ben LeDoux
  *  @version 2012.02.23.12
  *  Account
  *  
  */
  
  import java.util.Scanner;
  import java.util.Random;
  import java.text.DecimalFormat;
 
   public class Account
   {
     	private String name;
      private int account;
      private double balance;
      private boolean valued;
      public Scanner stdIn;
		private static Random randomGenerator = new Random();
		private static DecimalFormat formatter = new DecimalFormat("#0.00");
   	
      public Account()
      {
         account = 0;
         balance = 0.0;
         valued = false;
         stdIn = new Scanner(System.in);
      
      }
   	
		public void setName()
		{
			System.out.println("In order to open your account, please enter your name: ");
			name = stdIn.nextLine();

			account = randomGenerator.nextInt(100000) +1;
		}
		
		public void getAccountInfo()
		{
			System.out.println(name + ", your account number is " + account + "\n" +
			"Your balance is $" + formatter.format(balance));
		}
		
		
   	public void deposit(double d)
      {
         while (d<=0.0)
         {
            System.out.println("Your deposit cannot be less that 0, please make a valid deposit: ");
            d = Double.parseDouble(stdIn.nextLine());
         }
         if(d>=1000.0)
         {
            balance += d;
				System.out.println("Your have deposited $" + formatter.format(d) + ", making your balance $" + formatter.format(balance) + ".");
         }
         else
         {
            balance += (d-2);
				System.out.println("Your have deposited $" + formatter.format(d) + ", making your balance $" + formatter.format(balance) + "after the standard $2.00 deposit fee.");
         }
			if(balance>=10000.0)
			{
				valued = true;
				System.out.println("Congratulations, now that your account is above $10,000.00, you are considered a valued customer.");
			}
		}
      
   	public void withdraw(double w)
		{
			if(balance == 0)
			{
				System.out.println("Your account is at 0, no money can be withdrawn at this time.");
				return;
			}
			
			while (w>=balance)
			{
				System.out.println("Your account cannot be 0, please choose another amount to withdraw: ");
				w = Double.parseDouble(stdIn.nextLine());
			}
			if(valued==true)
			{
				balance -= w;
				System.out.println("You have withdrawn $" + formatter.format(w) + ", making your balance $" + formatter.format(balance) + ".");
				if(balance<10000.0)
				{
					valued = false;
				}
				return;
			}
			else
			{
				balance -= (w+5);
			}
			if(balance<10000.0)
			{
				valued = false;
				System.out.println("You have withdrawn $" + formatter.format(w) + ", making your balance $" + formatter.format(balance) + " after the standard $5.00 withdraw fee.");
			}
		}	
   	
   }



