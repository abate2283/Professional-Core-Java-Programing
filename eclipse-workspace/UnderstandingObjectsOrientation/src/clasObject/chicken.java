package clasObject;

public class chicken extends Mammals {

	public chicken(String name, int age, int weightLb, String nature) {
		super(name, age, weightLb, nature);
		// when we create a class that doen't meet one of the criteria of the super constructor we can use overriding to change it.  
		
	}

	public static void main(String[] args) {
		
		Mammals chicken = new Mammals("hen", 3, 5, "walk");
		chicken.attributes();
		chicken.nature();
		
	}
}
	
/*

public void fly("Chicken don't fly..") {  //  This how you overide.  
	
}
	}  */

