package looping;

class WorkingString {

	public static void main(String[] args) {
		
		
//		String a = ("Hello");
		
//		System.out.println(a.length());
		
//		String stx = ("ABCDEFG");
//		String extractedString = stx.substring(3,5);  //  to know the specific index of a string. 
//		System.out.println(extractedString);		// if you put (0, 3) your arguments is that you want the index of zero and up to 3, in this case 3 - 1th all those values
		
			String A = ("hello");
			String B = ("there is a King in me.");
			
//			if(A.equalsIgnoreCase("HeLlO")) {         					// You can use the A.equalsIgnoreCase to print upper case.  
																			// if(!A.equals("hello")){ } Not equals to
			
//				System.out.println("Printed hello");
//			}
				
//			if(B.equalsIgnoreCase("There")){						// if we change the value to if(B.equals("There"){}  nothing is printed. 
				
//				System.out.println("Printed there");
//			}
			
			
//			System.out.println(A.charAt(2));					// This will give you the character at that given index.  
			
//			int x = B.indexOf("King");          // B.indexOf("King") finds the location index of that word.  
			
			int y = B.indexOf("in", 7);
			int z = B.indexOf("is");
			
			System.out.println(z);
			
	}

}
