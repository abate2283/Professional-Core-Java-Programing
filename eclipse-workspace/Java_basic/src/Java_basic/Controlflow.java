package Java_basic;

public class Controlflow {

	public static void main(String[] args) {
				
		boolean hungry = true;   // what happened here is that when we define the boolean hungry to be true, it will print the true statement.
				
				if(!hungry) {   // Also whatever argument we put on the if()it will be executed.  If we put ! It prints the opposite.  
			
			System.out.println("I might need to eat. ");
			
		} 
		
		else 
		{
			System.out.println("I don't need to eat. ");  // note the assignment of the boolean hungry = true it will print the first system.out.println.
														  // Note also if the assignment of the boolean is false, then it will print the second statement. 
		}
		
				
				int NumberofStudents = 10;
				
				if(!(NumberofStudents <10)) { System.out.println("Let them come in. ");}
				
				else { System.out.println("No admittance please. ");} 
				
				int Students = 20;
				
			if(Students ==20) {System.out.println("Pay for their meals. ");}
			
			else {System.out.println("leave them alone.");}
			
			int Rating = 5; if(!(Rating < 3)) {System.out.println("The rating is poor");} else {System.out.println("Give them thumbs up !");}
	}
// Notice what happened when you insert an ! in the if statement, prints the else statement.  
	
}

