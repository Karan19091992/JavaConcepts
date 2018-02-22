package basic;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the String you want to reverse.. ");
		
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		// I am Karan Parmar
		
		String words[] = inputString.split(" ");
		
		for(int i = 0; i< words.length-1; i++) {
			
			int startIndex =0;
			int lastIndex = words[i].length();
			String tempWord = words[i];

			for (int j=0; j<= lastIndex-1;j++) {
				
				
						if(lastIndex <=1) {
							System.out.println(words[i]);
							//break;
						}else {
							
							words[startIndex] = words[lastIndex];
							words[lastIndex] = words[startIndex];
							
							startIndex++;
							lastIndex--;
							
							System.out.println(words);
						}
						System.out.println(" ");
			}
			
			
		}
		
		
		
	}

}
