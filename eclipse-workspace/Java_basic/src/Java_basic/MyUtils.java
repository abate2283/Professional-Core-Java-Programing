package Java_basic;

public class MyUtils {


public static void printSomeJunk(String args) {   //Method signature.
System.out.println("blablabla " +  args);  
printSomeOtherStuff("I will praise Him everyday, ");

}

public static void printSomeOtherStuff(String args) {
System.out.println("Everybody praise the Lord now!  " + args);  // When we change the variable from (String) to integer (int) 
																//the method was able to carry out the operation and sum the 2 args to give you the result.
printSomeOtherStuff(2);
																// Let's try multiplication.   An it still works.  
}

public static void printSomeOtherStuff(int args) {
System.out.println("Integer passed in " + args);

}
public static void addNumbers(int firstNumber, int secondNumber) {      //When you change the public to private you can't reference it to another.  It is local.  
						System.out.println(firstNumber + secondNumber);
	

//private static void addNumbers(int firstNumber, int secondNumber) {      //When you change the public to private you can't reference it to another.  It is local.  
//						System.out.println(firstNumber + secondNumber);		// To uncom÷ment a line, hold command on a mark the single click. 				
}
						
public static void subtractNumbers(int MyNumber, int YourNumber) {
						System.out.println(MyNumber * YourNumber);
						
}

public  void AtractNumbers(int MyNumber, int YourNumber) {
		System.out.println(MyNumber / YourNumber);
}
	
	public static void _MyUsa(String county, String state){     // we noticed that when we change to String it works; use string attributes.  
		System.out.println(county + state);						// Very important to note.  "Void methods can't return a result.  
		
	}
}




