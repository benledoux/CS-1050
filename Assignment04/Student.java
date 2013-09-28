/* Ben LeDoux
	CS 1050
	4/5/12
	Assignment04
	*/
	
	import java.util.*;
	
	public class Student
	{
		private String name;
		private ArrayList<Double> tests;
		private static Scanner keys = new Scanner(System.in);
		
		public Student()
		{
			tests = new ArrayList<Double>();
			this.name = name;
			this.tests = tests;
		}
		
		public Student(String name)
		{
			this.name = name;
			tests = new ArrayList<Double>();
		}
		
		
		public void setScore(double score, Student stu)
		{
			stu.tests.add(score);
		}
		
		public String grades(ArrayList<Student> stu)
		{
			String str = "";
			
			for(int index =0; index < tests.size(); index++)
			{
				str += " " + tests.get(index);
			}
			return str;	
		}
		
		public Double high(ArrayList<Student> stu)
		{
			if(tests.size() == 0)
			{
				return 0.0;
			}
			double high = tests.get(0);
			
			for(int h=1; h < tests.size(); h++)
			{
				if(tests.get(h) > high)
				{
					high = tests.get(h);
				}
			}
			
		return high;
		}
		
		public Double low(ArrayList<Student> stu)
		{
			if(tests.size() == 0)
			{
				return 0.0;
			}
			double low = tests.get(0);
			
			for(int l=1; l < tests.size(); l++)
			{
				if(tests.get(l) < low)
				{
					low = tests.get(l);
				}
			}
			return low;
		}
		
		public Double total(ArrayList<Student> stu)
		{
			double total = 0;
			if(tests.size() == 0)
			{
				return 0.0;
			}
			for(int a=0; a < tests.size(); a++)
			{
				total = total + tests.get(a);
			}
			return total;
		}
		
		public String toString(ArrayList<Student> stu)
		{   	
			return name + grades(stu) + "\n" + "Tests: " + tests.size() + " High score: " + high(stu) + " Low score: " + low(stu) + " Total: " + total(stu); 
		}
		
	}
