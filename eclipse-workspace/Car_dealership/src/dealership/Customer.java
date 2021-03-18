package dealership;

public class Customer {
	
	private String name; 
	private String address;
	private double cashOnHand;
	private boolean getCashOnHand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		
		this.cashOnHand = cashOnHand;
	}
	public boolean isGetCashOnHand() {
		return getCashOnHand;
	}
	public void setGetCashOnHand(boolean getCashOnHand) {
		this.getCashOnHand = getCashOnHand;
	}
	
	public void purchaseCar(Vehicle vehicle, Employees employee, boolean finance) {
		employee.handleCustomer(this, vehicle, finance);
		
	}

}
