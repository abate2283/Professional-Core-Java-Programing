package theoryWithMethod;

public class School {

	public static void main(String[] args) {
		
		Student student = new Student("Nicole", "P", "Key", 30, "7898 New York Ave.","DC", 20453, "DC", "USA", 15000, "Spanish", "Geology");
		Student student1 = new Student("Chang", "Y", "Wung", 23, "67 St. Paul", "Jacksonville", 89764, "GN", "USA", 6700, "Asian", "Chemisty");
		
		
		
		student.demography();
		student1.demography();
		student.Address();
		student.registration();
			
		}
		
	}


