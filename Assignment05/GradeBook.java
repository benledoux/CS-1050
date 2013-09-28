/* Ben LeDoux
	CS 1050
	4/5/12
	Assignment04
	*/
	
	import java.util.*;
	import javax.swing.JFileChooser;
	import java.io.*;
	
	public class GradeBook
	{
		private ArrayList<Student> students;
		private static Scanner keys = new Scanner(System.in);
		private JFileChooser chooser = new JFileChooser();
		private File file;

				
		public GradeBook()
		{
			students = new ArrayList<Student>();	
		}
		
		public void addStudent(Student stu)
		{
			students.add(stu);	
		}
		
		public void populateStudent()
      {
    	    System.out.print("Would you like to (I)nput names or (R)ead from a file?");
			 String input = keys.nextLine();
			 String name;
			 StringTokenizer toke;
			 input = input.toUpperCase();
			 char choice = input.charAt(0);
			 if(choice == 'I')
			 {
			 		
			 }
			 if(choice == 'R')
			 {
			 	int status = chooser.showOpenDialog(null);
				if(status == JFileChooser.APPROVE_OPTION)
				{
					try
					{
						String line;
						File file = chooser.getSelectedFile();
						Scanner reader = new Scanner(file);
						while(reader.hasNext())
						{
							line = reader.nextLine();
							toke = new StringTokenizer(line, " ");
							name = toke.nextToken();
							Student stu = new Student(name);
							addStudent(stu);
							while(toke.hasMoreTokens())
							{
								double score = Double.parseDouble(toke.nextToken());
								stu.setScore(score, stu);
							}
						}
						reader.close();
					}
					
					catch (IOException e)
               {
                  System.out.println(e.getMessage());
                  e.printStackTrace();
               }
										
				}
				else
				{
						System.out.println("User cancelled - no file selected.");
				}
			}
			 		 	    
			 
			 System.out.print("Enter student's first name (enter quit to end): ");
     		 name = keys.nextLine();
			 Student stu = new Student(name);

			 while(name.contains(" "))
				{
					 System.out.print("No spaces, please enter student's name (enter quit to end): ");
  		   		 name = keys.nextLine();
	         }
     

     		 while(!name.equalsIgnoreCase("quit"))
    	 	 {
				stu = new Student(name);
				addStudent(stu);
   			System.out.print("Score (Enter -1 to end): ");
   	      double score = Double.parseDouble(keys.nextLine());
				while(score > 100 || score < -1)
				{
					System.out.print("Not a valid score, try again: ");
					score = Double.parseDouble(keys.nextLine());
				}
				while(score != -1)
				{      
					stu.setScore(score, stu);
					System.out.print("Score (Enter -1 to end): ");
   	      	score = Double.parseDouble(keys.nextLine());
					while(score > 100 || score < -1)
					{
						System.out.print("Not a valid score, try again: ");
						score = Double.parseDouble(keys.nextLine());
					}	
				}
      	   System.out.print("Enter next student name (enter quit to end): ");
     	 	   name = keys.nextLine();
				while(name.contains(" "))
				{
					 System.out.print("No spaces, please enter student's name (enter quit to end): ");
  		   		 name = keys.nextLine();
	         }
    	  }
		  System.out.println(getStudents());
		  saveFile();
   	}
		
	   public void saveFile()
      {
         String currentDir = System.getProperty("user.dir");
         JFileChooser chooser = new JFileChooser(currentDir);
         int status = chooser.showSaveDialog(null);
         if(status == JFileChooser.APPROVE_OPTION)
         {
            try
            {
               File file = chooser.getSelectedFile();
               PrintWriter writer = new PrintWriter(file);
               for(int index =0; index < students.size(); index++)
               {
                  writer.println(students.get(index).writeString(students));
               }
               writer.close();
            }
               catch (IOException e)
               {
                  System.out.println(e.getMessage());
                  e.printStackTrace();
               }
         }
         else
         {
            System.out.println("Save File dialog cancelled");
         }
      }
      
		public String getStudents()
		{
				String str = "Students:\n";
      		for(int index = 0; index < students.size(); index++)
      		{
      	 	  str += index + ": " + students.get(index).toString(students) + "\n";
      		}
				return str;
		}

		public void run()
		{
			populateStudent();		
		}
		
		public static void main(String[] args) throws IOException
		{
			GradeBook grade = new GradeBook();
			grade.run();
		}
	}
