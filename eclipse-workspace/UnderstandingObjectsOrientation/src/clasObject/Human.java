package clasObject;

public class Human {
	
	
	String name;
	int age;
	int heightinInches;
	String haircolor;
	

		
	
	public Human(String name, int age, int heightinInches, String haircolor) {
		super();
		this.name = name;
		this.age = age;
		this.heightinInches = heightinInches;
		this.haircolor = haircolor;
	}

	public void speak() {
		
		System.out.println("Hello my name is "  + name);
		System.out.println("I am  "+ age +  "  years old");
		System.out.println("My hair is " +  haircolor);
		System.out.println("I am  " + heightinInches +  "  inches tall");

	}
	
	public void eat() {
		System.out.println("Eating...");
	}

	public void walk() {
		System.out.println("Walking...");
	}
	
	public void work() {
		System.out.println("Working...");
	}
}
