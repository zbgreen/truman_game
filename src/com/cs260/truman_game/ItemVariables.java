package com.cs260.truman_game;

/**
 * ItemVariables class. This class will contains all of the variables that the item can have.
 *
 * @author Yong Zheng, Zach Green
 * @version 11/26/2014
 */

public class ItemVariables {
	/**
	 * The array that contains all of the food
	 */
	public static final String[] FOOD = { "apple", "orange", "banana",
			"pineapple", "peach", "rice", "noodle", "sandwich" };

	/**
	 * The array that contains all of the drink
	 */
	public static final String[] DRINK = { "water" };

	/**
	 * The array that contains all of the fixed item (the item that the player
	 * can't take away)
	 */
	public static final String[] FIXED_ITEM = { "desk", "blackboard", "rat", "cockroach", "pencil"
			+ "paper" };

	/**
	 * The array that contains the important items in Violette Hall
	 */
	public static final String[] IMPORTANT_ITEM_VH = { "mathcredit", "cscredit" };
	/**
	 * The array that contains the important items in Baldwin Hall
	 */
	public static final String[] IMPORTANT_ITEM_BH = { "philosophycredit", "religioncredit" };
	/**
	 * The array that contains the important items in Ophelia Parrish
	 */
	public static final String[] IMPORTANT_ITEM_OP = { "artcredit", "musiccredit" };
	/**
	 * The array that contains the important items in Magruder Hall
	 */
	public static final String[] IMPORTANT_ITEM_MG = { "biocredit", "chemcredit" };
}
