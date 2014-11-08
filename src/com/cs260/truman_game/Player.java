package com.cs260.truman_game;

import java.util.ArrayList;

/**
 * Player class. This class will contains the player's HP and inventory.
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class Player {
	/**
	 * The HP for the player
	 */
	private int HP;
	/**
	 * The inventory for the player
	 */
	private ArrayList<Item> inventory;

	/**
	 * Constructor
	 * 
	 * @param HP the HP for the player
	 * @param inventory the inventory for the player
	 */
	public Player(int HP, ArrayList<Item> inventory) {
		this.HP = HP;
		this.inventory = inventory;
	}

	/**
	 * Get the inventory for the player
	 * 
	 * @return the inventory for the player
	 */
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	/**
	 * Get the HP for the player
	 * 
	 * @return the HP for the player
	 */
	public int getHP() {
		return HP;
	}

	/**
	 * Change the player's HP
	 * 
	 * @param change the value(+/-) that is add to the player's HP
	 */
	public void setHP(int change) {
		HP += change;
	}

	/**
	 * Check if the player found all 8 important items
	 * 
	 * @param player the player object for this game
	 */
	public boolean checkPlayerAlive() {
		if (HP <= 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Print the player's inventory
	 */
	public void printInventory() {
		String inventoryDetail = "Your inventory contains: ";
		if (inventory.size() != 0) {
			for (int i = 0; i < inventory.size(); i++) {
				inventoryDetail += " ["
						+ inventory.get(i).getItemName().toLowerCase() + "] ";
			}
		}
		System.out.println(inventoryDetail);
	}

	/**
	 * Check if the player got all 8 important items
	 */
	public boolean checkEndOfCollection() {
		int counter = 0;
		int numberOfImportantItem = 8;
		for (int i = 0; i < inventory.size(); i++) {
			for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_VH.length; j++) {
				if (inventory.get(i).getItemName()
						.equals(ItemVariables.IMPORTANT_ITEM_VH[j])) {
					counter++;
				}
			}
			for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_MC.length; j++) {
				if (inventory.get(i).getItemName()
						.equals(ItemVariables.IMPORTANT_ITEM_MC[j])) {
					counter++;
				}
			}
			for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_OP.length; j++) {
				if (inventory.get(i).getItemName()
						.equals(ItemVariables.IMPORTANT_ITEM_OP[j])) {
					counter++;
				}
			}
			for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_MH.length; j++) {
				if (inventory.get(i).getItemName()
						.equals(ItemVariables.IMPORTANT_ITEM_MH[j])) {
					counter++;
				}
			}
		}
		if (counter == numberOfImportantItem) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Test if the adding item to inventory process is success. The inventory
	 * can contain only unique items
	 * 
	 * @param item the name for the item
	 */
	public boolean addItemSuccess(String item) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getItemName().equals(item)) {
				System.out
						.println("The item ["
								+ item.toLowerCase()
								+ "] already existed in your inventory. You can only carry one for each item.");
				return false;
			}
		}
		return true;
	}

	/**
	 * Add the item to the inventory
	 * 
	 * @param item the name for this item
	 */
	public void addItemToInventory(String item) {
		System.out.println("You added [" + item.toLowerCase()
				+ "] to your inventory.");
		inventory.add(new Item(item, true));
	}

	/**
	 * Remove the item from the inventory
	 * 
	 * @param item the name for this item
	 */
	public void removeItemInventory(String item) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getItemName().equals(item)) {
				inventory.remove(i);
			}
		}
	}

	/**
	 * Test if the removing item from inventory process is success. Player can
	 * only remove non-important item from the inventory
	 * 
	 * @param item the name for the item
	 */
	public boolean removeItemSuccess(String item) {
		for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_VH.length; j++) {
			if (item.equals(ItemVariables.IMPORTANT_ITEM_VH[j])) {
				return false;
			}
		}
		for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_MC.length; j++) {
			if (item.equals(ItemVariables.IMPORTANT_ITEM_MC[j])) {
				return false;
			}
		}
		for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_OP.length; j++) {
			if (item.equals(ItemVariables.IMPORTANT_ITEM_OP[j])) {
				return false;
			}
		}
		for (int j = 0; j < ItemVariables.IMPORTANT_ITEM_MH.length; j++) {
			if (item.equals(ItemVariables.IMPORTANT_ITEM_MH[j])) {
				return false;
			}
		}
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getItemName().equals(item)) {
				return true;
			}
		}
		return false;
	}

}
