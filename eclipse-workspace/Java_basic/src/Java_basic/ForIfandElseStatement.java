package Java_basic;

public class ForIfandElseStatement {

	public static void main(String[] args) {
		
		boolean hungry = true;
		
		if(hungry) {System.out.println("Im starving.");} else {System.out.println("I'm not hungry.");}
		
//		int happy = 5;
//		int nothappy = 3;
		
//		if(nothappy < happy + 3) {System.out.println("I am happy");} if(happy < nothappy -3) { System.out.println("I am not happy");}
		
		
		int favoriteTemp = 75;
		int currentTemp = 60;					//We can change currentTemp to 40 degrees to see any changes.
		String Opinion;							// Result is "It is very cold!.  Let's try 70 degrees? It prints "It is beautiful, but that burning!
		
		if(favoriteTemp == currentTemp) {
		if(currentTemp <= favoriteTemp -30) {Opinion = "It is very cold!";}
		else if(currentTemp < favoriteTemp -20) {Opinion = "It's still cold out!";}
		else if(currentTemp > favoriteTemp + 10) {Opinion = "It's really hot out!";}
		else {Opinion = "It is beautiful!";}
		
		}else {Opinion = "Unknown temperature?";}
		
		System.out.println(Opinion);
		
		// SWITCH STATEMENT IT WORKS JUST AS IF ELSE STATEMENTS
		
		int month = 3;				   //If we change the month of the year to either 1, 2, 3 or 4, you'll see it prints the corresponding month. 
		String monthsOftheYear;
		switch(month) {
		case 1: monthsOftheYear ="January";
		break;
		case 2: monthsOftheYear ="February";
		break;
		case 3: monthsOftheYear = "March";
		break;
		case 4: monthsOftheYear = "April";
		default: monthsOftheYear = "Unknown";
		break;
	
		}
		
		System.out.println(monthsOftheYear);
		
		
		}
		
	
	}

	

	
	
