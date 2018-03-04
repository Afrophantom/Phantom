import java.util.ArrayList;

public class Farm {

	private ArrayList<animal> farm;

	public Farm() {
		farm = new ArrayList<animal>();
	}

	public void addAnimal(animal a) {
		farm.add(a);
	}

	public void sing() {
		for (animal animal : farm)
			singContent(animal);
	}

			public void singContent(animal a){
				System.out.println("Old MacDonald had a farm. E-I-E-I-O! And on that farm he had a " + a.getType() + ". E-I-E-I-O! With a "
						+a.makeSound() + a.makeSound() + " here and a"
						 + a.makeSound()+ "there... Old MacDonald had a farm. E-I-E-I-O!");
			}
	}