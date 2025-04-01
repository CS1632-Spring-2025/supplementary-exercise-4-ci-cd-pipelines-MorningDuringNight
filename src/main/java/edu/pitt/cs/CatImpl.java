package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	Boolean isRented;
	String Cat_name;
	int ID;
	Boolean rentedBefore;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		ID = id;
		Cat_name = name;
		isRented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		isRented = true;
		
	}

	public void returnCat() {
		// TODO: Fill in
		if(isRented == false){

		}
		else{
			isRented = false;
		}
	}

	public void renameCat(String name) {
		// TODO: Fill in
		Cat_name = name;
	}

	public String getName() {
		// TODO: Fill in
		return Cat_name;
	}

	public int getId() {
		// TODO: Fill in
		return ID;
	}

	public boolean getRented() {
		// TODO: Fill in
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID "+ ID + ". " + Cat_name;
	}

}