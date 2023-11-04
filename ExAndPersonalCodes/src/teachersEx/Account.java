package teachersEx;

public class Account {
	
	private String accNumber;
	private String accOwner;
	private int balance;
	
	
	
	
	public Account(String accNumber, String accOwner, int balance) {
		
		this.accNumber = accNumber;
		this.accOwner = accOwner;
		this.balance = balance;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccOwner() {
		return accOwner;
	}
	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	

}
