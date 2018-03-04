package pro2;

public class Goalie extends Hockey {
	private int mySaves;
	public Goalie(String name, int age, int experience, int saves) {
		super(name, age, experience);
		mySaves= saves;
	}
	
	
	
	public int getMySaves() {
		return mySaves;
	}

	
}
