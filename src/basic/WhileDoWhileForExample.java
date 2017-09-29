package basic;

public class WhileDoWhileForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isEvenNumber(100);
		isEvenNumber(15);
	}

	public static boolean isEvenNumber(int number) {
		
		if((number%2)==0) {
			System.out.println(number+ " is even number");
			return true;
		}
		System.out.println(number+ " is not even number");
		return false;
	}
}
