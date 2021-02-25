import java.util.Scanner;
public class C4HumanPlayer extends ConnectPlayer {
	private int column;
	
	public C4HumanPlayer(char counterType)
	{
		super(counterType);
	}

	@Override
	public int move()
	{
		Scanner input = new Scanner (System.in)	;
		System.out.print("Which column would you like to drop your piece Player 2?"); 
		column =input.nextInt()-1;
		return column ;
	}
}
