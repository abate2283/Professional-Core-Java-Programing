import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class ApplicationEmployee {

	public static void main(String[] args) {
		HashSet<Employee> staff = new HashSet<Employee>();
		staff.add(new Employee("John Smith",  "HR", 3000));
		staff.add(new Employee("Adam Mc Smith",  "Sale", 3500));
		staff.add(new Employee("Zohn KcIanth",  "IT", 4000));
		staff.add(new Employee("Kohl Long",  "Prod", 4200));
		
		ArrayList<Employee> staff1 = new ArrayList<Employee>(staff);
		
		Collections.sort(staff1);
		
		System.out.println(staff1);
	}

}
