package looping;

public class ShortQuizzOnLoop {

	public static void main(String[] args) {
		
		
	}
	public static void printCategories(String str) {
		
		String stack =( "We have a large number of inventory of things in our wharehouse") + ("in the category: apparel and slightly" )
		+( "more in demand category: makeup along with the category: furniture and ..");
		
		int i = 0;
		while(true) {
			
			int whareHouse = stack.indexOf("category:", i);
			if(whareHouse == -1) break;
			int start = whareHouse +9;
			int end = stack.indexOf("catergory:", start);
			System.out.println(stack.substring(start, end));
			i=end+1;
			
			
		}
		
		

		
		
}
	
	}
