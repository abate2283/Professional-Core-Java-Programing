package clasObject;

public class KingdomFish extends Mammals{   // We added the word extends Mammals and it required us to call the super constructor: public Kingdom(String name, ...

	public KingdomFish(String name, int age, int weightLb, String nature) {
		super(name, age, weightLb, nature);
		
	}

	public static void main(String[] args) {
		
		Mammals fish = new Mammals("Tilapia", 3, 5, "swim fast.");
		Mammals fish1 = new Mammals("Mud fish", 10, 7, "swim smooth.");
		
		fish.attributes();
		fish.nature();
		fish1.attributes();
		fish1.nature();

	}

}
