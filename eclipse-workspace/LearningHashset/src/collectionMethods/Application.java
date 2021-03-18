package collectionMethods;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
	// sorting a Hashset.
		
		HashSet<Integer> hashSet = new HashSet<Integer>();  // Tip: right click and use "Quick fix" to change multiple variable at once. 
		
		hashSet.add(12);
		hashSet.add(13);
		hashSet.add(14);
		hashSet.add(15);
		hashSet.add(16);
		hashSet.add(17);
		
		// To sort you have to create an ArrayList from the HashSet, then use the collection method .sort()..
		
		ArrayList<Integer> mylist = new ArrayList<Integer>(hashSet);
		Collections.sort(mylist);   // This will sort your data in an ascending order.
		
		
	HashSet<String> clothing = new HashSet<String>();  // Tip: right click and use "Quick fix" to change multiple variable at once. 
		
		clothing.add("Versace");
		clothing.add("Yves S");
		clothing.add("Adidas");
		clothing.add("Adams");
		clothing.add("Zain");
		clothing.add("Kays");
		clothing.add("Lacoste");
		clothing.add("Ralph Lauren");
		clothing.add("Polo");
		clothing.add("Gucci");
		
		ArrayList<String> mylist1 = new ArrayList<String>(clothing);
		Collections.sort(mylist1);   // This will sort your data in an ascending order.
		
		System.out.println(mylist);
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		/* HashSet<Integer> list = new HashSet<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		
		List<Integer>slist = new ArrayList<Integer>(list);    	 // to convert a HashSet to a List.
	
		
		
		ArrayList<Integer>newlist = new ArrayList<Integer>();
		newlist.add(33);
		newlist.add(34);
		newlist.add(35);
		newlist.add(37);
		newlist.add(36);
		
		
		
		
		
		//list.addAll(newlist);   // How to combine two lists:  A(list).addAll B(list)
		//list.removeAll(newlist);  // To remove B(list) use list.removeAll B(list);
	
		//list.clear();    // clear all items in a list.
		//newlist.clear();
		
		// boolean listHas12 = list.contains(12);    // To find out if a number is contained in a list use boolean x = list.contain();
		// boolean newlisthas23 = newlist.contains(23);
		// boolean isempty = newlist.isEmpty();
		
		//list.addAll(newlist);
		list.retainAll(newlist);
		System.out.println(list);
		
		
										
		
	*/	
		
	}

}
