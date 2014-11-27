package com.cs260.truman_game;
import java.util.Scanner;

/**
 * Class that contains the terminal hacking minigame to steal your 
 * senior portfolio.
 * 
 * @author Zach Green
 * @version 11/26/2014
 */
public class TerminalHack 
{
	private String[] passwords = {
			"critical thinking", 
			"persue", 
			"go bulldogs",
			"purple fridays",
			"spike",
			"harvard of the midwest",
			"liberal arts",
			"reading day",
			"truman week",
			"4 year plan"};
	private boolean hacked;
	Scanner in;
	
	/**
	 * Initializes hacked to false
	 * @param in  current scanner obj
	 */
	public TerminalHack(Scanner in)
	{
		hacked = false;
		this.in = in;
	}

	/**
	 * Prints starting message and begins the hacking
	 */
	public void screen() 
	{
		System.out.println("You walk into the room and notice a computer is on.\n"
				+ "You decide to take a look and see that it is student portfolio database.\n"
				+ "Hmmm...\n\n"
				+ "Starting up program, please wait... \n" +
				"(The Truman network and computers are slow)\n" +
				"Welcome to the Truman State University Portfolio Program! \n" +
				"Please enter the correct password to access THE VAULT:\n" +
				"(No students allowed!");
		printPasswords();
		getPasswords();
	}

	/**
	 * Prints out all of the passwords
	 */
	private void printPasswords() 
	{
		for (int i = 0; i < passwords.length; i++)
		{
			System.out.println(passwords[i]);
		}
	}
		
	/**
	 * Player tries to guess the password. Correct guess grants access
	 */
	private void getPasswords() 
	{
		//Scanner in = new Scanner(System.in);
		final int ANSWER = 5;
		int guesses = 4;
		
		while(!hacked)
		{
			String input = in.nextLine();
			if (input.equals(passwords[ANSWER]))
			{
				hacked = true;
			}
			else if (guesses > 0)
			{
				guesses--;
				System.out.println("Incorrect. " + guesses + " left.");
			}
			else
			{
				System.out.println("INTRUDER ALERT!");
				return;
			}
		}
	}

	/**
	 * Grants access if hacked.
	 * @return  senior portfolio status
	 */
	public boolean access() 
	{
		if(hacked == true)
		{
			System.out.println("Welcome to THE VAULT! Please take your Senior Portfolio!");
			return true;
		}
		return false;
	}
}