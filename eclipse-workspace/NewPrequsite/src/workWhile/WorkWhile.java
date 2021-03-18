package workWhile;

public class WorkWhile {

	public static void main(String[] args) {
		
		String str1 =( "We have a large number of inventory of things in our wharehouse") + ("in the category: apparel and slightly" )
				+( " more in demand category: makeup along with the category: furniture and ..");
		
	printCategory(str1);
	
	
	
	}
	
	
		
		public static void printCategory(String string){
			
			int i = 0;
			while(true) {
				
				int found = string.indexOf("category:", i);
				
				if (found == -1) break;
				int start = found + 9;
				
				int end = string.indexOf(" ", start);
				 
				System.out.println(string.substring(start, end));
				i = end -1;
				
				
					
			
		}
			}
}
		

		
		
		
		
		
		
	


