/* Ben LeDoux
	Assigment03
	CS 1050
	03/06/12
	*/
	
	import java.util.ArrayList;
	import java.util.Scanner;
		
	public class Library
	{
	
			private ArrayList<Patron> patrons;
			private static ArrayList<Book> books;
			private ArrayList<String> checkin;
			private static Scanner keys;

			
			public Library()
			{
				patrons = new ArrayList<Patron>();
				patronlist();
				books = new ArrayList<Book>();
				bookindex();
			}
			
	public void patronlist()
	{
			
			checkin = new ArrayList<String>();
			patrons.add(new Patron("Johnny Walker", "itsjohnny", false, checkin));
			patrons.add(new Patron("Mick Foley", "cactus", false, checkin));
			patrons.add(new Patron("Hunter Hearst-Helmsley", "trips", false, checkin));
			patrons.add(new Patron("Sheldon Cooper", "bazinga", true, checkin));

	}

		// Hard coded Books
	public void bookindex()
	{
		books.add(new Book("I Hope They Serve Beer in Hell", "Tucker Max", true));
		books.add(new Book("Hilarity Ensues", "Tucker Max", true));
		books.add(new Book("Sloppy Seconds", "Tucker Max", true));
		books.add(new Book("Steve Jobs", "Walter Isaacson", true));
		books.add(new Book("About a Boy", "Nick Hornby", true));
		books.add(new Book("Dear 2600", "Emmanuel Goldstein", true));
		books.add(new Book("Go Ask Alice", "Anonymous", true));
		books.add(new Book("American Gods", "Neil Gaiman", true));
		books.add(new Book("Sex, Drugs, and Cocoa Puffs", "Chuck Klosterman", true));
		books.add(new Book("Love is a Mixtape", "Rob Sheffield", true));
		books.add(new Book("The Celebration Factor", "Scott Friedman", true));
		books.add(new Book("Foley is Good", "Mick Foley", true));
		books.add(new Book("The Raven", "Edgar Allen Poe", true));
		books.add(new Book("The Crow", "James O' Barr", true));
	}
	
	
	public void run()
	{
		Library lib = new Library();
		Scanner keys = new Scanner(System.in);
		boolean quitter = true;
		
		int patnum = patrons.get(0).login(patrons);
		
		while(quitter == true)
		{
			System.out.println("\n" +
			"(C)atalog            (A)ccount\n" +
			"(L)ist of Patrons    (S)earch\n(Q)uit");
			System.out.print("What would you like to do today?");
			String input = keys.nextLine();
			input = input.toUpperCase();
			char choice = input.charAt(0);
			
			switch (choice)
			{
			case 'S':
			{
				System.out.println("Search by (t)itle or (a)uthor?");
				input = keys.nextLine();
				input = input.toUpperCase();
				char choice2 = input.charAt(0);
				switch(choice2)
				{
				case 'T':
				{
					System.out.println("What is the title? ");
					String title = keys.nextLine();
					boolean exist = false;
					
					exist = books.get(0).searchtitle(title, books);
					
					if(exist == true)
					{
						System.out.println(title + " is in our system.");
						break;
					}
					else
					{
						System.out.println(title + " does not exist.");
					}
					break;
				}
				case 'A':
				{
					System.out.println("Who is the author? ");
					String auth = keys.nextLine();
					boolean exist = false;
					
					exist = books.get(0).searchauthor(auth, books);
					
					if(exist == true)
					{
						System.out.println(auth + " is in our system.");
						break;
					}
					else
					{
						System.out.println(auth + " does not exist.");
					}
					break;
				}
				}
			break;
			}	
			case 'L':
			{
				boolean li = patrons.get(patnum).listofpatrons();
				if(li == true)
				{
					System.out.println(patrons.get(0).getPatrons(patrons));
				}
				else
				{
					System.out.println("Sorry, only librarians have this function.");
					break;
				}
				break;
				}
			case 'C':
				{
					System.out.println(books.get(0).getBooks(books));
					System.out.println("Select the number of the book you would like to check out: ");
					int booknum = Integer.parseInt(keys.nextLine());
					books.get(booknum).checkout();
					String book = books.get(booknum).toString();
					patrons.get(patnum).checkout(book);
					break;	
				}
				
			case 'A':
				{
					System.out.println(patrons.get(patnum).AccountInfo());
					System.out.println("Would you like to (C)hange password, (R)eturn a book, or (G)o back: ");
					input = keys.nextLine();
					input = input.toUpperCase();
					char choice1 = input.charAt(0);
					switch (choice1)
					{
					case 'R':
					{
						System.out.print("Which number would you like to return? ");
						int checkinnum = Integer.parseInt(keys.nextLine());
						String getbook = patrons.get(patnum).booktostring(checkinnum);
						books.get(0).checkin(books, getbook);
						patrons.get(patnum).checkIn(checkinnum);
						break;
					}
					case 'C':
					{
						System.out.print("New Password: ");
						String pass = keys.nextLine();
						patrons.get(patnum).newPass(pass);
						break;
					}
					case 'G':
					{
						break;
					}
					}
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
			
	public static void main (String[ ] args)
	{
		Library lib = new Library();
		lib.run();
	}

}