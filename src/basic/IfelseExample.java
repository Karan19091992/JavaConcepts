package basic;

import com.sun.org.apache.xpath.internal.VariableStack;

public class IfelseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double variable1 = 20d;
		double variable2 = 80d;
		
		double result = (variable1 + variable2)*25;
		
		int remainder = (int) result % 40;
		
		if(remainder <= 20) {
			System.out.println("Total was over limit..");
		}

	}

}
