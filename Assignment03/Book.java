/* Ben LeDoux
	Assigment03
	CS 1050
	03/06/12
	*/

	import java.util.*;

public class Book
{
		private String title;
		private String Author;
		private boolean available;

		// Book constructor
		
		public Book(String t, String a, boolean av)
		{
			title = t;
			Author = a;
			available = av;
		}
		
		public String toString()
		{
			String book;
			if(available == true)
			{
				book = title + " by " + Author + " is checked in.";
			}
			else
			{
				book = title + " by " + Author + " is checked out.";
			}
			return book;

		}
	
	
	public boolean checkout()
	{
		if(available == false)
		{
			System.out.println("Sorry, that book is already checked out.");
			return false;
		}
		available = false;
		return available;
	}
	
	public boolean checkin(ArrayList<Book> books, String getbook)
	{
		
		for(int index = 0; index < books.size(); index++)
      {
         String str = books.get(index).toString() + "is checked out.";
			if(getbook.equals(str))
			{
				available = true;
			}		 
      }
		return available;
	}
	
	public String title()
	{
		return title; 	
	}
	
	public String author()
	{
		return Author;
	}
	
	public boolean searchauthor(String authorbook, ArrayList<Book> books)
	{
		for(int index = 0; index < books.size(); index++)
      {
         String str = books.get(index).author();
			if(authorbook.equals(str))
			{
				return true;
			}		 
      }
		return false;
	}
	
	public boolean searchtitle(String titlebook, ArrayList<Book> books)
	{
		int index = 0;
		while(index < books.size())
      {
         String str = books.get(index).title();
			if(titlebook.equals(str))
			{
				return true;
			}		
			else
			{
				index++;
			} 
      }
		return false;
	}
	
	public String getBooks(ArrayList<Book> books)
	{
		String str = "Books:\n";
      for(int index = 0; index < books.size(); index++)
      {
         str += index + ": " + books.get(index).toString() + "\n";
      }
      return str;
	}		
}
