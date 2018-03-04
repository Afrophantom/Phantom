package pro1;

import java.util.ArrayList;

public class Morkie extends Dog {
	private String myTemperment;
	private int myHeight;
	private ArrayList<String> tricks;

	public Morkie(String inName, String inOwner, int inTrain, String temperment, int height) {
		super(inName, inOwner, inTrain);
		myTemperment = temperment;
		myHeight= height;
	}
	
	
	public String getMyTemperment() {
		return myTemperment;
	}
	public int getMyHeight() {
		return myHeight;
	}
	
	public String canJumpRope(){
		
		if(myHeight>5){
			
			return "I can Jump Rope!!!!";
			
		}
		else{
		
			return "I cant :(";
			
		}
		
	}
	
	public String speak(){
		return "woof";
		
	}

	public void learnNewTrick(String trickName) {
	
			tricks.add(trickName);
		
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

}
