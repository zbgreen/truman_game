package com.cs260.truman_game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class. This class will run the game.
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class GameStart {
	/**
	 * Global scanner that is using to get player's inputs
	 */
	public final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Choice of different rooms
		 */
		final int FIRST_ROOM = 1;
		final int SECOND_ROOM = 2;
		final int THIRD_ROOM = 3;
		final int EXIT_ROOM = 4;

		final int NUMBER_TEN = 10;
		final int MONSTER_DAMAGE = -20;
		final int MAX_HP_RESTORE = 20;

		/**
		 * Set up the player
		 */
		ArrayList<Item> inventory = new ArrayList<Item>();
		final int PLAYER_HP = 100;
		Player player = new Player(PLAYER_HP, inventory);

		/**
		 * Set up for building (rooms of the building);
		 * All of the items will be generate randomly, so I will share one items
		 * by all rooms
		 */
		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<Room> rooms = new ArrayList<Room>();
		// Adding three rooms to the rooms object
		for (int i = 0; i < 3; i++) {
			Room room = new Room("", "", items);
			rooms.add(room);
		}

		/**
		 * Test if the the player lost already
		 */
		boolean lost = false;

		SpecialScene scene = new SpecialScene();

		CommandAction commandAction = new CommandAction();

		Command.printRule();
		while (player.checkEndOfCollection() == false
				&& player.checkPlayerAlive() == true) {
			int numberSeven = 7;
			int numberSix = 6;
			int numberFour = 4;

			// Print out current weather
			String currentWeather = Weather.weather[(int) (Math.random() * Weather.weather.length)];
			System.out.println("\nThe weather outside is " + currentWeather);
			scene.attackByRainyDay(currentWeather, player);

			// Make choice for the building to enter
			int choiceCommandBuilding = commandAction.validCommandOutSide();
			// Create new building after selection
			Building building = new Building(choiceCommandBuilding, rooms);

			boolean exitRoom = false;
			while (exitRoom == false && lost == false) {
				// Setup for the room
				building.setUpBuilding(rooms);
				// Make choice for the room to enter
				int roomChoiceCommand = CommandAction
						.validCommandInsideBuilding(building);

				int randomNumber = (int) (Math.random() * NUMBER_TEN);
				if (roomChoiceCommand == EXIT_ROOM) {
					exitRoom = true;
					break;
				} else if (roomChoiceCommand == FIRST_ROOM) {
					// Special scenes for FIRST_ROOM in the building
					if (randomNumber == numberSeven) {
						scene.studentGiveKnowledge();
					} else if (randomNumber == numberSix) {
						scene.monsterAttack(player, MONSTER_DAMAGE);
						if (player.checkPlayerAlive() == false) {
							lost = true;
						}
					}
				} else if (roomChoiceCommand == THIRD_ROOM) {
					// Special scenes for SECOND_ROOM in the building
					if (randomNumber == numberSeven) {
						scene.facultyMemberGiveQuestion(rooms,
								roomChoiceCommand, building, in);
					} else if (randomNumber > numberFour) {
						scene.monsterAttack(player, MONSTER_DAMAGE);
						if (player.checkPlayerAlive() == false) {
							lost = true;
						}
					}
				} else if (roomChoiceCommand == SECOND_ROOM) {
					// Special scenes for THIRD_ROOM in the building
					if (randomNumber == numberSeven) {
						scene.studentGiveKnowledge();
					} else if (randomNumber == numberSix) {
						scene.facultyMemberGiveQuestion(rooms,
								roomChoiceCommand, building, in);
					}
				}
				if (lost == false) {
					// If the game is not end, then print out the items in the
					// room
					rooms.get(roomChoiceCommand - 1).getRoomItems();
					// Perform the action command
					commandAction.validActionCommand(
							rooms.get(roomChoiceCommand - 1), player,
							MAX_HP_RESTORE);
				}
			}
		}
		if (lost == true) {
			System.out.println("You lost");
		} else {
			System.out.println("Here is the exam");
			// Need more here
			// Need some question sets for the final exam
		}
	}
}
