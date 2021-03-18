package theoryWithMethod;

public class State {

	public static void main(String[] args) {
		
		Cities tulsa = new Cities("Wagoner", "Tulsa", 74114, 1234);  // for loop = for(i= 0, i <= 100, i=i-1 or i++)
		
		tulsa.city = "Broken Arrow";
		tulsa.county = "Wagoner";
		tulsa.houseNumber = 9076;
		tulsa.ZipCode = 207021;
		
		tulsa.location();
		 
	

	}

}
