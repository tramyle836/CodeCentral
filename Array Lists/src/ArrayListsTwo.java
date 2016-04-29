import java.util.ArrayList;

public class ArrayListsTwo
	{
		static ArrayList<Double>fever = new ArrayList<Double>();
		public static void main(String args[])	
			{
				tenDoubles();
				feverPeopleCount();
				convertCelsius();	
				removeNames ();
			}
		public static void tenDoubles()
		{
			fever.add(102.8);
			fever.add(98.0);
			fever.add(97.8);
			fever.add(101.0);
			fever.add(103.8);
			fever.add(100.0);
			fever.add(99.8);
			fever.add(90.8);
			fever.add(96.4);
			fever.add(92.9);
			for (int i = 0; i < fever.size(); i++)
				{
					System.out.println(fever.get(i) + " degrees Fahrenheit");
				}	
		}	
		public static void feverPeopleCount()
		{
		int sum = 0;
		for (int i = 0; i < fever.size(); i++)
			{
				if (fever.get(i) > 98.6)
			{
			sum++;
			}
		}
		System.out.println("There are " + sum + " people with a fever.");
		}
		
		public static void convertCelsius()
		{
			for (int i = 0; i < fever.size(); i++)
				{
					System.out.println((fever.get(i) - 32)/ 1.8 + " degrees Celsius");
				}
		}
		public static void removeNames ()
		{
			for (int i = fever.size() - 1 ; i > 0; i--)
				{
					if (fever.get(i) > 98.6)
					{
						fever.remove(i);
					}
				}
			for (int i = fever.size() - 1 ; i > 0; i--)
				{
					System.out.println(fever.get(i) + " degrees Fahrenheit");
							
					if (fever.get(i) < 98.6 && fever.get(i) > 97.8)
					{
						System.out.println("The person with the highest temperature is " +fever.get(i) + " degrees Fahrenheit");
					}
					
				}
			for (int i = fever.size() - 1 ; i > 0; i--)
				{
							
					if (fever.get(i) < 91.0 && fever.get(i) > 90.5)
						{
							System.out.println("The person with the lowest temperature is " + fever.get(i) + " degrees Fahrenheit");
						}
				}
		}
	}
