package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDecrease {
	
	private static Scanner scan =  new Scanner(System.in); 
	
	// getIntegers
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Please enter "+ capacity +" inetgers :");
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		return array;
	}
	
	// printArrays
	public static void printArrays(int[] integerArray) {
		
		for(int i = 0 ; i< integerArray.length; i++) {
			System.out.println("Element " +i+ " containes : "+ integerArray[i]);
		}
	}
	
	// sortIntegers
	public static int[] sortIntegers (int[] integerArray) {
		Arrays.sort(integerArray);
		
		int[] reverseArray = new int[integerArray.length];
		int j=0;
		
		for(int i = integerArray.length-1; i>=0; i--) {
			
			reverseArray[j] = integerArray[i];
			j++;
		}
		
		return reverseArray;
		
	}
	
	public static void main(String[] args) {
	
		//  Get number of integers from console
		int[] myInteger = getIntegers(5);
		
		// sortIntegers of the given array
		int[] sortedArray = sortIntegers(myInteger);
		
		// Print array
		printArrays(sortedArray);
	}

}
