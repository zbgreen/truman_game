package com.cs260.truman_game;

import java.util.ArrayList;

/**
 * Building class. This class will contains the name of the building and the
 * rooms that this building contains.
 *
 * @author Yong Zheng
 * @version 11/04/2014
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
			buildingName = "McClain Hall";
		} else if (choiceCommandBuilding == 3) {
			buildingName = "Ophelia Parrish";
		} else if (choiceCommandBuilding == 4) {
			buildingName = "Missouri Hall";
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
			rooms.get(0).setRoomName(RoomVariable.roomNameVH[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameVH[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameVH[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionVH[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionVH[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionVH[2]);
		} else if (buildingName.equals("McClain Hall")) {
			rooms.get(0).setRoomName(RoomVariable.roomNameMH[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameMH[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameMH[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionMH[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionMH[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionMH[2]);
		} else if (buildingName.equals("Ophelia Parrish")) {
			rooms.get(0).setRoomName(RoomVariable.roomNameOP[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameOP[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameOP[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionOP[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionOP[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionOP[2]);
		} else if (buildingName.equals("Missouri Hall")) {
			rooms.get(0).setRoomName(RoomVariable.roomNameMH[0]);
			rooms.get(1).setRoomName(RoomVariable.roomNameMH[1]);
			rooms.get(2).setRoomName(RoomVariable.roomNameMH[2]);
			rooms.get(0).setRoomDescription(RoomVariable.roomDescriptionMH[0]);
			rooms.get(1).setRoomDescription(RoomVariable.roomDescriptionMH[1]);
			rooms.get(2).setRoomDescription(RoomVariable.roomDescriptionMH[2]);
		}
		rooms.get(0).addItemToRoomGeneral(buildingName);
		rooms.get(1).addItemToRoomMoreFood(buildingName);
		rooms.get(2).addItemToRoomMoreImportantItem(buildingName);
	}
}
