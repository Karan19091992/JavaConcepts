package collection;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(5);
		
		
		for(int listItem : linkList){
			System.out.println("LnkedList element is : " + listItem);
		}
		
		linkList.remove();
		linkList.removeLast();
	
		for(int listItem : linkList){
			System.out.println("LnkedList elements after remove() is : " + listItem);
		}
	}

}

