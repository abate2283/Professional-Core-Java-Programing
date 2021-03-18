package Java_basic;

public class MoreVariables {

	public static void main(String[] args) {
		// the integer can take numbers upto 2^31 two to the thirty first power.  
		
	//	int x = 10000000000000000;  // the number is longer than 2^31
		
		
		int x = 100000000;  // this one works.
		// int x = -10000000;  // negative numbers still works
		
	// we can use long to write a very big number.
		
		long BigNumber = 1000000000000l;  // this one takes a large number.  
		
		
		// Other variables in java
		
		short SmallNumber = - 32767;
		short SmallNumber1 = 32767;
		
		byte tinyNumber = - 128; 
		
		boolean TruthFaulty = true;
		boolean TruthF = false;
		
		char Stores_singlecharacter = '%';  // It stores just single characters.  not double.   
		
		double decimalNumbers = 234.344;  // means decimal places.
		
		System.out.println(x);
		System.out.println(SmallNumber);
		System.out.println(BigNumber);
		

	}

}
