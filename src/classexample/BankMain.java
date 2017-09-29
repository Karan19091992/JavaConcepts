package classexample;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank(1223232424, 100000, "Karan", "karanparmar@gmail.com", 123);
		bank.depositFunds(1000);
		bank.withdrawFunds(100000);
		bank.withdrawFunds(2000);
	}

}
