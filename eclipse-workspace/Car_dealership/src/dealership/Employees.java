package dealership;

public class Employees {
	
	public void handleCustomer(Customer cust1, Vehicle vehicle, boolean finance) {
		
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust1.getCashOnHand();
			runCreditHistory(cust1, loanAmount);
		} else if(vehicle.getPrice() <= cust1.getCashOnHand());
		
	}
	
	
	public void runCreditHistory(Customer cust1, double loanAmount) {
		System.out.println("Run credit history for customer.");
		System.out.println("Customer has been approved to purchase vehicle");
		
	}
		
	public void processTransaction(Customer cust1, Vehicle vehicle) {
		
		System.out.println();
		
	}
		}


