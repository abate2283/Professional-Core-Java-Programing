package clasObject;

public abstract class Animals {
	
	String name;
	int age;
	int height;
	String skinColor;
	String food;
	int fast;


	public Animals(String name, int age, int height, String skinColor, String food, int fast) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.skinColor = skinColor;
		this.food = food;
		this.fast = fast;
	}
	public void makeSounds() {
		System.out.println("Hello, my name is  " + name);
		System.out.println("I am Just " + age + " years young");
		System.out.println("I am " + height + "inches tall");
		System.out.println("My skin color is  " + skinColor);
		
	}
	public void eats() {
		
		System.out.println("I am a " + food);
		
		
		
		
	}
	public void walks() {
		System.out.println("I can run " + fast + "m/h");
	
		
	}
	
	public abstract void move();
}

