package com.cs260.truman_game;

import java.util.Scanner;
/**
 * 
 * @author Zach Green
 * @version 11/26/14
 *
 */
public class Exam 
{
	private static final int PASS = 7;
	int correct;
	String[][] questions = {
			//1.
			{"Which of the following is an OOP Principle?\n"
			+ "A:Virtual Machine\n"
			+ "B:Polymorphism\n"
			+ "C:Type Safety\n",
			"b"},
			//2.
			{"One should program by...?\n"
			+ "A:Candlelight\n"
			+ "B:Coffee\n"
			+ "C:Contract\n",
			"c"},
			//3.
			{"How large is an int in Java?\n"
			+ "A:2 billion and something right?\n"
			+ "B:OVER 9000!!!\n"
			+ "C:Big enough\n",
			"a"},
			//4.
			{"How should one solve a problem that they encounter repeatedly?\n"
			+ "A:Look it up on StackExchange\n"
			+ "B:Ask a smarter CS friend\n"
			+ "C:Programming Patterns\n",
			"c"},
			//5.
			{"What kind of language is Java?\n"
			+ "A:Interpretted\n"
			+ "B:A cool one\n"
			+ "C:General Purpose\n",
			"c"},
			//6.
			{"What modifier should always be used whenever possible?\n"
			+ "A:Public because all information should be free!\n"
			+ "B:Private\n"
			+ "C:Static. No objects for you!\n",
			"b"},
			//7.
			{"What is another language that is used in Android?\n"
			+ "A:XML\n"
			+ "B:Java all the way\n"
			+ "C:Definitely Prolog\n",
			"a"},
			//8.
			{"Describe the Stack Data Structure\n"
			+ "A:It's pretty cool I guess\n"
			+ "B:LIFO\n"
			+ "C:Confusing terms. I don't pop plates when I take them out of the cupboard\n",
			"b"},
			//9.
			{"What program can really help with programming projects?\n"
			+ "A:Git\n"
			+ "B:totallyNotAVirus.exe\n"
			+ "C:probablyAVirus.exe\n",
			"a"},
			//10.
			{"What do you need to do to graduate from Truman besides the required courses?\n"
			+ "A:Luck\n"
			+ "B:Completed Capstone\n"
			+ "C:Money\n",
			"b"}
		};
	
	public Exam()
	{
		correct = 0;
	}

	public boolean start() 
	{
		System.out.println("You've made it thus far through Truman and have one last task.\n"
				+ "You've collected your required credits to graduate.\n"
				+ "You've completed your capstone experience as well.\n"
				+ "There is one final test... a test!"
				+ "Muawhahaha!\n\n");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 10; i++)
		{
			System.out.println(questions[i][0]);
			String answer = in.next();
			if (answer.equals(questions[i][1]))
			{
				correct++;
				System.out.println("Correct!");
			}
			else System.out.println("Wrong!");
			
		}
		if (correct >= PASS)
		{
			System.out.println("You graduate!");
			in.close();
			return true;
		}
		else 
		{
			System.out.println("You fail!");
			in.close();
			return false;
		}
	}
}
