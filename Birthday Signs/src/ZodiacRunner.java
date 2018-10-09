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
				System.out.println("What is the number of your birthday?");
				Scanner userInput2 = new Scanner(System.in);
				int birthdayDay = userInput2.nextInt();
				zodiac.add(new Birthday (birthdayMonth, birthdayDay));
				
				//aries
				
				if ((zodiac.get(0).getMonth() == 3 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 4 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 19 ))
							{
								System.out.println("You are an aries!");
								System.out.println("Sign: Ram");
								System.out.println("A famous aries: Emma Watson");
								System.out.println("Aries personalities are independent. Being the first of the zodiac signs, \nthey venture out and are go-getters, often leading the way. Their upbeat and magnetic personality often \n3entices others to follow their lead because their personalities bring excitement into others lives.");
								
							}
				//taurus
					
				else if ((zodiac.get(0).getMonth() == 4 && zodiac.get(0).getDate() >= 20 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 5 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("You are a taurus!");
								System.out.println("Sign: Bull");
								System.out.println("A famous taurus: John Cena");
								System.err.println("Known for being reliable, practical, ambitious and sensual, the people born under the Zodiac Sign Taurus have\n an eye for beauty. They tend to be good with finances, and hence, make efficient financial managers. However, like everyone else, a Taurus also has both\n positive and negative traits.");
							}
				//gemini
					
				else if ((zodiac.get(0).getMonth() == 5 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 6 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("You are a gemini!");
								System.out.println("Sign: The Twins");
								System.out.println("A famous gemini: Kanye West");
								System.out.println(" Expressive and quick-witted, Gemini represents two different personalities \nin one and you will never be sure which one you will face. They are sociable, communicative and ready for fun, with a \ntendency to suddenly get serious, thoughtful and restless.");
							}
				//cancer
					
				else if ((zodiac.get(0).getMonth() == 6 && zodiac.get(0).getDate() >= 21 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 7 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("You are a cancer!");
								System.out.println("Sign: Crab");
								System.out.println("A famous cancer: Selina Gomez");
								System.out.println("Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. \nThey are very emotional and sensitive, and care deeply about matters of the family and their home. ... Those born with their Sun in Cancer are very loyal and \nable to empathize with other people's pain and suffering.");
							}
				//leo

				else if ((zodiac.get(0).getMonth() == 7 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 8 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("You are a leo!");
								System.out.println("Sign: Lion");
								System.out.println("A famous leo: Barack Obama");
								System.out.println("Warm, action-oriented and driven by the desire to be loved\n and admired, the Leo have an air royalty about them. They love to be in the limelight, which is why many of them make a career in the performing arts. \nThe personality of a Leo is made up of some positive as well as negative traits.");
							}
				//virgo
					
				else if ((zodiac.get(0).getMonth() == 8 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 9 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("You are a virgo!");
								System.out.println("Sign: The Maiden");
								System.out.println("A famous virgo: Beyonce");
								System.out.println("A Virgo personality is a mix of intelligence, attention to detail, common sense,\n and commitment, and a woman born with her in this sign is very smart, modest, and capable. Trying to seduce this woman can seem intimidating at first, \nfor she is likely to put on a facade of indifference.");
							}
				//libra
					
				else if ((zodiac.get(0).getMonth() == 9 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 10 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 22 ))
							{
								System.out.println("You are a libra!");
								System.out.println("Sign: The Scales");
								System.out.println("A famous libra: Zac Efron");
								System.out.println("The people born under the Sign Libra are kind, gentle and lovers of beauty,\n harmony and peace. However, in their effort to keep everyone happy, they find it difficult to say 'NO' to anyone, and as a result, they end up getting stressed.\n They have a lot of positive traits, but some negative ones, too.");
							}
				//scorpio
					
				else if ((zodiac.get(0).getMonth() == 10 && zodiac.get(0).getDate() >= 23 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 11 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 21 ))
							{
								System.out.println("You are a scorpio!");
								System.out.println("Sign: Scorpion");
								System.out.println("A famous scorpio: Drake");
								System.out.println("Scorpios are known by their calm and cool behavior, \nand by their mysterious appearance. People often say that Scorpio-born are fierce, probably because they understand very well \nthe rules of the universe.");
							}
				
				//sagittarius
					
				else if ((zodiac.get(0).getMonth() == 11 && zodiac.get(0).getDate() >= 22 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 12 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 21 ))
							{
								System.out.println("You are a sagittarius!");
								System.out.println("Sign: Centaur");
								System.out.println("A famous saggittarius: Nicki Minaj");
								System.out.println("Curious and energetic, Sagittarius is one of the biggest travelers \namong all zodiac signs. Their open mind and philosophical view motivates them to wander around the world in search of \nthe meaning of life. Sagittarius is extrovert, optimistic and enthusiastic, and likes changes.");
							}
				
				//capricorn
					
				else if ((zodiac.get(0).getMonth() == 12 && zodiac.get(0).getDate() >= 22 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 1 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 19 ))
							{
								System.out.println("You are a capricorn!");
								System.out.println("Sign: Mountain Goat");
								System.out.println("A famous capricorn: LeBron James");
								System.out.println("The Capricorn-born people are the most determined of the entire Zodiac.\n The most prominent qualities of the Goats, as they are called, are that they are ambitious,\n conservative, determined, practical and helpful.");
							}
				
				//aquarius
					
				else if ((zodiac.get(0).getMonth() == 1 && zodiac.get(0).getDate() >= 20 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 2 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 18 ))
							{
								System.out.println("Your are a aquarius!");
								System.out.println("Sign: Man who carries water");
								System.out.println("A famous aquarius: Harry Styles");
								System.out.println("Aquarius men are unpredictable, intelligent, social, independent and excellent communicators.\n Some of the negative Aquarius characteristics include unreliability, stubbornness, indecision, and inflexibility.\n If you want to seduce the man born under the Aquarius astrology sign, you will have to be cool about it.");
							}
				
				//pisces
					
				else if ((zodiac.get(0).getMonth() == 2 && zodiac.get(0).getDate() >= 19 && zodiac.get(0).getDate() <= 31 )
						|| (zodiac.get(0).getMonth() == 3 && zodiac.get(0).getDate() >= 1 && zodiac.get(0).getDate() <= 20 ))
							{
								System.out.println("You are a pisces!");
								System.out.println("Sign: Fish");
								System.out.println("A famous pisces: George Washington");
								System.out.println("Pisces are selfless, they are always willing to help others, without hoping to get\n anything back. Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity. \nTheir ruling planet is Neptune, so Pisces are more intuitive than others and have an artistic talent.");
										
							}
			}
	}

