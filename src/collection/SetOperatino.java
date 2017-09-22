package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperatino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> linkedHashSet1= new LinkedHashSet<String>();
		
		linkedHashSet1.add("one");
		linkedHashSet1.add("two");
		linkedHashSet1.add("Three");
		linkedHashSet1.add("two"); 
		linkedHashSet1.add("one");
		
		Set<String> linkedHashSet2= new LinkedHashSet<String>();
		
		linkedHashSet2.add("four");
		linkedHashSet2.add("Five");
		linkedHashSet2.add("two");
		linkedHashSet2.add("six"); 
		linkedHashSet2.add("seven");
		
		/* Union Operation */
	//	linkedHashSet1.addAll(linkedHashSet2);
		
		/* Intersection Operation */
	//	linkedHashSet1.retainAll(linkedHashSet2);
		
		/* Difference elements */
		linkedHashSet1.removeAll(linkedHashSet2);
		
		Iterator<String> iterator = linkedHashSet1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
