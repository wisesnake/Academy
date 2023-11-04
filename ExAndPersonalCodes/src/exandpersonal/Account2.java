package exandpersonal;

public class Account2 {

	static int balance;
	
	static final int MIN_BALANCE = 0;
	
	static final int MAX_BALANCE = 1000000;

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		System.out.println("====================");
		System.out.println("입금액 : " + balance);
		if(balance < MIN_BALANCE) {
			System.err.println("잔고는 음수값이 될 수 없습니다.");
		}else if (balance > MAX_BALANCE) {
			System.err.println("잔고는 100만원이 한도입니다.");
		}else {
			System.out.println(balance + "원이 입금됨");
			Account2.balance = balance;
		}
	}
	
	public static void main(String[] args) {
		Account2 account = new Account2();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 :" + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 :" + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 :" + account.getBalance());
		
		account.setBalance(200000);
		System.out.println("현재 잔고 :" + account.getBalance());
		
	}
}
