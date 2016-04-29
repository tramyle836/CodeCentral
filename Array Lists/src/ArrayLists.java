import java.util.ArrayList;

public class ArrayLists
	{
		static ArrayList<Double>myArray = new ArrayList<Double>();
		public static void main(String args[])	
			{
				fiveDoubles();
				totalNumber();
				averageSum();		
			}
		public static void fiveDoubles()
		{
			myArray.add(8.8);
			myArray.add(10.0);
			myArray.add(12.0);
			myArray.add(14.0);
			myArray.add(20.0);
			System.out.println(myArray);
		}	
		public static void totalNumber()
		{
			double sum = 0;
			for (int i = 0; i < myArray.size(); i++)
			{
				sum = sum + myArray.get(i);
			}
			System.out.println("The sum of these numbers is " + sum);
		}
		public static void averageSum()
		{
			myArray.remove(0);
			System.out.println("These are with the first number deleted. ");
			for (int i = 0; i < myArray.size(); i++)
				{
					
					System.out.println(myArray.get(i));
				}
			myArray.add(4.0);
			myArray.add(6.0);
			System.out.println("These are with two more numbers added. ");
			for (int i = 0; i < myArray.size(); i++)
				{
					
					System.out.println(myArray.get(i));
				}
		
			double sum = 0;
			double average = 0;
			for (int i = 0; i < myArray.size(); i++)
				{
					sum = sum + myArray.get(i);
				}
				System.out.println("The sum of these numbers is " + sum);
				average = sum/myArray.size();
				System.out.println("The average of these numbers is " + average);
		}
	}
