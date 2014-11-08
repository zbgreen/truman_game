package com.cs260.truman_game;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * SpecialScene class. This class will contains all of the special scenes in the game.
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class SpecialScene {
	/**
	 * Special scene for the student to give the knowledge to the player
	 */
	public  void studentGiveKnowledge() {
		System.out.println("Whike you entering the room, there is also another student who is also in this room. You talked to that student for a while, and you gained knowledge from following statement:");
		System.out.println("Student: "+ KnowledgeBank.KNOWLEDGE[(int) (Math.random() * KnowledgeBank.KNOWLEDGE.length)]+ "\n");
	}
	
	/**
	 * Special scene for the faculty member to ask question to the player
	 * 
	 * @param rooms the rooms that the building contains
	 * @param roomChoiceCommand the room choice that the player decision to
	 *        enter
	 * @param building the building object
	 */
	public void facultyMemberGiveQuestion(ArrayList<Room> rooms,
			int roomChoiceCommand, Building building, Scanner in) {
		System.out.println("While you are entering this room, a faculty member asks you:");
		int questionNumber = (int) (Math.random() * QuestionBank.QUESTION.length);
		System.out.println(QuestionBank.QUESTION[questionNumber][0]);
		System.out.print("What you think the answer should be (letter): ");
		String answer = in.nextLine();
		answer.toLowerCase();
		if (answer.equals(QuestionBank.QUESTION[questionNumber][1])) {
			rooms.get(roomChoiceCommand - 1).addImportantItem(
					building.getBuildingName());
			System.out
					.println("You answered correctly, I will leave one more important item in this room");
		} else {
			System.out
					.println("You answered incorrectly. You should go study sometime.");
		}
		System.out.println();
	}
	
	/**
	 * Special scene for the the monster to attack the player
	 * 
	 * @param player the player object for this game
	 * @param monsterDamage the max damage that a monster can cause
	 */
	public void monsterAttack(Player player, int monsterDamage) {
		System.out
				.println("While you entering this room, a monster attack you.");
		int damage = (int) (Math.random() * monsterDamage);
		System.out
				.println("The monster caused make you lost " + damage + " HP");
		player.setHP(damage);
		System.out.println("Your current HP is " + player.getHP());
	}
	
	public void attackByRainyDay(String weather,Player player){
		int numberOfItemToLost=(int) (Math.random()*player.getInventory().size()+1);
		if(weather.equals("rainny")){
			for(int i=0;i<numberOfItemToLost;i++){
				String itemName=player.getInventory().get(i).getItemName();
				player.removeItemInventory(itemName);
				System.out.println("You lost ["+itemName+"] due to the heavy rainy outside.");
			}
		}
	}
}
