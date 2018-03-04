package pro1;

public abstract class Pet {
	private String myOwner;
	private String myName;

	// creates a Pet with the given name & owner
	public Pet(String name, String owner) {
		myName = name;
		myOwner = owner;
	}

	// returns the name of the current owner
	public String getOwner() {
		return myOwner;
	}

	// changes the owner of this Pet
	public void changeOwner(String owner) {
		myOwner = owner;
	}

	// gets the name of this pet
	public String getName() {
		return myName;
	}

	// this pet has no sound, returns empty string
	public String speak() {
		return null;
	}

	// There may be other variables, constructors, and methods not shown.

}