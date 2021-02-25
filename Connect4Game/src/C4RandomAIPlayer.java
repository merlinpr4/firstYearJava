import java.util.Random;
public class C4RandomAIPlayer extends ConnectPlayer {
	public static final int MAX_NUMBER = 6 ;
	private int column;

	public C4RandomAIPlayer(char counterType)
	{
		super(counterType);
	}

	@Override
	public int move()
	{
		Random generator = new Random();
		column = generator.nextInt(MAX_NUMBER);
		return column;
	}
}
