package theoryWithMethod;

public class Cities extends State {

	String county;
	String city;
	int ZipCode;
	float houseNumber;
	
	
	public Cities(String county, String city, int zipCode, float houseNumber) {
		super();
		this.county = county;
		this.city = city;
		ZipCode = zipCode;
		this.houseNumber = houseNumber;
	}
	
	public void location() {
		System.out.println("Street Address: " + houseNumber);
		System.out.println("City: " + city);
		System.out.println("Zip: " + ZipCode);
		System.out.println("County: " + county);
	}
}
