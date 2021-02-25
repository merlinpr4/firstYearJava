import java.util.Scanner;

public class eTestttwo {
	public static final int CHECK_EVEN=2;

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int[] integers= null;
		boolean finished = false;
		do {
			System.out.print("Enter an integer to add to the array (or 'quit' to finish):");
			if (input.hasNextInt())
			{
				int []integersCopy = new int [(integers==null)?1:integers.length+1]; 
				if (integers!=null)
				{
					System.arraycopy( integers, 0, integersCopy, 0, integers.length );
				}

				integersCopy [integersCopy.length-1]= input.nextInt(); 
				integers= integersCopy;

				boolean isEven = getEven(integers);
				int magnitude =getMagnitude (integers);
				System.out.print("The magnitude of the range of values is " + magnitude );
				if (isEven)
				{
					System.out.print(" and all values are even." + "\n");
				}
				else
				{	
					System.out.print(" and not all values are even." + "\n");
				}
			}
			else finished = true ;
		}
		while (!finished);
	}	

	public static boolean getEven(int[] integers) 
	{
		boolean odd = false ;
		for ( int index = 0 ;index < integers.length ;index++)
		{
			if (integers[index]  % CHECK_EVEN == 0)
			{
				odd = false ;
			}
			else 
			{
				odd = true;
				return false;
			}
		}
			if (!odd)
			{
				return true;
			}
		return false;
	}

	public static int getMagnitude (int[] integers)
	{

		int magnitude = 0 ;
		int index2 = 0 ;
		int maximum = 0 ;
		int minimum = integers[index2];
		for ( int index = 0 ;index < integers.length ;index++)
		{
			if(  integers[index] > maximum)
			{
				maximum = integers[index];
			}
		}
		for (; index2 < integers.length ; index2++)
		{
			if (integers[index2]<= minimum )
			{
				minimum = integers[index2];
			}
		}	
		magnitude = maximum - minimum ;
		return magnitude ;
	}
}



