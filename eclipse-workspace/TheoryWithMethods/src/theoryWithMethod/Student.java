package theoryWithMethod;

public class Student {

	String firstName;
	String middleInitial;
	String lastName;
	int age;
	String street;
	String city;
	float ZipCode;
	String state;
	String country;
	float fees;
	String race;
	String major;


	
	

	public Student(String firstName, String middleInitial, String lastName, int age, String street, String city,
			float zipCode, String state, String country, float fees, String race, String major) {
		super();
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.age = age;
		this.street = street;
		this.city = city;
		ZipCode = zipCode;
		this.state = state;
		this.country = country;
		this.fees = fees;
		this.race = race;
		this.major = major;
	}

	public void demography() { // Behavior
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Race: " + race);


	}

	public void Address() {

		System.out.println("Street: " + street);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}

	
	public void registration() {
		System.out.println("Major: " + major);
		System.out.println("Tuition:$" + fees + " per semester.");
		
	}
}
