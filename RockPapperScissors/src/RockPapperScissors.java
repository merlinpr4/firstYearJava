
/* SELF ASSESSMENT

   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10:10
       Comment:My variables and constants were easy to understand cause they were full words
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: I used lowerCamelCase and UPPERCASE where appropriate
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: The computers guesses were random using random generator
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: Users choice matches the input display 
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: The code keeps track of the score of the computer and person and updates each round
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 10
       Comment: The computer tells the person who won each round
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment: I used only one for loop in my code and game only runs for 5 rounds
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10:  10
       Comment: Final score matches the score taken in the game
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I answered the questions truthfully
   Total Mark out of 100 (Add all the previous marks): 100
*/
import java.util.Random;
import java.util.Scanner;

public class RockPapperScissors {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int GUESSES_ALLOWED = 5;
	public static final int MAX_NUMBER = 3;

	public static void main(String[] args) {

		Random generator = new Random();

		int playerScore = 0;
		int computerScore = 0;

		for (int count = 0; (count < GUESSES_ALLOWED); count++) {
			int computerPick = generator.nextInt(MAX_NUMBER) + 1;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors):");
			int personPick = input.nextInt();

			if (personPick == computerPick) {
				System.out.println("This round was a draw as I chose " + computerPick + " too");
			}

			else if (computerPick == ROCK && personPick == PAPER) {
				System.out.println("You won this round as I chose " + computerPick);
				playerScore++;
			} else if (computerPick == ROCK && personPick == SCISSORS) {
				System.out.println("You lost this round as I chose " + computerPick);
				computerScore++;
			} else if (computerPick == PAPER && personPick == ROCK) {
				System.out.println("You lost this round as I chose " + computerPick);
				computerScore++;
			} else if (computerPick == PAPER && personPick == SCISSORS) {
				System.out.println("You won this round as I chose " + computerPick);
				playerScore++;
			} else if (computerPick == SCISSORS && personPick == PAPER) {
				System.out.println("You lost this round as I chose " + computerPick);
				computerScore++;
			} else if (computerPick == SCISSORS && personPick == ROCK) {
				System.out.println("You won this round as I chose " + computerPick);
				playerScore++;
			}
			if (count == GUESSES_ALLOWED - 1) {

				System.out.println("The final score was Computer: " +  computerScore + " User:" + playerScore);
			}

		}
	}
}
