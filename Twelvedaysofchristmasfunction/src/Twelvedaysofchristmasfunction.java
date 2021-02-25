/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10:10
        Comment:   I used my variables and constants were easy to understand and properly formatted
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25 
        Comment:  My getVerse function is easy to understand and works in correct way using the previous functions made.
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:  my getChristmasGift function used a switch statement and was simple to understand
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:  getOrdinalString function used a series of if statements and was simple to understand
 5. Does the program produce the output correctly?
       Mark out of 10: 10
        Comment:  the song was printed out correctly
 6. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I answered truthfully
 Total Mark out of 100 (Add all the previous marks): 100

*/ 
public class Twelvedaysofchristmasfunction {
	public static final int LAST_DAYOFCHRISTMAS= 12;
	public static void main(String[] args) {
		for ( int dayOfChristmas = 1; (dayOfChristmas<= LAST_DAYOFCHRISTMAS ); dayOfChristmas++) 
		{
			String song = getVerse(dayOfChristmas);
			System.out.print(song);
		}		
	}
	public static String getVerse( int verseNumber)
	{
		String verse = " ";
		verse = "\n" + "On the " + getOrdinalString(verseNumber) + " day of Christmas." 
					+ "\n" + "My true love sent to me."+ "\n" +  getChristmasGift(verseNumber) ;
		return verse ;
	}
	public static String getChristmasGift( int giftNumber ) 
	{
		String gift = "";
		switch (giftNumber)
		{
		case 12:
			gift += "12 Drummers Drumming," + "\n";
		case 11:
			gift += "11 Pipers Piping," + "\n";
		case 10:
			gift +="10 Lords a-leaping," + "\n";
		case 9:
			gift += "9 Ladies dancing,"  + "\n";
		case 8:
			gift += "8 Maids a-milking," + "\n";
		case 7:
			gift += "7 Swans a-swimming," + "\n";
		case 6:
			gift += "6 Geese a-laying,"  + "\n";
		case 5:
			gift += "5 Gold Rings,"  + "\n";
		case 4:
			gift += "4 Calling Birds," + "\n";
		case 3:
			gift += "3 French Hens," + "\n" ;
		case 2:
			gift += "2 Turtle Doves," + "\n"+ "And a Partridge in a Pear Tree.";
			break;
		default:
			gift = "A Partridge in a Pear Tree.";
			break;
		}
		return gift ;	
	}

	public static String getOrdinalString( int dayOfChristmas)
	{
		String date = "" ;
		if (dayOfChristmas == 1 )
			date = "first";
		else if (dayOfChristmas == 2 )
			date = "second";
		else if (dayOfChristmas == 3 )
			date = "third";
		else if (dayOfChristmas == 4)
			date ="fourth";
		else if (dayOfChristmas == 5)
			date = "fifth";
		else if (dayOfChristmas == 6)
			date ="sixth";
		else if (dayOfChristmas == 7)
			date = "seventh";
		else if (dayOfChristmas == 8)
			date ="eigth";
		else if (dayOfChristmas == 9)
			date ="ninth";
		else if (dayOfChristmas == 10)
			date ="tenth";
		else if (dayOfChristmas == 11)
			date ="eleventh";
		else
			date ="twelfth";
		return date ;
	}

}

