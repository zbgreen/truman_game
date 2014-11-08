package com.cs260.truman_game;

/**
 * Item class. This class will contains the name and portability of the item.
 *
 * @author Yong Zheng
 * @version 11/04/2014
 */
public class Item {
	/**
	 * The name of the item
	 */
	private String itemName;
	/**
	 * The portability for this item
	 */
	private boolean portability;

	/**
	 * Constructor
	 * 
	 * @param itemName the name for the item
	 * @param portability the portability of the item
	 */
	public Item(String itemName, boolean portability) {
		this.itemName = itemName;
		this.portability = portability;
	}

	/**
	 * Get the name of the item
	 * 
	 * @return the name of the item
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Get the portability of the item
	 * 
	 * @return the portability of the item
	 */
	public boolean getPortability() {
		return portability;
	}
}
