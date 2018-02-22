package interviewquestions.string;

public class StringManipulation {

	public String makeOutWord(String out, String word) {
		  
		  return out.substring(0,2) + word + out.substring(2,out.length());
		}
	
	public String firstHalf(String str) {
		  int length= str.length();
		  if(length <= 1){
		    return str;
		  }else if (length % 2 == 0){
		    return str.substring(0,length/2);
		  }else{
		    return "Enter valid string";
		  }
		}
	
	public static String comboString(String a, String b) {
		  
		  int length_a = a.length();
		  int length_b = b.length();
		  if(a == null || b == null){
		    return a+b;
		  }else if(length_a < length_b){
		    return a + b + a;
		  }else{
		    return b + a + b;
		  }
		}
	
	public String nonStart(String a, String b) {
		  if(a.length() ==1 && b.length() ==1  ){
		    return "";
		  }else if (a.length() ==1 && b.length() > 1){
		    return b.substring(1,b.length());
		  }else if(a.length() > 1 && b.length() == 1){
		    return a.substring(1,a.length());
		  } else{
		  return a.substring(1, a.length()) + b.substring(1, b.length());
		}
		    
		}

	
	public static void main(String[] args) {
	System.out.println(	comboString("hi", "karan"));
		
	}

}
