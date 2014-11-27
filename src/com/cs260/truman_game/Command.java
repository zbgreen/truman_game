package com.cs260.truman_game;

/**
 * Command class. This class will print all of the available comments that
 * player can choose in this game
 *
 * @author Yong Zheng, Zach Green
 * @version 11/26/2014
 */
public class Command {

	/**
	 * Print the command for rule
	 */
	public static void printRule() {
		System.out.println("Welcome to the the Truman Game. ");
		System.out.println("Introduction:\n"
				+ "This game is based at Truman State University but not as we know it.\n"
				+ "Fast forward 50 years into the future and a lot has changed.\n"
				+ "Nuclear war has carnaged North America and Truman’s campus is no exception.\n "
				+ "Many buildings have been destroyed and the constant radiation has taken\n"
				+ "its toll on life. However, despite all of this, class is still in\n"
				+ "session at our university. Even nuclear war cannot stop critical\n"
				+ "thinking and the liberal arts education. A classic game of\n"
				+ "survival with the necessity of graduating in order to escape\n"
				+ "the doomed university.");
		System.out.println("The rules for this game:");
		System.out.println("1.In order to win this game, you need to find 8 importants items from 4 differnt buildings in order to graduate.");
		System.out.println("2.Everytime when you enter a room or a building, there maybe an existance of a student/professor.\n"
				+ " Feel free to talk to them and you may be able to get some help from them.");
	}

	/**
	 * Print the command for selecting which building to enter
	 */
	public static void printCommandOutSide() {
		System.out.println("\nWhich building do you want to enter:");
		System.out.println("1.Go to Violette Hall");
		System.out.println("2.Go to Baldwin Hall");
		System.out.println("3.Go to Ophelia Parrish");
		System.out.println("4.Go to Magruder Hall");
	}

	/**
	 * Print the command for selecting which room to enter
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
