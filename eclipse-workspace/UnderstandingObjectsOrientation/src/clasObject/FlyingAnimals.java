package clasObject;

public class FlyingAnimals {

	public static void main(String[] args) {
		
		birds aBird = new birds("Sparrow", 23, 45, "black and white", 100, "grain", "plants");
		birds aBird1 = new birds("Robin",1, 6, "purple", 50, "seeds", "leaves" );
		aBird.eat();
		aBird.sound();
		aBird.fly();
		aBird1.eat();
		aBird1.sound();
		aBird1.fly();
		
		
	/*	birds aBird = new birds();  object oriented programming is better than dumping all files in one file. it's a way to organize our code to multiple file and organized them to make a logical sense.  
		aBird.age=(23);
		aBird.colorType =("black and white");
		aBird.heightinInches = (45);
		aBird.name = ("Sparrow");
		aBird.flying = (100);
		aBird.food = ("grain"); aBird.food1 = ("plants");
		aBird.eat();
		aBird.sound();
		aBird.fly();   */
		
		
		
	}

}
