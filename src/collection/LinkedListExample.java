package collection;

import java.util.Iterator;
import java.util.LinkedList;

import javafx.animation.Interpolator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		/*  LinkedList Example  */
		LinkedList<String> colorList = new LinkedList<String>(); 
		
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Violet");
		
		/* Traverse linkedlist via for loop */
		
//		for(String color: colorList) {
//			System.out.println("Color Via For Loop:" + color);
//		}
		
		System.out.println();
		
		/* Traverse linkedlist via iterator */
		
//		Iterator iterator = colorList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println("Color Via Iterator: "+ iterator.next());
//		}
		
		System.out.println();
		
		/*  LinkedList Traverse via length */
		for(int i=0; i<colorList.size();i++) {
			System.out.println("Color Via For loop and size(): "+ colorList.get(i));
		}
		
		
		/* Getting first and last element from linkedList */
		Object firstElement = colorList.getFirst();
		Object lastElement = colorList.getLast();
		
		System.out.println("getFirst(): "+ firstElement);
		System.out.println("getLast() "+ lastElement);
		
		System.out.println();
			
		colorList.remove(1);
		for(int i=0; i<colorList.size();i++) {
			System.out.println("List after removal of element at index 1: "+ colorList.get(i));
		}
		
		System.out.println();
		
		/* Search element from linkedList */
		if(colorList.contains("Yellow")) {
			System.out.println("List contains yellow");
		}
		
		/* Get sublist from linkedList */
		System.out.println("SUbList of the List : "+colorList.subList(0, 2));
		
	}

}
