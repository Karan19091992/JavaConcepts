package basic;

import java.util.Scanner;

public class StringReveseWhole {

	public static String stringReverse(String inputString) {
		
		String reverseString = "";
		int length =inputString.length();
		while(length - 1 >= 0) {
			reverseString =reverseString + inputString.charAt(length-1);
			length--;
		}
		return reverseString;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string..");
		
		String original = scanner.nextLine();
		
		while (original.length() == 0) {
			System.out.println("Invalid String..!! Please give proper string");
			original = scanner.nextLine();
		}
		
		System.out.println(stringReverse(original));
		
		
		
	}

}
