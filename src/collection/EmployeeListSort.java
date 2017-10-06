package collection;

/* Use of comparator to sort the list of Objects*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListSort {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add( new Employee("karan", 23, "Montreal"));
		empList.add( new Employee("Jay", 24, "Montreal"));
		empList.add( new Employee("Parth", 22, "Montreal"));
		
		
		
		System.out.println("**** Sort the list based on Age  ****");
		System.out.println();
		
		Collections.sort(empList,Employee.empAgeComparator);
		
		for(Employee emp: empList ) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("**** Sort the list based on Name  ****");
		System.out.println();
		
		Collections.sort(empList,Employee.empNameComparator);
		
		for(Employee emp: empList ) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("**** Reverse the list  ****");
		System.out.println();
		
		Collections.reverse(empList);
		for(Employee emp: empList ) {
			System.out.println(emp);
		}
		System.out.println();
		
		
		/**** Add two arraylist together  ****/
		List<Employee> empList2 = new ArrayList<Employee>();
		empList.add( new Employee("abc", 23, "Montreal"));
		empList.add( new Employee("xyz", 24, "Montreal"));
		empList.add( new Employee("kbc", 22, "Montreal"));
		
		empList.addAll(empList2);
		
	//	Collections.sort(empList,Employee.empNameComparator);
		Collections.sort(empList,Employee.empAgeComparator);
		for(Employee empListAdded: empList) {
			System.out.println(empListAdded);
		}
		System.out.println();
		
		/***** Get the sublist from the arrayList *****/
		
		ArrayList<Employee> subList = new ArrayList<>(empList.subList(0, 4));
		int count=0;
		for(Employee list : subList) {
			System.out.println(count++ +" : "+ list);
		}
		
		System.out.println();
		/**** Get first and last element from the list ****/
		
		empList.set(0, new Employee("Nikunj", 30, "India"));
		int count1=0;
		for(Employee list : empList) {
			System.out.println(count1++ +" : "+ list);
			
			
		}
		
//		if(empList.contains()) {
//			System.out.println("You got the KBC");
//			//empList.set(new Employee("Nikunj", 30, "India"));
//		}else {
//			System.out.println("You didn't get KBC in the list");
//		}

	}

}
