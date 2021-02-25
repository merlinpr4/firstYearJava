
public abstract class ConnectPlayer { 
	private char counterType ;
	
	public ConnectPlayer(char counterType)
	{
		this.counterType = counterType;
	}
	
	public char getcounterType()
	{
		return counterType;
	}
	
	public abstract int move();
}
