/* SELF ASSESSMENT 
   1.  createSequence:
   
    Did I use the correct method definition?
    Mark out of 5:5
    Comment:I used the a boolean method definition which I think was a the easiest way to mark prime and not prime numbers.
    Did I create an array of size n (passed as the parameter) and initialise it?
    Mark out of 5:5
    Comment:I created an array of a specified number and initialised the array to all being true.
    Did I return the correct item?
    Mark out of 5:5
    Comment:I returned back an array that was all set to true.

   2.  crossOutMultiples

    Did I use the correct method definition?
    Mark out of 5:5
    Comment:I used another boolean method defination to cross out multiples
    Did I ensure the parameters are not null and one of them is a valid index into the array
    Mark out of 2:2
    Comment:I made sure the parameter multiple is not null because it starts at 2 which also made it valid index into the array and sequence is not null because I initialsed it before and i also double checked in this method 
    Did I loop through the array using the correct multiple?
    Mark out of 5:5
    Comment:the array was looped through using the multiple it was supplied properly
    Did I cross out correct items in the array that were not already crossed out?
    Mark out of 3:3
    Comment:arrays were marked as false if they did not contain prime numbers

   3.  sieve   

    Did I have the correct function definition?
    Mark out of 5:5
    Comment:I used the boolean method again to use the sequence with numbers being represented by the arrays numbers and true and false being recorded in it.
    Did I make calls to other methods?
    Mark out of 5:5
    Comment:I called all the other functions inside this function
    Did I return an array with all non-prime numbers are crossed out?
    Mark out of 2:2
    Comment:All the non - prime numbers were marked as false

   4.  sequenceTostring  

    Did I have the correct function definition?
    Mark out of 5:5
    Comment:I used a string defination like the question asked 
    Did I ensure the parameter to be used is not null?
    Mark out of 3:3
    Comment: I checked if sequence array is not null again
    Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
    Mark out of 10:10
    Comment:I looped through the array and marked the non - crossed out numbers and crossed out numbers in brackets and updated string variable as I did that.

   5.  nonCrossedOutSubseqToString  

    Did I have the correct function definition
    Mark out of 5: 5
    Comment:  I used the string method       
    Did I ensure the parameter to be used is not null?  
    Mark out of 3:3
    Comment:I checked if parameter used is not null
    Did I loop through the array updating the String variable with just the non-crossed out numbers? 
    Mark out of 5:5
    Comment:I looped through my sequence and updated the string with only the non - crossed out numbers

   6.  main  

    Did I ask  the user for input n and handles input errors?  
    Mark out of 5:5
    Comments: I checked the user input for errors 
    Did I make calls to other methods (at least one)?
    Mark out of 5:5
    Comment:  I called the sieve function in the main
    Did I print the output as shown in the question?  
    Mark out of 5:5
    Comment: I output everytime the sieve went through a new multiple and  the output was in correct format and also printed out all prime numbers and removed the comma at the end of the string

   7.  Overall

    Is my code indented correctly?
    Mark out of 4:4
    Comments: code was indented properly
    Do my variable names make sense?
    Mark out of 4:4
    Comments:my variable names were easy to understand
    Do my variable names, method names and class name follow the Java coding standard
    Mark out of 4: 4
    Comments: I wrote my names in the correct way

      Total Mark out of 100 (Add all the previous marks): 100
 */ 
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays ;

public class SieveOfEratosthens {
	public static final int FIRST_PRIME_NUMBER = 2;
	public static final int ONE = 1 ;
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean wrongInput = false ;
		System.out.print("Enter an integer >=2: ");
		if (input.hasNextInt())
		{
			int numberInputed = input.nextInt() ;
			if (numberInputed >= FIRST_PRIME_NUMBER)
			{
				int number = numberInputed - ONE ;
				sieve(number) ;
			}
			else wrongInput = true ;
		}
		else wrongInput = true;
		if (wrongInput ==true)
		{
			System.out.println("Error please enter a valid number.");
		}
	}
	public static boolean [] createSequence (int number)
	{
		boolean [] sequence =new boolean[number];
		for (int index =0; index< number; index++)
		{
			sequence[index] = true ;
		}
		return sequence ;
	}

	public static boolean [] crossOutHigherMultiples (boolean []sequence , int multiple)
	{
		if (sequence!= null)
		{
			int multiples = multiple + multiple ;
			for (int index = 0 ; index < sequence.length ; index ++)
			{	
					if ( index + FIRST_PRIME_NUMBER == multiples) 
					{
						sequence[index] = false ;  
						multiples = multiples + multiple ;
					}
			}
		}
	return sequence;
}

public static boolean [] sieve (int number)
{
	boolean []sequence = createSequence (number) ;
	sequenceToString(sequence) ;
	for (int multiple = 2 ;multiple <Math.ceil(Math.sqrt(number)) ; multiple ++) 
	{
		if (sequence[multiple] == true) 
		{
		crossOutHigherMultiples (sequence,multiple);  
		sequenceToString(sequence) ;
		}
	}
	nonCrossedOutSubseqToString (sequence);
	return sequence ;
}
public static String sequenceToString (boolean[] sequence)
{
	String stringSequence = "";
	if (sequence!= null) 
	{
		for (int arrayIndex=0; arrayIndex<sequence.length; arrayIndex++)
		{	
			int number = arrayIndex + FIRST_PRIME_NUMBER;
			if (sequence[arrayIndex] == false)
			{
				stringSequence += "[" + number + "], " ; 
			}
			else
			{
				stringSequence += number + ", " ;
			}
		}
		if (stringSequence.endsWith(", "))
		{
			stringSequence = stringSequence.substring(0,stringSequence.length() - 2);

		}
		System.out.println(stringSequence); 
	}
	return stringSequence ;
}
public static String nonCrossedOutSubseqToString (boolean[] sequence)
{
	String stringSequence ="" ;
	if (sequence!= null)
	{
		for (int arrayIndex=0; arrayIndex<sequence.length; arrayIndex++)
		{
			int number = arrayIndex + FIRST_PRIME_NUMBER ;
			if (sequence[arrayIndex]==true)
			{
				stringSequence += number +", " ;	
			}
		}
		if (stringSequence.endsWith(", "))
		{
			stringSequence = stringSequence.substring(0,stringSequence.length() - 2);

		}
		System.out.println(stringSequence);
	}
	return stringSequence ; 
}	
}