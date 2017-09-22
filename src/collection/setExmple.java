package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet example
		
		Set<Integer> hashSet= new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(2); // it is not included
		hashSet.add(25);

		System.out.println("Hashset vales are: "+hashSet);
		
		// LinkedHashSet example : It preserves the order
		
				Set<Integer> linkedHashSet= new LinkedHashSet<Integer>();
				
				linkedHashSet.add(12);
				linkedHashSet.add(2);
				linkedHashSet.add(5);
				linkedHashSet.add(2); // it is not included
				linkedHashSet.add(25);

				System.out.println("LinedHashset vales are: "+linkedHashSet);
				
				// TreeSet example : 
				
				Set<Integer> treeSet= new TreeSet<Integer>();
				
				treeSet.add(12);
				treeSet.add(2);
				treeSet.add(5);
				treeSet.add(2); // it is not included
				treeSet.add(25);

				System.out.println("TreeSet vales are: "+treeSet);	
	}

}
