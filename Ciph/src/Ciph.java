

import java.util.Random;
import java.util.Scanner;

public class Ciph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		char[] cipher = alphabet.toCharArray();
		char[] alphabetArray = alphabet.toCharArray();

		char[] cipherText = createCipher (cipher);

		Scanner input = new Scanner (System.in)	;
		
		
		boolean finished = false;
		do 
		{
			System.out.println ("Enter a message");
			if (input.hasNext())	
			{
		
		
		String message =input.nextLine();                  
		String lowercaseMessage = message.toLowerCase();
		char [] messageArray = lowercaseMessage.toCharArray(); 

		char [] encryptedMessage =  encrypt (messageArray,cipher) ;	
		String encryptedPhrase = new String (encryptedMessage); 
		System.out.println("Encrypted message is :" + encryptedPhrase);

		char[] decryptedMessage = decrypt (messageArray,cipher);
		String decryptedPhrase = new String (decryptedMessage);
		System.out.println("Decrypted message is :" + decryptedPhrase);
			}
			else finished = true ;
		}
		while (!finished);
	}
	public static char [] createCipher (char[]cipher)
	{
		if(cipher !=null)
		{
			Random generator = new Random();
			for (int index=0; index<cipher.length; index++ )
			{
				int otherIndex = generator.nextInt(cipher.length);
				char temp = cipher[index];
				cipher[index] = cipher[otherIndex];
				cipher[otherIndex] = temp;
			}
		}
		return cipher;
	}

	public static char [] encrypt (char[]phrase,char[]cipher)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		char[] alphabetArray = alphabet.toCharArray();
		if(phrase !=null)
		{
			boolean finish = false ;
			int index = 0 ;
			int phraseIndex= 0 ;
			for(;phraseIndex<phrase.length;phraseIndex++)
			{
				finish = false;
				while (finish == false)
				{
					if (phrase[phraseIndex] == alphabetArray[index])
					{
						phrase[phraseIndex] = cipher[index] ;
						index = 0;
						finish = true ;
					}
					else
					{		
						index++;
					}		
				}
			}
		}
		return phrase;
	}


	public static char []decrypt (char[]phrase,char[]cipher)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		char[] alphabetArray = alphabet.toCharArray();
		if(phrase !=null)
		{
			boolean finish = false ;
			int index = 0 ;
			int phraseIndex= 0 ;
			for(;phraseIndex<phrase.length;phraseIndex++)
			{
				finish = false;
				while (finish == false)
				{
					if (phrase[phraseIndex] == cipher[index])
					{
						phrase[phraseIndex] = alphabetArray[index] ;
						index = 0;
						finish = true ;
					}
					else
					{		
						index++;
					}		
				}
			}
		}
		return phrase; 
	}
}

