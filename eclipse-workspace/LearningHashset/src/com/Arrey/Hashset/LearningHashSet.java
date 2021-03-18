package com.Arrey.Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LearningHashSet {

	public static void main(String[] args) {
		

		LinkedHashSet<Leaves> leaf = new LinkedHashSet<Leaves>();
		Leaves leaf1 = new Leaves("mango leaf", "green", "Mango Tree", 5);
		Leaves leaf2 = new Leaves("Orange Leaf", "pale yellow", "Orange Tree", 7);
		Leaves leaf3 = new Leaves("Apple Leaf", "Reddish Green", "Apple Tree", 4);
		leaf.add(new Leaves("Pear Leaf", "blueish yellow", "Pear Tree", 5));
		
		
		leaf.add(leaf1);
		leaf.add(leaf2);
		leaf.add(leaf3);
		leaf.add(leaf3);
		
		for(Leaves veggie: leaf) {
			
		System.out.println(veggie);
	
		}
	
	}

}
