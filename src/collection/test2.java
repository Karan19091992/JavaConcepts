package collection;

import java.util.Arrays;

public class test2 {

	public boolean frontAgain(String str) {
		
		String lettersStart = str.substring(0,2).toLowerCase();
		String lettersLast =  str.substring(str.length()-2,str.length()).toLowerCase();
		
//		if(lettersLast.equals(lettersStart)) {
//			return true;
//		}else {
//			return false;
//		}
		
		/*Parth*/
		String firstLetter = str.substring(0,2).toLowerCase();
		String lastLetter =  str.substring(str.length()-2,str.length()).toLowerCase();
		
		if(firstLetter.equals(lastLetter)) {
			return true;
		}else {
			return false;
		}

	}
	
	public String twoChar(String str, int n) {
		String finalString = null;
		
//		if(str.length()>=2 && (n !=4)  && (n !=5)) {
//			finalString = str.substring(n, n+2);
//		}else if((n == str.length()) || (n == str.length()-1)){
//			finalString = str.substring(0,1) + str.substring(1,2);
//		}
		
		//karansinh
		int length = str.length();
		
		if(length >=2 && n <=length-2) {
			finalString = str.substring(n, n+2);
		}else {
			finalString = str.substring(0,2);
		}
		
		return finalString;
	}
	
	/* Question 4 : */
	public String withoutX2(String str) {
		String finalString = null;
		String name = str.toLowerCase(); 
	
		if(name.startsWith("x") && name.substring(1, 2).equals("x")) {
			finalString = name.substring(2, name.length());
		}else if(name.startsWith("x") && !name.substring(1, 2).equalsIgnoreCase("x")){
			finalString = name.substring(1, name.length());
		}else if(!name.startsWith("x") && name.substring(1, 2).equalsIgnoreCase("x")) {
			finalString = name.substring(0,1) + name.substring(2,name.length());
		}else {
			finalString = name;
		}
		
		/*Parth*/
	
		return finalString;
		
	}
	
	/* Question 5 :*/
	public void zeroFront(int[] nums) {
       
		Arrays.sort(nums);
		System.out.print("[ ");
		for(int i=0; i<nums.length;i++) {
			if(i== nums.length-1) {
				System.out.print(nums[i]);
			}else {
				System.out.print(nums[i] + ", ");
			}
			
		}
		System.out.print(" ]");
		
	}
	
	/* Question 6: perfectly working */
	
	public String middleThree(String str) {
		int length= str.length();
		if(length %2 == 0 || length <3) {
			System.out.println("Please enter a valid string");
		}else {
			int index = (length/2);
			str = str.substring(index-1 , index+2).toLowerCase();
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		test2  test = new test2();
		System.out.println(test.frontAgain("Karanka"));
		
//		System.out.println(test.twoChar("java", 3));
		
	//	System.out.println(test.withoutX2("xxarxan"));
		
//		int num[] = {1,0,0,2,0,3,4,0,5};
//		
//		System.out.println(test.zeroFront(num));
		
//		System.out.println(test.middleThree("Kar"));
		
//		int num[] = {0,1,0,1,0};
//		
//		test.zeroFront(num);
		
	}

}
