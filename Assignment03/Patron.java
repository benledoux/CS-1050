/* Ben LeDoux
	Assigment03
	CS 1050
	03/06/12
	*/

	import java.util.*;

public class Patron
{
	private String name;
	private String password;
	private boolean librarian;
	private ArrayList<String> checkedout;
	
	// Constructing the Patron
	
				
		public Patron(String n, String p, boolean l, ArrayList<String> checkout)
		{
			checkedout = new ArrayList<String>();
			name = n;
			password = p;
			librarian = l;
			checkedout = checkout;
		}
	
	public void newPass(String pass)
	{
		password = pass;
		System.out.println("Your new password is " + password);
	}
	public String toString()
	{
		String patron;
		patron = name + " " + password;
		return patron;
	}
	
	public boolean listofpatrons()
	{
		if(librarian == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String getPatrons(ArrayList<Patron> patrons)
	{
		String str = "Patrons:\n";
      for(int index = 0; index < patrons.size(); index++)
      {
         str += index + ": " + patrons.get(index).AccountInfo() + "\n";
      }
      return str;
	}
	
	public String booktostring(int checkin)
	{
		return checkedout.get(checkin);
	}
	
	public String AccountInfo()
	{
		String str = "Books: \n";
		for(int index = 0; index < checkedout.size(); index++)
      {
         str += index + ": " + checkedout.get(index).toString() + "\n";
      }
		return "Name: " + name + "\n" + "Librarian: " + librarian + "\n" + "Password: " + password + "\n" + str;		
	}		
	
	public void checkIn(int checkinnum)
	{
		checkedout.remove(checkinnum);
		System.out.print(checkinnum + " has been checked in.");
	}
	
	public void checkout(String book)
	{
		checkedout.add(book);
	}
	
	public int login(ArrayList<Patron> patrons)
	{
			Scanner keys = new Scanner(System.in);
			System.out.print("Username: ");
			String u = keys.nextLine();
			System.out.print("Password: ");
			String p = keys.nextLine();
			String login = u + " " + p;
			for(int i=0; i<patrons.size(); i++)
			{
				String temp = patrons.get(i).toString();
				if(login.equals(temp))
				{
					return i;
				}
				
			}
			
			int a = 0;
			while(a < 3)
			{
				System.out.println("I'm sorry, your username and/or password does not exist, please try again.");
				System.out.print("Username: ");
				u = keys.nextLine();
				System.out.print("Password: ");
				p = keys.nextLine();
				login = u + " " + p;
				for(int i=0; i<patrons.size(); i++)
				{
					String temp = patrons.get(i).toString();
					if(login.equals(temp))
					{
						return i;
					}
				}
				a++;
			}
			
					System.out.println("Invalid username and or password");
					System.exit(0);

					return 0;
	}
}
