package pro2;

public class FootballPlayer extends Athlete {
	private int myInjuries;
	public FootballPlayer(String name, int age, int injuries) {
		super(name, age);
		myInjuries= injuries;
	}
	
	public int getMyInjuries() {
		return myInjuries;
	}

}
