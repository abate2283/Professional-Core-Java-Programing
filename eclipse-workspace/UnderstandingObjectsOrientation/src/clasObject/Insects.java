package clasObject;

public class Insects extends Mammals implements Flyable{   
	public Insects(String name, int age, int weightLb, String nature) {
		super(name, age, weightLb, nature);
		
	}

// The same thing happens here with the super constructor.  

	public static void main(String[] args) {
		
		Mammals Insect = new Mammals("Criket", 1, 0, "fly");
		Mammals Insecta = new Mammals("Spider", 2, 0, "screech");
		Insect.attributes();
		Insect.nature();
		Insecta.attributes();
		Insecta.nature();
		
		
	}

	
	public void fly() {  // Here we have applied the interface and see how it affect this class only.  
							// AN INTERFACE IS A CONTRACT FOR A CLASS TO AGREE TO USE IT'S METHOD.  A CLASS CAN HAVE MANY INTERFACES BUT ONE PARENT.  
		
		
	}

}
