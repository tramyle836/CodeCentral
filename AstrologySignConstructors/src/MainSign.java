import java.util.ArrayList;
	import java.util.Scanner;

	public class MainSign
		{
			static ArrayList<AstrologySignConstructor>sign = new ArrayList<AstrologySignConstructor>();
			static Scanner userInput = new Scanner(System.in);
			public static void main(String[] args)
				{
					allSigns();
					yesOrNoPrimary();
					askPersonality();
					askPersonalityTwo();
					askPersonalityThree();
					askPersonalityFour();
					month();
					printList();
				}
			public static void allSigns()
				{
					sign.add(new AstrologySignConstructor ("Aries", "march", "april"));
					sign.add(new AstrologySignConstructor ("Taurus", "may", "april"));
					sign.add(new AstrologySignConstructor ("Gemini", "may", "june"));
					sign.add(new AstrologySignConstructor ("Cancer", "july","june"));
					sign.add(new AstrologySignConstructor ("Leo", "august", "july"));
					sign.add(new AstrologySignConstructor ("Virgo", "august", "september"));
					sign.add(new AstrologySignConstructor ("Libra", "september", "october"));
					sign.add(new AstrologySignConstructor ("Scorpio", "october", "november"));
					sign.add(new AstrologySignConstructor ("Sagittarius", "november", "december"));
					sign.add(new AstrologySignConstructor ("Capricorn", "december", "january"));
					sign.add(new AstrologySignConstructor ("Aquarius", "february", "january"));
					sign.add(new AstrologySignConstructor ("Pisces", "february", "march"));
				}
			public static void yesOrNoPrimary()
				{
					System.out.println("In this game, I am going to guess your astrology sign based on the answers that you give me to these simple yes or no questions!");;
					System.out.println("Alright let's get started...");
				}
			public static void askPersonality()
				{
					System.out.println("First question, would you consider yourself to be creative, and strong-willed? ");
					String response = userInput.nextLine();
					
					if (response.equals("yes"))
						{
							System.out.println("Do you feel that you are forgiving?");
						}
					else if (response.equals("no"))
						{
						System.out.println("Do you pay close attention to details and react accordingly? ");
						}
					else 
						{
						System.out.println("Please type yes or no!");
						}
				}
			public static void askPersonalityTwo()
				{
					String response = userInput.nextLine();
					
					if (response.equals("yes"))
						{
							System.out.println("Are you into adventures and consider yourself ambitious? ");
						}
					else if (response.equals("no"))
						{
						System.out.println("Do you tend to try to cover up your emotions?");
						}
					else 
						{
						System.out.println("Please type yes or no!");
						}
				}
			public static void askPersonalityThree()
				{
					String response = userInput.nextLine();
					
					if (response.equals("yes"))
						{
							System.out.println("Do you often try to find a balance in each situation?");
						}
					else if (response.equals("no"))
						{
						System.out.println("Do you tend to act quite passive-agressive?");
						}
					else 
						{
						System.out.println("Please type yes or no!");
						}
				}
			public static void askPersonalityFour()
				{
					String response = userInput.nextLine();
					
					if (response.equals("yes"))
						{
							System.out.println("Do you get easily distracted?");
						}
					else if (response.equals("no"))
						{
						System.out.println("Are you get annoyed easily?");
						}
					else 
						{
						System.out.println("Please type yes or no!");
						}
				}
			public static void month()
				{
				boolean error = true;


				while(error == true)

				{
				String months = userInput.nextLine();
				if (months.equals("yes") || (months.equals("no")))
				{
						System.out.println("What month were you born in?");
				}

				

				String month = userInput.nextLine();

				if(month.equals("january") || month.equals("January"))

				{

				System.out.println("Were you born before the 20?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

				System.out.println("You are " + sign.get(9).getSign());

				}

				else

				{

				System.out.println("You are " + sign.get(10).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("February") || month.equals("february"))

				{

				System.out.println("Were you born before the 19?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(10).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(11).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("March") || month.equals("march"))

				{

				System.out.println("Were you born before the 20?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(11).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(0).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("April") || month.equals("april"))

				{

				System.out.println("Were you born before the 21?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(0).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(1).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("May") || month.equals("may"))

				{

				System.out.println("Were you born before the 20?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(1).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(2).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("June") || month.equals("june"))

				{

				System.out.println("Were you born before the 21?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(2).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(3).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("July") || month.equals("july"))

				{

				System.out.println("Were you born before the 23?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(3).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(4).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("August") || month.equals("august"))

				{

				System.out.println("Were you born before the 23?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(4).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(5).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("September") || month.equals("september"))

				{

				System.out.println("Were you born before the 22?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(5).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(6).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("October") || month.equals("october"))

				{

				System.out.println("Were you born before the 22?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(6).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(7).getSign());

				}

				error = false;

				}

				 

				else if(month.equals("November") || month.equals("november"))

				{

				System.out.println("Were you born before the 22?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(7).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(8).getSign());

				}

				error = false;

				}

				else if(month.equals("December") || month.equals("december"))

				{

				System.out.println("Were you born before the 22?");

				String choice1 = userInput.nextLine();

				 

				if(choice1.equals("yes") || choice1.equals("Yes"))

				{

					System.out.println("You are " + sign.get(8).getSign());

				}

				else

				{

					System.out.println("You are " + sign.get(9).getSign());

				}

				error=false;

				}
			}
		}
			public static void printList()
				{
					System.out.println("Great! Now check below for whether or not the sign that I guessed is accurate and match them!");
					for (int i = 1; i < 12; i++)
								{
									System.out.println(i);
								}
							
					for (AstrologySignConstructor s : sign)
						{
							
									System.out.println(s.getSign());
										
						}
					System.out.println();
								
						
							System.out.println("(1) March 21 - April 19");

							System.out.println("(2) April 20 - May 20");

							System.out.println("(3) May 21 - June 21 ");
							
							System.out.println("(4) June 21 - July 22 ");
							
							System.out.println("(5) July 23 - August 22 ");
							
							System.out.println("(6) August 23 - September 22 ");
							
							System.out.println("(7) September 23 - October 22 ");
							
							System.out.println("(8) October 23 - November 21 ");
							
							System.out.println("(9) November 22 - December 21 ");
							
							System.out.println("(10)December 22 - January 19 ");

							System.out.println("(11)January 20 - February 18  ");

							System.out.println("(12)February 19 - March 20 ");
							
							int choice = userInput.nextInt();

							if (choice == 1)
								{	
									System.out.println(sign.get(0).getSign());
								}	
							if (choice == 2)
								{
									System.out.println(sign.get(1).getSign());
								}
							if (choice == 3)
								{
									System.out.println(sign.get(2).getSign());
								}
							if (choice == 4)
								{
									System.out.println(sign.get(3).getSign());
								}
							if (choice == 5)
								{
									System.out.println(sign.get(4).getSign());
								}
							if (choice == 6)
								{
									System.out.println(sign.get(5).getSign());
								}
							if (choice == 7)
								{
									System.out.println(sign.get(6).getSign());
								}
							if (choice == 8)
								{
									System.out.println(sign.get(7).getSign());
								}
							if (choice == 9)
								{
									System.out.println(sign.get(8).getSign());
								}
							if (choice == 10)
								{
									System.out.println(sign.get(9).getSign());
								}
							if (choice == 11)
								{
									System.out.println(sign.get(10).getSign());
								}
							else if (choice == 12)
								{
									System.out.println(sign.get(11).getSign());
								}
							
							
						}
					
				
				
}