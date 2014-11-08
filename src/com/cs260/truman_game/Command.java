package com.cs260.truman_game;

/**
 * Command class. This class will print all of the available comments that
 * player can choose in this game
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class Command {

	/**
	 * Print the command for rule
	 */
	public static void printRule() {
		System.out.println("Welcome to the the Truman Game. ");
		System.out.println("The rule for this game:");
		System.out.println("1.In order to win this game, you need to find 8 importants items from 4 differnt buildings in order to graduate.");
		System.out.println("2.Everytime when you enter a room or a building, there maybe an existance of a student/professor. Feel free to talk to them and you may be able to get some help from them.");
	}

	/**
	 * Print the command for selecting which building to enter
	 */
	public static void printCommandOutSide() {
		System.out.println("\nWhich building do you want to enter:");
		System.out.println("1.Go to Violette Hall");
		System.out.println("2.Go to McClain Hall");
		System.out.println("3.Go to Ophelia Parrish");
		System.out.println("4.Go to Missouri Hall");
	}

	/**
	 * Print the command for selecting which room to enter in McClain Hall
	 */
	public static void printCommandInside(Building building) {
		System.out.println("\nWhich room do you want to enter:");
		System.out.println("1.Enter "+ building.getRooms().get(0).getRoomName());
		System.out.println("2.Enter "+ building.getRooms().get(1).getRoomName());
		System.out.println("3.Enter "+ building.getRooms().get(2).getRoomName());
		System.out.println("4.Exit");
	}

	/**
	 * Print the action command to the player when the player is in the room
	 */
	public static void printActionCommand() {
		System.out.println("\nWhich action do you want to use:");
		System.out.println("Take \'objectName\'");
		System.out.println("Help");
		System.out.println("Inventory");
		System.out.println("Exit");
	}

	/**
	 * Print the action command to the player when the player open the inventory
	 */
	public static void printInventoryCommand() {
		System.out.println("\nWhich inventory action do you want to use:");
		System.out.println("Consume \'objectName\'");
		System.out.println("Exit");
	}
}
