package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> element = new ArrayList<String>(5);
		
		element.add("Java");
		element.add("R");
		element.add("C");
		element.add("Python");
		element.add("Lisp");
		
		element.remove(2);
		for(String language : element){
			System.out.println("Language is: " + language);
		}
		
		System.out.println("element size: "+ element.size());
		
		Collections.reverse(element);
		
		for(String language : element){
			System.out.println("Reverse Language is: " + language);
		}
		
	}

}
