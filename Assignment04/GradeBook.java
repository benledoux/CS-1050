/* Ben LeDoux
	CS 1050
	4/5/12
	Assignment04
	*/
	
	import java.util.*;
	
	public class GradeBook
	{
		private ArrayList<Student> students;
		private static Scanner keys = new Scanner(System.in);
				
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
    	    String name;		 	    
			 System.out.print("Enter student's first name (enter quit to end): ");
     		 name = keys.nextLine();

			 while(name.contains(" "))
				{
					 System.out.print("No spaces, please enter student's name (enter quit to end): ");
  		   		 name = keys.nextLine();
	         }
     

			 Student stu = new Student(name);
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
		
		public static void main(String[] args)
		{
			GradeBook grade = new GradeBook();
			grade.run();
		}
	}