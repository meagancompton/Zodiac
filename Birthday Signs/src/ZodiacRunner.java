import java.util.ArrayList;
import java.util.Scanner;

public class ZodiacRunner
	{
		public static void main(String[] args)
			{
				ArrayList<Birthday>zodiac = new ArrayList<Birthday>();
				System.out.println("what is the number of your birth month?");
				Scanner userInput1 = new Scanner(System.in); 
				int birthdayMonth = userInput1.nextInt();
				System.out.println("What is the number of the day you were born?");
				Scanner userInput2 = new Scanner(System.in);
				int birthdayDay = userInput2.nextInt();
				zodiac.add(new Birthday (birthdayMonth, birthdayDay));
				
//				System.out.println(zodiac);
				
				if ((zodiac.get(0).getMonth() == 3 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 4 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 19 ))
							{
								System.out.println("aries");
							}
					
				else if ((zodiac.get(0).getMonth() == 4 && zodiac.get(0).getDate() >= 20 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 5 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("taurus");
							}
					
				else if ((zodiac.get(0).getMonth() == 5 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 6 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("gemini");
							}
					
				else if ((zodiac.get(0).getMonth() == 6 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 7 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("cancer");
							}

				else if ((zodiac.get(0).getMonth() == 7 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 8 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("leo");		
							}
					
				else if ((zodiac.get(0).getMonth() == 8 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 9 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("virgo");
							}
					
				else if ((zodiac.get(0).getMonth() == 9 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 10 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("libra");
							}
					
				else if ((zodiac.get(0).getMonth() == 10 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 11 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 21 ))
							{
								System.out.println("scorpio");
							}
					
				else if ((zodiac.get(0).getMonth() == 11 && zodiac.get(0).getDate() >= 22 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 12 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 21 ))
							{
								System.out.println("sagittarius");
							}
					
				else if ((zodiac.get(0).getMonth() == 12 && zodiac.get(0).getDate() >= 22 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 1 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 19 ))
							{
								System.out.println("capricorn");
							}
					
				else if ((zodiac.get(0).getMonth() == 1 && zodiac.get(0).getDate() >= 20 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 2 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 18 ))
							{
								System.out.println("aquarius");
							}
					
				else if ((zodiac.get(0).getMonth() == 2 && zodiac.get(0).getDate() >= 19 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 3 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("pisces");
							}
			}
	}

