package collection;

import java.util.Comparator;

public class Employee {
	
	private String name;
	private int age;
	private String address;
	
	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/* Comparator   */
	
	/*Comparator for sorting the list by Student Name*/
    public static Comparator<Employee> empNameComparator = new Comparator<Employee>() {

	public int compare(Employee emp1, Employee emp2) {
	   String empName1 = emp1.getName().toUpperCase();
	   String empName2 = emp2.getName().toUpperCase();

	   //ascending order
	   return empName1.compareTo(empName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Employee> empAgeComparator = new Comparator<Employee>() {

	public int compare(Employee emp1, Employee emp2) {

	   int age1 = emp1.getAge();
	   int age2 = emp2.getAge();

	   /*For ascending order*/
	   return age1-age2;

	   /*For descending order*/
	   //rollno2-rollno1;
   }};

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

   
}
