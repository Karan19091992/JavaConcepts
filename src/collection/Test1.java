package collection;

public class Test1 {

	/*Question 1*/
	public String repeatFront(String str, int n) {
		String name = null;
		
		for(int i=n+1; i>0; i--) {
			
			if(name == null) {
				name = str.substring(0,i);
			}else {
				name = name + str.substring(0,i);
			}
		}
		return name;
	}
	
	public static void main(String[] args) {
	
		Test1 test = new Test1();
		String name = test.repeatFront("Karan", 3);
		System.out.println(name);
	}

}
