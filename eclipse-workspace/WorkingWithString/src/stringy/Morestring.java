package stringy;

public class Morestring {

	public static void main(String[] args) {
		
		String a = "people are there.";
		String b = "They are playing party politics";
		System.out.println(a.charAt(3));  // To get the exact index of a string. use string name.charAt(number). 
		System.out.println(a.charAt(5));
		System.out.println(b.charAt(4));
		
		
		int p = a.indexOf("are", 3);   // This method will search for items in a string.  Starting from left to right.  
		System.out.println(p);
		
		int q = b.lastIndexOf("are");
		System.out.println(q);
		
		String able = "There are many sides to a story";
		String ability = "Whosoever calls upon the name of the Lord";
		
		int pol = able.indexOf("sides"); int not = ability.indexOf("the"); int notna = ability.lastIndexOf("of"); 
		System.out.println(pol);
		System.out.println(not);
		System.out.println(notna);
		
		
	}

}
