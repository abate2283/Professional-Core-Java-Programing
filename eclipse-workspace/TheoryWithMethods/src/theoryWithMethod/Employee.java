package theoryWithMethod;

public class Employee {  // in the child class we need: 
						// 1. Attributes(name, age, color, height, etc.) String name;, String address;, int. id etc.  
						// 2.  We need behaviors: public void sellCar, public void inventory
						// 3.  Constructor: public Employee i.e public with class name, under the Attributes.
						//4.  We then create a parent class with the object from Employee, this class.  
	String name;
	String dept;
	int id;
	String address;
	String vehicle;
	String customer;
	
	public Employee() {
		
	}

	public void sellCar() {      //  These are the behaviors
		System.out.println("Hello I am " + name);
		System.out.println("My work id is " + id);
		System.out.println("I work in " + dept);

	}

	public void inventory() {     // another behavior.
		System.out.println("I live in, " + address);
		System.out.println("We have this " + vehicle);
		System.out.println("How can I help you,  " + customer);

	}

}
