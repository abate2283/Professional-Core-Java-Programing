package clasObject;

public class Zoo {

	public static void main(String[] args) {
		
		Animals mammal1 = new Animals("Elephant", 32, 140,"Gray","Herbivore",26);
		
		Animals mammal2 = new Animals("Lion", 23, 44, "brown", "carnivore", 50);
		mammal1.makeSounds();
		mammal1.eats();
		mammal1.walks();
		mammal2.makeSounds();
		mammal2.eats();
		mammal2.walks();  //REMEMBER OBJECT ARE NOT BORN UNTIL YOU RUN THE PROGRAM!
		
		
		/*Animals animal1 = new Animals();
		animal1.name = "Elephant";
		animal1.age = 32;
		animal1.height = 140;
		animal1.fast = 26;
		animal1.skinColor = "gray";
		animal1.food = "Herbivore";
		animal1.makeSounds();
		animal1.eats();
		animal1.walks();  */
		
	/*	Animals animal2 = new Animals();
		animal2.name = "Lion";
		animal2.age = 23;
		animal2.height = 44;
		animal2.fast = 50;
		animal2.skinColor = "brown";
		animal2.food = "carnivore";
		animal2.makeSounds();
		animal2.eats();
		animal2.walks();*/
	}

}
