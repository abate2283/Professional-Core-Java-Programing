package stringy;

public class StringThing {

	public static void main(String[] args) {
		
		String smallstr = "qwertyuiopoiuytrasdfghjk";
		String other = "Thequickbrownfox.";
	
		System.out.println(smallstr);
		System.out.println(smallstr.length());  // When you add the syntax .length() you can extrapolate the number of characters in a string.
														// These numbers are counted from 0 to the end.  So the last number will be nth-1. The
														//string above have 25 numbers but it printed 24 which is 1 less.  If you use the method
														// .substring(number) you'll get all the numbers less the ones you have in the ()
		System.out.println(smallstr.substring(2)); 
		System.out.println(smallstr.substring(20));
		System.out.println(other.length());
		System.out.println(other.substring(10));
		System.out.println(other.substring(0,3));    // This will print the first number and all the numbers from 0 to 3 less than 1 = (0-2)
		
	
		// Comparing Strings:
		String A = "who";
		String B = "why";
		if(A.equals("who")) {              // THIS IS HOW YOU COMPARE
		if(!A.equals("who")) {			// THIS IS THE NOT EQUAL TO SYNTAX. 

		if(A.equalsIgnoreCase("WHO")) {
		}
			System.out.println("WHO"); 
		
		
		}
	
		}
		
}}
	


