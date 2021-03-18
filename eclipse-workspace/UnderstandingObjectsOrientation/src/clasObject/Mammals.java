package clasObject;

public class Mammals{  
	
	String name;
	int age;
	int weightLb;
	String nature;
	
	
public Mammals(String name, int age, int weightLb, String nature) {  // LECTURE FOR INHERITANCE! THIS IS THE PARENT CLASS OR SUPER CLASS
		super();													// This is the super constructor.  	
		this.name = name;
		this.age = age;
		this.weightLb = weightLb;
		this.nature = nature;
	}
public void nature() {
	System.out.println("What I do best is " + nature);
	
}
public void attributes() {
	System.out.println("Hello my name is " + name);
	System.out.println("I am " + age + "months old.");
	System.out.println("I only weigh " + weightLb + "lbs.");
	
		
}
}
/*
public void fly() {   // This is What the INTERFACE DID.  It brings the fly method on demand.
	
	
}
}
/*
public void fly() {
	System.out.println("I can fly..");  // we remove this method and then create an interface, to use whenever we want to.  
}
}
*/