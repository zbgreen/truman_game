package com.cs260.truman_game;

import java.util.ArrayList;

/**
 * Room class. This class will contains the name for this room, the description
 * for this room, and the items this room contains
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class Room {
	/**
	 * The name of this room
	 */
	private String roomName;
	/**
	 * The description for this room
	 */
	private String roomDescription;
	/**
	 * The items that this room contains
	 */
	private ArrayList<Item> items;
	/**
	 * The max number of items that this room can contain
	 */
	private final int MAX_NUMBER_OF_ITEM_IN_THE_ROOM = 5;
	/**
	 * The number that is use to setup the random items in the room
	 */
	private final int MAX_CHOICE = 10;

	/**
	 * Constructor
	 * 
	 * @param roomName the name for this room
	 * @param roomDescription the description for this room
	 * @param items the ArrayList that contains the items in the room
	 */
	public Room(String roomName, String roomDescription, ArrayList<Item> items) {
		this.roomName = roomName;
		this.roomDescription = roomDescription;
		this.items = items;
	}

	/**
	 * Get the name of this room
	 * 
	 * @return the name of this room
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * Get the description of this room
	 * 
	 * @return the description of this room
	 */
	public String getRoomDescription() {
		return roomDescription;
	}

	/**
	 * Set the name for this room
	 * 
	 * @param roomName the name for this room
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * Set the description for this room
	 * 
	 * @param roomDescription the name for this description
	 */
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	/**
	 * Get the items in the room
	 */
	public void getRoomItems() {
		System.out.print("\nRoom " + roomName + " contains: ");
		for (int i = 0; i < items.size(); i++) {
			System.out.print(" [" + items.get(i).getItemName() + "] ");
		}
		System.out.println();
	}

	/**
	 * Remove the item from the room
	 * 
	 * @param item the name for this item
	 * @param player the player
	 */
	public void removeItem(String item, Player player) {
		boolean itemFound = false;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getItemName().equalsIgnoreCase(item)) {
				itemFound = true;
				if (items.get(i).getPortability() == true) {
					if (player.addItemSuccess(item)) {
						player.addItemToInventory(item);
						items.remove(i);
						// Avoid remove twice
						break;
					}
				} else {
					System.out.println("I can't carry ["
							+ items.get(i).getItemName() + "] with me!");
				}
			}
		}
		if (itemFound == false) {
			System.out.println("[" + item + "] doesn't exist in this room");
		}
		getRoomItems();
	}

	/**
	 * Add random items to the room 
	 * 
	 * @param buildingName the name for this building (general setup)
	 */
	public void addItemToRoomGeneral(String buildingName) {
		// Remove existed items first
		items.removeAll(items);
		int numberOfItems = (int) (Math.random()
				* MAX_NUMBER_OF_ITEM_IN_THE_ROOM + 1);
		for (int i = 0; i < numberOfItems; i++) {
			int luckyNumber = (int) (Math.random() * MAX_CHOICE);
			switch (luckyNumber) {
			case 0:
			case 1:
				items.add(new Item(ItemVariables.FOOD[(int) Math.random()
						* ItemVariables.FOOD.length], true));
				break;
			case 2:
			case 3:
				items.add(new Item(ItemVariables.DRINK[(int) Math.random()
						* ItemVariables.DRINK.length], true));
				break;
			case 4:
				items.add(new Item(ItemVariables.FIXED_ITEM[(int) Math.random()
						* ItemVariables.FIXED_ITEM.length], false));
				break;
			case 6:
			case 7:
				// Adding the important items to the different building
				addImportantItem(buildingName);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Add random items to the room with higher chance of getting the food/drink
	 * 
	 * @param buildingName the name for this building (more food setup)
	 */
	public void addItemToRoomMoreFood(String buildingName) {
		// Remove existed items first
		items.removeAll(items);
		int numberOfItems = (int) (Math.random()
				* MAX_NUMBER_OF_ITEM_IN_THE_ROOM + 1);
		for (int i = 0; i < numberOfItems; i++) {
			int luckyNumber = (int) (Math.random() * MAX_CHOICE);
			switch (luckyNumber) {
			case 0:
			case 1:
			case 2:
				items.add(new Item(ItemVariables.FOOD[(int) Math.random()
						* ItemVariables.FOOD.length], true));
				break;
			case 3:
			case 4:
			case 5:
				items.add(new Item(ItemVariables.DRINK[(int) Math.random()
						* ItemVariables.DRINK.length], true));
				break;
			case 6:
				items.add(new Item(ItemVariables.FIXED_ITEM[(int) Math.random()
						* ItemVariables.FIXED_ITEM.length], false));
				break;
			case 7:
				// Adding the important items to the different building
				addImportantItem(buildingName);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Add random items to the room with higher change of getting the important items
	 * 
	 * @param buildingName the name for this building (more monsters setup)
	 */
	public void addItemToRoomMoreImportantItem(String buildingName) {
		// Remove existed items first
		items.removeAll(items);
		int numberOfItems = (int) (Math.random()
				* MAX_NUMBER_OF_ITEM_IN_THE_ROOM + 1);
		for (int i = 0; i < numberOfItems; i++) {
			int luckyNumber = (int) (Math.random() * MAX_CHOICE);
			switch (luckyNumber) {
			case 0:
				items.add(new Item(ItemVariables.FOOD[(int) Math.random()
						* ItemVariables.FOOD.length], true));
				break;
			case 1:
				items.add(new Item(ItemVariables.DRINK[(int) Math.random()
						* ItemVariables.DRINK.length], true));
				break;
			case 2:
				items.add(new Item(ItemVariables.FIXED_ITEM[(int) Math.random()
						* ItemVariables.FIXED_ITEM.length], false));
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				addImportantItem(buildingName);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Add the important items to the correct response room in the building
	 * 
	 * @param buildingName the name for this building
	 */
	public void addImportantItem(String buildingName) {
		if (buildingName.equals("Violette Hall")) {
			items.add(new Item(ItemVariables.IMPORTANT_ITEM_VH[(int) (Math
					.random() * ItemVariables.IMPORTANT_ITEM_VH.length)], true));
		} else if (buildingName.equals("McClain Hall")) {
			items.add(new Item(ItemVariables.IMPORTANT_ITEM_MC[(int) (Math
					.random() * ItemVariables.IMPORTANT_ITEM_MC.length)], true));
		} else if (buildingName.equals("Ophelia Parrish")) {
			items.add(new Item(ItemVariables.IMPORTANT_ITEM_OP[(int) (Math
					.random() * ItemVariables.IMPORTANT_ITEM_OP.length)], true));
		} else if (buildingName.equals("Missouri Hall")) {
			items.add(new Item(ItemVariables.IMPORTANT_ITEM_MH[(int) (Math
					.random() * ItemVariables.IMPORTANT_ITEM_MH.length)], true));
		}
	}

}
