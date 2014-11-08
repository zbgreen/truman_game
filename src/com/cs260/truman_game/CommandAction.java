package com.cs260.truman_game;

/**
 * Command Action class. This class will test the validity of the command and
 * perform the correct response reaction
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class CommandAction {

	/**
	 * Test if the action command is valid
	 * 
	 * @param room the room object
	 * @param player the player object for this game
	 * @param maxHPRestore the max HP that the player can restore
	 */
	public void validActionCommand(Room room, Player player, int maxHPRestore) {
		boolean exitRoom = false;
		while (exitRoom == false) {
			// Print out the action command every time
			Command.printActionCommand();
			System.out
					.print("\nWhich action command do you want to perform (word): ");
			String inputCommand = GameStart.in.nextLine();
			inputCommand.toLowerCase();
			// Check which command to perform
			if (inputCommand.contains("take")) {
				String item = wordAfterBlank(inputCommand);
				room.removeItem(item, player);
			} else if (inputCommand.equals("help")) {
				System.out
						.println("You yieled to the screen...but nothing speicial happen");
			} else if (inputCommand.equals("inventory")) {
				// Pint out the item in player's inventory
				player.printInventory();
				// Ask the player for input command and check if the command is
				// valid
				validInventoryCommand(player, maxHPRestore);
			} else if (inputCommand.equals("exit")) {
				exitRoom = true;
			} else {
				System.out.println("Invalid action command.Please try again!");
			}
		}
	}

	/**
	 * Test if the inventory command is valid
	 * 
	 * @param player the player object for this game
	 * @param maxHPRestore the max HP that the player can restore
	 */
	public void validInventoryCommand(Player player, int maxHPRestore) {
		boolean exitInventory = false;
		while (exitInventory == false) {
			// Print out the inventory command for the player
			Command.printInventoryCommand();
			System.out
					.print("\nWhich inventory action do you want to use (word):");
			String input = GameStart.in.nextLine();
			input.toLowerCase();
			// Check which command to perform
			if (input.contains("consume")) {
				String item = wordAfterBlank(input);
				if (player.removeItemSuccess(item) == true) {
					System.out.println("You consumed [" + item.toLowerCase()
							+ "] from your inventory.");
					// Restore the random HP after player consumed food
					int restoredHP = (int) (Math.random() * maxHPRestore) + 1;
					System.out.println("You restore " + restoredHP
							+ " after consumed " + item);
					player.setHP(restoredHP);
					System.out.println("Your current HP is " + player.getHP());
					player.removeItemInventory(item);
				} else {
					System.out.println("Consume [" + item + "] failed.");
				}
			} else if (input.equals("exit")) {
				exitInventory = true;
			}
		}
	}

	/**
	 * Helper method that is using to get the word after the space
	 * 
	 * @param word the command that the player typed
	 */
	public String wordAfterBlank(String word) {
		int pos = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				pos = i;
			}
		}
		return word.substring(pos + 1).toLowerCase();
	}

	/**
	 * Test if the outside building command is valid; The selecting building
	 * process
	 */
	public int validCommandOutSide() {
		int choiceCommand = 0;
		while (!(choiceCommand > 0 && choiceCommand < 5)) {
			// Print out the command outside the building (selecting building)
			// for the player
			Command.printCommandOutSide();
			System.out.print("\nWhich building do you want to go (integer): ");
			if (GameStart.in.hasNextInt()) {
				choiceCommand = GameStart.in.nextInt();
				// check valid input
				if (!(choiceCommand > 0 && choiceCommand < 5)) {
					System.out
							.println("Invalid building command. PLease try again!");
				}
			} else {
				System.out
						.println("Invalid building command. PLease try again!");
			}
			// Clear up the end-of-line character
			GameStart.in.nextLine();
		}
		return choiceCommand;
	}

	/**
	 * Test if the inside building command is valid; The selecting room process
	 * 
	 * @param building the building object
	 */
	public static int validCommandInsideBuilding(Building building) {
		int choiceCommand = 0;
		while (!(choiceCommand > 0 && choiceCommand < 5)) {
			// Print out the command inside the building (selecting rooms)
			// for the player
			Command.printCommandInside(building);
			System.out.print("\nWhich room do you want to enter (integer): ");
			if (GameStart.in.hasNextInt()) {
				choiceCommand = GameStart.in.nextInt();
				// check valid input
				if (!(choiceCommand > 0 && choiceCommand < 5)) {
					System.out.println("Invalid room command. PLease try again!");
				}
			} else {
				GameStart.in.next();
				System.out.println("Invalid room command. PLease try again!");
			}
			// Clear up the end-of-line character
			GameStart.in.nextLine();
		}
		return choiceCommand;
	}
}
