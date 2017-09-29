package classexample;

public class Bank {
	
	private long accountNumber;
	private long balance;
	private String customerName;
	private String email;
	private long phoneNumber;

	public Bank(long accountNumber, long balance, String customerName, String email, long phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	public void depositFunds(int amount) {
		this.balance = balance + amount;
		System.out.println(" The amount after deposit is : " + this.balance);
	}

	public void withdrawFunds(int amount) {
	
		if(amount <= balance) {
			this.balance = balance - amount;
			System.out.println(" The remaining amount after withdrawal is: " + this.balance);
		}else {
			System.out.println("Insufficient Balance!!");
		}
	}
}
