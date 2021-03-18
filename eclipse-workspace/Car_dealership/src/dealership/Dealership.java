package dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		cust1.setName("Alfred Bate");
		cust1.setAddress("123 Main St, Any City, AB 123456");
		cust1.setCashOnHand(10000);
		
		Vehicle vehicle = new Vehicle();
				
		Employees employee = new Employees();
		
		
		cust1.purchaseCar(vehicle, employee, false);
		
		
		
		
		


	}

}
