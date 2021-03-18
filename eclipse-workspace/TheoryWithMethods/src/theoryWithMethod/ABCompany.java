package theoryWithMethod;

public class ABCompany {

	public static void main(String[] args) {   // Method signature.  {Method body}
		
		Employee staff = new Employee();     		 // Here you create this method use this syntax: Employee staff = new Employee(); from the child class.
		staff.name = ("John");
		staff.address = ("123 Main St.");												//  Then you assign it a behavior from the child class.
		staff.dept = ("Sales");
		staff.customer = ("Smith");
		staff.id = (1234);
		staff.vehicle = ("Mercedes Benz");
		
		
		staff.sellCar();								// Next you create the behavior here.  staff.sellcar();  Then run it.
								
		staff.inventory();
		
		}	
	}
	



