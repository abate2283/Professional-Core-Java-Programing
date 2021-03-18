package Java_basic;

public class learningArray {

	public static void main(String[] args) {
		
		int [] values = new int [100];  // An array is a group of reference for numbers upto what you define it say [100]. This will be able to reference 100 slots.
	
	// the first slot of an array is [0], the last slot is [99] if defines as [100]
	
	values [0] = 22;  values [1] = 44; values [2] = 57; // arrays contains the same kinds of number not a combination of both. 
	
	System.out.println(values[0]);  // slots not assigned a value is 0
	System.out.println(values[0]);
	
	  String [] dogs = new String [10];  // you can also define your array with String. 
	  
	  dogs [2] = "cows";  dogs [3] = "Cats";  dogs [9] = "piglatin";
	  
	  System.out.println(dogs[3]);
	  
	  String [] word = new String [] {"my", "name", "is"};  // this is another way of writing an array with variable string.  
	  
	  System.out.println(word[0]);
	  System.out.println(word[1]);
	  System.out.println(word[2]); 
	  
	  word = new String[11];  // Now this changes the array altogether.
	  
	  word = new String[] {"my name is Alfred", "Bate", "I was born in Buea", "I grew up under the foot of Fako. "};
	  
	  System.out.println(word[0]);
	  System.out.println(word[0]);
	  System.out.println(word[1]);
	  System.out.println(word[2]);
	  System.out.println(word[3]);
	  
	  
	  

	}

}
