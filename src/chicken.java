public class chicken implements animal {

	public String makeSound(){
			
		return Math.random() >= 0.5 ? "bawk" : "cluck";
		
		}

	public String getType() {

		return "chicken";

	}
}
