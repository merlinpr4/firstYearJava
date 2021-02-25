/* SELF ASSESSMENT
Connect4Game class (35 marks:35)
My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win. 
Comment:I do all of the above to run a working game of connect 4 .I do all the checks to make sure valid number is inputed for a column.I have loops which keep going unless specified not to and I create objects that are required for the game

Connect4Grid interface (10 marks:10)
I define all 7 methods within this interface.
Comment:There are 7 methods in my interface

Connect4Grid2DArray class (25 marks:25) 
My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
Comment:All the above methods are implemented in my class and they all work properly to have a proper connect 4 game

ConnectPlayer abstract class (10 marks :10)
My class provides at lest one non-abstract method and at least one abstract method. 
Comment:I have move method which is abstract and a get method which is not abstract

C4HumanPlayer class (10 marks:10)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides the Human player functionality.
Comment:Human player is subclass of connectPlayer and overrides the abstract move method to give human movement

C4RandomAIPlayer class (10 marks:10)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides AI player functionality. 
Comment:AI player overrides move to have random number to give movement

Total Marks out of 100:100

 */
import java.util.Scanner;
public class Connect4Game {
	public static final char RED = 'R';
	public static final char YELLOW = 'Y';
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean finished = false;

		while(!finished)
		{
			System.out.print("Would you like to play connect4?(enter no to quit the game)");
			if (input.hasNext("no"))
			{
				finished = true ;
				System.out.print ("Finished");
			}	
			input.next();
			if (!finished)
			{
				Connect4Grid2DArray grid = new Connect4Grid2DArray();
				grid.emptyGrid();
				C4HumanPlayer user = new C4HumanPlayer(RED);
				C4RandomAIPlayer AIOpenent = new C4RandomAIPlayer(YELLOW);
				C4HumanPlayer humanOpenent = new C4HumanPlayer(YELLOW);
				boolean AI = false;
				boolean userWinner = false;
				int userPick = 0;
				System.out.println("Would you like to play against a computer?(Enter yes/no)");
				if (input.hasNext("yes"))
				{
					AI = true;
				}
				input.next();
				System.out.println(grid.toString());
				while((grid.isGridFull()==false) && (grid.didLastPieceConnect4()==false))
				{	
					System.out.println("Which column would you like to drop your piece Player 1?");
					userPick = input.nextInt()-1;
					while((grid.isValidColumn(userPick)==false|| grid.isColumnFull(userPick))==true )
					{
						System.out.println("Please pick a valid column from 1 to 7 that is not full");
						System.out.println("Which column would you like to drop your piece Player 1?");			
						userPick = input.nextInt()-1;		
					}
					grid.dropPiece(user, userPick);
					System.out.println(grid.toString());
					userWinner = grid.didLastPieceConnect4();
					if(AI==false && userWinner==false)
					{
						int openentPick = humanOpenent.move();
						while((grid.isValidColumn(openentPick)==false|| grid.isColumnFull(openentPick))==true )
						{
							System.out.println("Please pick a valid column from 1 to 7 that is not full");			
							openentPick = humanOpenent.move();;		
						}
						grid.dropPiece(humanOpenent, openentPick);
						System.out.println(grid.toString());
					}
					else if(AI==true && userWinner==false)
					{
						int openentPick = AIOpenent.move();
						while((grid.isValidColumn(openentPick)==false|| grid.isColumnFull(openentPick))==true )
						{			
							openentPick = AIOpenent.move();;		
						}
						grid.dropPiece(AIOpenent, openentPick);
						System.out.println(grid.toString());
					}
				}
				if (grid.isGridFull())
				{
					System.out.println("Draw");
				}
				else if (userWinner)
				{
					System.out.println("Congratulations Player 1 has won");
				}
				else
				{
					System.out.println("Congratulations Player 2 has won");
				}
			}
		}
	}
}