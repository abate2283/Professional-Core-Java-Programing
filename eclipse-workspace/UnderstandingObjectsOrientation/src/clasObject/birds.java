package clasObject;

public class birds {

	String name;
	int age;
	int heightinInches;
	String colorType;
	int flying;
	String food;
	String food1;

	
	 
	 public birds(String name, int age, int heightinInches, String colorType, int flying, String food, String food1) {
		super();
		this.name = name;
		this.age = age;
		this.heightinInches = heightinInches;
		this.colorType = colorType;
		this.flying = flying;
		this.food = food;
		this.food1 = food1;
	}
	public void sound() {
		
			System.out.println("Hello my name is "  + name);
			System.out.println("I am  "+ age +  "  months old");
			System.out.println("My feathers are " +  colorType);
			System.out.println("I am  " + heightinInches +  "  inches tall");
		 
	 }
	 public void fly() {
		 
		 System.out.println("I can fly " + flying + "ft high.");
		
	 }
	 
	 public void eat() {
		 System.out.println("I eat " + food + " and " + food1);
	 }
 }
