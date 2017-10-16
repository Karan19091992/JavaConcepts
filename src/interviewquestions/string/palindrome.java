package interviewquestions.string;

public class palindrome {
	
	/* There are two ways to do this: StringBuffer--> reverse() and */
	
	/*  Method 1: */
	public static String reverse(String word) {
	
		/* check for the empty string */
		if(word == null) {
			return word;
		}
		
		String reverse = "";
		for(int i= word.length()-1;i>=0; i--) {
			reverse = reverse + word.charAt(i);
		} 
		return reverse;
	}
	
	/* Method 2: */
	public static void reverseApi(String word) {
		
		StringBuffer sb = new StringBuffer(word);
		System.out.println( " REverse string of "+ word +" is: " + sb.reverse()); 
		
		
	//	System.out.println("Deleted content : " + sb.delete(3, word.length()));
		System.out.println("Delete specific character : " + sb.deleteCharAt(3));
	}
	
	
	/* Replace */
	public static void replace(String word) {
		
		StringBuffer sb = new StringBuffer(word);
		
		
		
		System.out.println(" Replace the string : " + sb.replace(0,1 , "/"));
	}
	
	public static void main(String[] args) {
		
		String name = "loveyou";
		System.out.println(" Reverse of the string "+ name +" is : " + reverse(name));
		
		reverseApi("Karan");
		
		replace("ILoveYou");
		

	}

}
