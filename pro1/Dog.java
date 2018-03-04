package pro1;

import java.util.ArrayList;

public class Dog extends Pet {
	private int myTrain;
	private ArrayList<String> tricks;

	public Dog(String name, String owner, int train) {
		super(name, owner);
		myTrain = train;
		tricks = new ArrayList<String>();
	}

	public String speak(){
		if(Math.random() < 0.7){
			return "Woof!";
		}
		else{
			return "Bark!";
		}
	}

	public void learnNewTrick(int difficulty, String trickName) {
		if (difficulty <= myTrain){
			tricks.add(trickName);
		}
		}
	
	public String canJump(){
		if(myTrain>0){
			return "Jump!";
		}
		else{
			return "Cannot Jump";
		}
		
	}

	public String doTrick(){
		int index = (int)(Math.random() * tricks.size());
		if(tricks.size() > 0){
			return tricks.get(index);
		}
		else{
			return null;
		}
	}
	public String eat(){
		if(Math.random() < 0.5){
			return "I eat meat!";
		}
		else{
			return "I eat cookies!";
		}
	}
	
}