/* SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5:5
       Comment:I always used constants over numbers in my code.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
       Mark out of 5:5
       Comment:My constant names were written in appropriate way and made sense.
   3. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:10
       Comment: My variable names were simple and easy to use.
   4. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:5
       Comment: I used lowerCamelCase in labelling all my variables.
   5. Did I indent the code appropriately?
       Mark out of 10:10
       Comment: I used correct indentation.
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose?
       Mark out of 20: 20
       Comment: My while loop kept working till the user won or lost.
   7. Did I check the input to ensure that invalid input was handled appropriately?
       Mark out of 10: 10
       Comment: Invalid inout was handled with an error message
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)?
       Mark out of 10: 10
       Comment: All cards were equally likely to be picked
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King?
       Mark out of 10: 10
       Comment: Cards were given correct values e.g jack was 11
   10. Did I report whether the user won or lost the game before the program finished?
       Mark out of 10:10
       Comment: User was told if they won the game
   11. How well did I complete this self-assessment?
       Mark out of 5:5
       Comment: I answered all questions truthfully
   Total Mark out of 100 (Add all the previous marks):100
*/ 
import java.util.Random;
import java.util.Scanner;
public class HighLow {

	public static final int ACE =1;
	public static final int JACK= 11;  //I dont think I actally used these constants in the code // next time use constants in code
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int MAX_NUMBER = 13 ;
	public static final int WIN = 4;

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner( System.in );
			boolean finish = false ;
			Random generator = new Random();

			int playerScore = 0;
			int currentCard = generator.nextInt(MAX_NUMBER) + 1 ;

			if (currentCard == ACE)
			{
				System.out.println("The card is a Ace.");
			}
			else if (currentCard == JACK) //over instead of currentCard == 11 say currentCard == Jack
			{
				System.out.println("The card is a Jack.");
			}
			else if (currentCard == QUEEN)
			{
				System.out.println("The card is a Queen.");
			}
			else if (currentCard == KING)
			{
				System.out.println("The card is a King.");
			}
			else
			{
				System.out.println("The card is a " + currentCard );
			}


			while ( ! finish)

			{

				int nextCard = generator.nextInt(MAX_NUMBER) + 1 ;
				System.out.print("Do you think the next card will be higher(hi), lower(lo) or equal(e)?");

				String guess = input.next();

				if( ( guess.equalsIgnoreCase("e")) && currentCard == nextCard)
				{
					playerScore++;
				}

				else if (guess.equalsIgnoreCase("hi") && currentCard < nextCard )
				{
					playerScore++;
				}

				else if (guess.equalsIgnoreCase("lo") && currentCard > nextCard)
				{
					playerScore++;
				}
				else if (guess.equalsIgnoreCase("e") && currentCard < nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}
				else if (guess.equalsIgnoreCase("e") && currentCard > nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}

				else if (guess.equalsIgnoreCase("hi") && currentCard == nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}
				else if (guess.equalsIgnoreCase("hi") && currentCard > nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}

				else if (guess.equalsIgnoreCase("lo") && currentCard == nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}
				else if (guess.equalsIgnoreCase("lo") && currentCard < nextCard )
				{
					finish = true ;
					System.out.println ("You guessed wrong. Game Over");
				}
				else 
				{
					System.out.println("Error please use a valid input");
				}



				if (nextCard == ACE)
				{
					System.out.println("The card is a Ace");
				}
				else if (nextCard == JACK)
				{
					System.out.println("The card is a Jack");
				}
				else if (nextCard == QUEEN)
				{
					System.out.println("The card is a Queen");
				}
				else if (nextCard == KING)
				{
					System.out.println("The card is a King");
				}
				else
				{
					System.out.println("The card was a " + nextCard +"." );
				}

				

				currentCard = nextCard ;

				if (playerScore == WIN)
				{
					finish = true ;
					System.out.print ("Congratulations.You won the game.");
				}
			}


		}
		catch (Exception e)
		{
			System.out.println("Error" + e);
		}
	}



}







