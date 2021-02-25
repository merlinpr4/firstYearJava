/* SELF ASSESSMENT 

1. ResolveBet

    I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7:7 ]
    Comment:ResolveBet takes in string and wallet object and returns nothing like it should
    My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8:8]
    Comment:I show the player the cash in wallet and the amount they would like to bet
    My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5:5].
    Comment:I make sure the player is unable to make a bet greater than allowed
    My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15:.15 ].
    Comment:3 dice objects are created and their total stored in a variable
    My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20:20 ].
    Comment:I check the bet type against the total and if a triple happened using the dice faces
    My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10:10 ]
    Comment: I increment and decrement based on the result of the rolls


2. Main

    I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15:15 ]
    Comment: I create a wallet object and place the correct amount of money inside
    My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5:5 ]
    Comment:the program repeadly until they quit or lose all their money
    I ask the user to enter any of the four bet types or quit [Mark out of 5:5 ].
    Comment:I ask player to place the four bet types or quit
    My program calls resolveBet for each bet type entered [Mark out of 5:5 ].
    Comment:resolbeBet is called whenvever a bet is placed
    At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5:5 ]
    Comment:I print out the previous money and current money of the player


 Total Mark out of 100 (Add all the previous marks):100
 */
import java.util.Scanner;


public class ChuckALuck {
	public static final int EIGHT =8;
	public static final int TEN =10;
	public static final int ELEVEN=11;
	public static final int TWELEVE =12;
	public static final int SIX = 6;
	public static final int ONE=1;
	public static final int TRIPLE_PAY_OUT =30;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("How much cash do you have?");

		Wallet userWallet = new Wallet();	
		double money ;

		if  (input.hasNextInt())
		{
			money = input.nextDouble();
			userWallet.put(money); 		  
			boolean finished = false;
			do {

				if (userWallet.check() <= 0)
				{
					finished = true ;
					System.out.println("You are out of money.");
					System.out.println("You started this game with £" + money + ".\n"+ "You now have £" + userWallet.check() + " in your wallet." );
				}
				else
					System.out.print("Enter a bet type (triple, field, high, low) or enter quit."); 
				if (input.hasNext("quit"))
				{
					System.out.println("The game is now over");
					finished = true ;
				}
				else if((input.hasNext("triple") || (input.hasNext("field")) || (input.hasNext("high")) || (input.hasNext("low")) )) //change this so input of user is stored in a variable and then change that variable to string to ensure that letter are capital
				{
					String betType = input.next(); 
					ResolveBet(betType,userWallet); 
				}  
				else 
				{
					System.out.println("Sorry that is not a valid bet type");
					finished = true ;
				}
			}
			while (!finished);
			System.out.println("You started this game with £" + money + ".\n"+ "You now have £" + userWallet.check() + " in your wallet." );
		}
		else  System.out.println ("Error Please enter a valid whole number."); 
	}


	public static void ResolveBet ( String betType, Wallet userWallet) 
	{
		boolean triple = false;

		boolean betTriple = false;	
		boolean field = false;
		boolean high = false;
		boolean low = false ;
		int totalValueOfRolls = 0;

		Scanner input = new Scanner (System.in);
		System.out.print("There is £"+ userWallet.check() + " in your wallet. "+ " ");
		System.out.println("How much would you like to bet?");


		double bet = input.nextDouble();  

		if ( bet <=userWallet.check()) 
		{	
			Dice dice1= new Dice();
			Dice dice2= new Dice();
			Dice dice3= new Dice();

			dice1.roll();
			dice2.roll();
			dice3.roll();
			totalValueOfRolls = dice1.roll() + dice2.roll() + dice3.roll() ;

			if ((dice1.topFace() == dice2.topFace() ) && (dice1.topFace())==dice3.topFace())
			{
				triple = true ;
			}	

			if ((triple == true) && (dice1.topFace() != ONE && dice1.topFace() != SIX))
			{
				betTriple = true;
			}

			if (totalValueOfRolls<EIGHT || totalValueOfRolls>TWELEVE) 
			{
				field = true ;
			}

			if (totalValueOfRolls > TEN && triple == false)
			{
				high = true;
			}

			if (totalValueOfRolls < ELEVEN  && triple == false)
			{
				low = true;
			}

			if (betType.equalsIgnoreCase("Triple") && betTriple == true)
			{
				System.out.println("The roll was a triple so you won money"); 
				userWallet.put(bet *TRIPLE_PAY_OUT ); 
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");
			}
			else if (betType.equalsIgnoreCase("Triple") && betTriple ==false)
			{
				System.out.println("You bet wrong so you lost money");
				userWallet.get(bet);
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");
			}

			if (betType.equalsIgnoreCase("Field") && field == true )
			{
				System.out.println("The roll was a field so you won money");
				userWallet.put(bet );
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");

			}
			else if (betType.equalsIgnoreCase("Field") && field == false )
			{
				System.out.println("You bet wrong so you lost money");
				userWallet.get(bet);
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");
			}

			if (betType.equalsIgnoreCase("High") && high == true )
			{
				System.out.println("The roll was a high so you won money");
				userWallet.put(bet );
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");

			}
			else if (betType.equalsIgnoreCase("High") && high == false )
			{
				System.out.println("You bet wrong you so lost money");
				userWallet.get(bet);
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");
			}

			if (betType.equalsIgnoreCase("Low") && low == true )
			{
				System.out.println("The roll was a low so you won money");
				userWallet.put(bet );
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");

			}
			else if (betType.equalsIgnoreCase("Low") && low == false )
			{
				System.out.println("You bet wrong so you lost money");
				userWallet.get(bet);
				System.out.println("There is £"+ userWallet.check() + " in your wallet. "+ " ");
			}
		}
		else if (bet>userWallet.check())
			System.out.println("You do not have enough cash to make that bet.Please try again");	
	}
}
