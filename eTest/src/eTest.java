import java.util.Scanner;
public class eTest {
	public static final double OBESE = 25;



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean finish = false ;
		double bMI = 0;
		double obese = 0 ;
		double people = 0 ;

		System.out.println("This is a BMI calculator please enter valid whole numbers");


		while ( ! finish)
		{
			System.out.print("Enter the person's height in metres (or 'quit'):");
			if (input.hasNextDouble ()) 
			{
				double height = input.nextDouble() ;

				/*if ( height <= 0 )
				{
					System.out.println ("Error please input a positive whole number greater than 0 .");
					finish = true ; //get a way to reprompt to end this while loop and restart it
				}*/


				System.out.print("Enter their weight in kilograms:" );
				double weight = input.nextDouble ();

				//if ( weight < 0 )
				/*{
					System.out.println ("Error please input a positive whole number greater than 0 .");
					finish = true ; //get a way to reprompt to end the while loop and restart this loop
				}
				 */

				bMI = weight / (height * height);
				people ++ ;

				if (bMI >= OBESE )
				{
					obese ++ ;
				}

				double percentageObese = (obese / people)*100 ;
				{
					System.out.println("The average BMI is " + bMI + " and " + percentageObese + " % of these people are overweight or obese.");
				}
				else if (input.hasNext("quit"))
				{
					finish = true ;

					System.out.print ("Finished");
				}
				else 
				{
					finish = true ;
					System.out.println ("Error Please enter a valid whole number.");
				}

			}







		}
	}

}











