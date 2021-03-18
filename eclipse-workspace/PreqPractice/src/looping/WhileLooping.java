package looping;

public class WhileLooping {

public static void main(String arg[]) {
	int x = 4;
	
	
	int count = 5;
	
	int solve = x + count;
	
	int year_of = 1979;
	int that_year = 0;
	int all_together = year_of + that_year;
	
	
	
	while((solve <= 121)) {
		while((all_together <=  2021)) {
		
		System.out.println("In the year "+ all_together + " Alfred's age " + solve);
			solve = solve + 1;
			all_together = all_together +1;
		
		if(solve == 50) {
			
			break;
			
			
		}


	}
	}
	
}
}