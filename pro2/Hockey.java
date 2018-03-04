package pro2;

public class Hockey extends Athlete {
	private int myTrophies;
	public Hockey(String name, int age, int trophies) {
		super(name, age);
		myTrophies= trophies;
	}
	
	
	public int getmyTrophies() {
		return myTrophies;
	}

	public String experience(){
		
		if (myTrophies>5){
			
			return "I have a lot of experience";	
		}
		else{
			
			return "I dont have much experience";
		}
		
	}
	
	public String minTrophies(int trophies){
		if(trophies<=myTrophies){
			return "I have enough";
			
		}
		else{
			
			return "I need more";
		}
		
	}


}
