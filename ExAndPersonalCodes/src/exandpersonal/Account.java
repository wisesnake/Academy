package exandpersonal;

public class Account {
	private String accNum;
	private String accOwnerName;
	private int credit;

	Account() {

	}

	public String getAcc() {
		return getAccNum() + "  |  " + accOwnerName + "  |  " + credit;
	}

	public String getAccNum() {
		return this.accNum;
	}

	public void setAcc(String accNum, String accOwnerName, int initialTransfer) {
		this.accNum = accNum;
		this.accOwnerName = accOwnerName;
		this.credit = initialTransfer;
	}

	public void setAcc(int menuNav, int money) {
		
		switch (menuNav) {
		case 3:
			if (money > 0) {
				this.credit += money;
			} else {
				System.err.println("예금액은 음수값이 될 수 없습니다.");
			}
			break;

		case 4:
			if (money > this.credit) {
				System.err.println("현재 예금액 이상의 금액은 출금 할 수 없습니다!");
			} else if (money < 0) {
				System.err.println("출금액은 음수값이 될 수 없습니다.");
			} else if (money == 0) {
				System.err.println("올바른 금액을 입력해 주십시오.");
			} else {
				this.credit -= money;
			}
			break;
		}

	}

}
