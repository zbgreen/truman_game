package com.cs260.truman_game;

import java.util.ArrayList;

/**
 * Building class. This class will contains the name of the building and the
 * rooms that this building contains.
 *
 * @author Yong Zheng, Zach Green
 * @version 11/26/2014
 */
public class Building {
	private String buildingName;
	private ArrayList<Room> rooms;

	/**
	 * Constructor
	 * 
	 * @param buildingName the name for this building
	 * @param rooms the rooms at this building contains
	 */
	public Building(String buildingName, ArrayList<Room> rooms) {
		this.buildingName = buildingName;
		this.rooms = rooms;
	}

	/**
	 * Constructor
	 * 
	 * @param choiceCommandBuilding the choice of building selection
	 * @param rooms the rooms at this building contains
	 */
	public Building(int choiceCommandBuilding, ArrayList<Room> rooms) {
		if (choiceCommandBuilding == 1) {
			buildingName = "Violette Hall";
		} else if (choiceCommandBuilding == 2) {
			buildingName = "Baldwin Hall";
		} else if (choiceCommandBuilding == 3) {
			buildingName = "Ophelia Parrish";
		} else if (choiceCommandBuilding == 4) {
			buildingName = "Magruder Hall";
		}
		this.rooms = rooms;
	}

	/**
	 * Get the name of this building
	 * 
	 * @return the name of this building
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * Set the name for this building
	 * 
	 * @param buildingName the name for this building
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;

	}

	/**
	 * Add room to this building
	 * 
	 * @param room the room that is adding to this building
	 */
	public void addRoom(Room room) {
		rooms.add(room);
	}

	/**
	 * Get all of the rooms for this building
	 * 
	 * @return the ArrayList that contains all of the rooms in this building
	 */
	public ArrayList<Room> getRooms() {
		return rooms;
	}

	/**
	 * Setup the rooms
	 * 
	 * @param rooms the ArrayList that contains all of the rooms(3)
	 */
	public void setUpBuilding(ArrayList<Room> rooms) {
		if (buildingName.equals("Violette Hall")) {
			System.out.println("This is hall is the home to math and computer science.\n"
				+ "This building has seen a lot of change, with the latest being mounted machine guns outdoors.\n"
				+ "You know... to keep out the riff raff.");
			rooms.get(0).setRoomName(RoomVariable.roomNameVH[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameVH[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameVH[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionVH[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionVH[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionVH[2]);
		} else if (buildingName.equals("Baldwin Hall")) {
			System.out.println("Humanities and philosophy reside throughout.\n"
					+ "This building has burned down too many times to count.\n"
					+ "How long can it last? Or more importantly, how long can you last?");
			rooms.get(0).setRoomName(RoomVariable.roomNameBH[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameBH[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameBH[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionBH[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionBH[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionBH[2]);
		} else if (buildingName.equals("Ophelia Parrish")) {
			System.out.println("Affectionately know as OP to the arts students here.\n"
					+ "They say you can hear music even when no one is playing...");
			rooms.get(0).setRoomName(RoomVariable.roomNameOP[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameOP[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameOP[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionOP[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionOP[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionOP[2]);
		} else if (buildingName.equals("Magruder Hall")) {
			System.out.println("Maybe the most important building on campus given the circumstances.\n"
					+ "Home of the sciences, hopefully it can churn out solutions to our dire needs.");
			rooms.get(0).setRoomName(RoomVariable.roomNameMG[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameMG[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameMG[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionMG[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionMG[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionMG[2]);
		}
		rooms.get(0).addItemToRoomGeneral(buildingName);
		rooms.get(1).addItemToRoomMoreFood(buildingName);
		rooms.get(2).addItemToRoomMoreImportantItem(buildingName);
	}
}
