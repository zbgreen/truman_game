package com.cs260.truman_game;

/**
 * QuestionBank class. This class will contains all of the questions that the
 * player will be ask when the NPC (faculty member) talks to the player. It will
 * also contains the final exam for the player
 *
 * @author Yong Zheng, Zach Green
 * @version 11/26/2014
 */
public class QuestionBank {
	/**
	 * The two-dimensional array that contains the questions and correct
	 * responses
	 */
	public static final String[][] QUESTION = {
		//1.
		{"Which of the following is not an OOP principle?\n "
				+ "A:Encapsulation\n "
				+ "B:Polymorphism\n "
				+ "C:Inheritance\n "
				+ "D:Abstruction\n "
				+ "E:Association",
				"e" },
		//2.		
		{"What is the airspeed velocity of an unladen swallow?\n "
				+ "A:1 m/s\n"
				+ "B:2.4 m/s\n"
				+ "C:What do you mean? An African or European swallow?\n"
				+ "D:I don't know that\n"
				+ "E:.6 m/s\n", 
				"c"},
		//3.
		{"How is the weather today?\n"
				+ "A:As cold as my soul\n"
				+ "B:The radioactive glow is kind of nice this time of year\n"
				+ "C:Partly cloudy with a chance of fallout\n"
				+ "D:It's raining two-tailed squirrels\n"
				+ "E:Beach weather man!\n",
				"c" },
		//4.		
		{"Who is the boolean data type named after?\n"
				+ "A:True False\n"
				+ "B:False True\n"
				+ "C:I. Am Truth\n"
				+ "D:Steve Jobs\n"
				+ "E:George Boole\n",
				"e"},
		//5.
		{"What is the most common instruction set in personal computers today?\n"
				+ "A:Intel x86\n"
				+ "B:Intel 8051\n"
				+ "C:HP 2100\n"
				+ "D:picoJava\n"
				+ "E:IBM PowerPC\n",
				"a"},
		//6.
		{"Who was the president of Truman in 2014?\n"
				+ "A:Hack M. All\n"
				+ "B:Richard Nixon\n"
				+ "C:T-Pain\n"
				+ "D:Troy Paino\n"
				+ "E:The squirrels council\n",
				"d"},
		//7.		
		{"How much radiation is lethal to humans?\n"
				+ "A:Probably after you throw up\n"
				+ "B:Glowing is a bad sig\n"
				+ "C:30 gy\n"
				+ "D:Only if you eat it\n"
				+ "E:(Monstrous voice)...what radiation!?!\n",
				"c"},
		//8.
		{"What is the oldest building on campus?\n"
				+ "A:West Campus... duh\n"
				+ "B:Baldwin. You'd think they'd stop rebuilding it after 21 fires\n"
				+ "C:Kirk Building. A building so useless it has to be old\n"
				+ "D:How is Grim still standing?\n"
				+ "E:You're asking me about building ages? What?\n",
				"d"},
		//9.
		{"What is your favorite programming language?\n"
				+ "A:Prolog all the way. I love using a language no one uses\n"
				+ "B:Java. Who has time for memeory management?\n"
				+ "C:Assembly. I view programming as traversing the jungle with just a machete while blindfolded.\n"
				+ "D:Ada. Subtypes and verbosity are great!\n"
				+ "E:I think I'm just going to stick to python...\n",
				"b"},
		//10.
		{"What is the advantage of a strongly type language?\n"
				+ "A:Helps prevent errors from mixing data types\n"
				+ "B:It doesn't. Adding booleans to an object is a great idea!\n"
				+ "C:It's just a rule that prevents fun programming\n"
				+ "D:I like the freedom of python to do whatever I want!\n"
				+ "E:Hmmm... I've heard this term before somewhere...\n",
				"a"}};
}
