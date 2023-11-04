package exandpersonal;

import java.util.Scanner;

public class BankAppV2 {

	static Scanner sc = new Scanner(System.in);
	static AccountV2[] acc = new AccountV2[100];
	//클래스단위에서 static으로써 객체를 선언함으로써, 클래스 내의 모든 메소드에서 공유하여 쓸 수 있는 객체 생성.

	public static void printMenuTitle(String title) {
		if (title.equals("종료합니다.")) {
			System.out.println("-----------");
			System.out.println("종료합니다.");
			System.out.println("-----------");
		} else {
			System.out.println("-----------");
			System.out.println(title);
			System.out.println("-----------");
		}
	}

	public static void newAcc() {
		System.out.print("계좌번호 : ");
		String accNum = sc.nextLine();
		System.out.print("예금주 : ");
		String accOwnerName = sc.nextLine();
		System.out.print("최초예금액 : ");
		int initialTransfer = Integer.parseInt(sc.nextLine());

		AccountV2 newAcc = new AccountV2(accNum, accOwnerName, initialTransfer);

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				acc[i] = newAcc;
				System.out.println("새 계좌를 생성하였습니다.");
				break;
			}
		}
	}

	public static void accList() {
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) {
				System.out.println(acc[i].getAccInfo());
			} else if (acc[i] == null) {
				break;
			}
		}
	}

	public static void deposit() {
		String inputAcc;
		int money;

		System.out.print("계좌번호 > ");
		inputAcc = sc.nextLine();

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				System.err.println("계좌가 없습니다.");
				break;
			}
			// 계좌가 만약 10개만들어졌다면, acc[9]까지 하기 코드 진입 못하면
			// 상기의 코드에 결국에 진입하게 되어 계좌가 없습니다 코드 출력하게 되는 원리
			if (inputAcc.equals(acc[i].getAccNum())) {
				System.out.print("입금액 > ");
				money = Integer.parseInt(sc.nextLine());
				acc[i].setBalance(acc[i].getBalance() + money);
				System.out.println("입금이 완료되었습니다.");
				System.out.printf("입금 후 현재 잔액 : %d원\n",acc[i].getBalance());
				break;
			}
		}

	}

	public static void withdraw() {
		String inputAcc;
		int money;

		System.out.print("계좌번호 > ");
		inputAcc = sc.nextLine();

		withdraw : for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				System.err.println("계좌가 없습니다.");
				break;
			}
			if (inputAcc.equals(acc[i].getAccNum())) {
				while (true) {
					System.out.print("출금액 > ");
					money = Integer.parseInt(sc.nextLine());
					if (money > acc[i].getBalance()) {
						System.err.println("해당 계좌의 잔액보다 더 많은 금액을 출금하실 수 없습니다.");
					} else {
						acc[i].setBalance(acc[i].getBalance() - money);
						System.out.println("출금이 완료되었습니다.");
						System.out.printf("출금 후 현재 잔액 : %d원\n",acc[i].getBalance());
						break withdraw;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int money;
		String menuNav;
		app: while (true) {

			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.printf("선택 >");
			menuNav = sc.nextLine();
			int flag = Integer.parseInt(menuNav);
			switch (flag) {
			case 1:
				printMenuTitle("계좌생성");
				newAcc();
				break;
			case 2:
				printMenuTitle("계좌목록");
				accList();
				break;
			case 3:
				printMenuTitle("예금");
				deposit();
				break;
			case 4:
				printMenuTitle("출금");
				withdraw();
				break;
			case 5:
				printMenuTitle("종료합니다.");
				break app;
			default:
				System.out.println("1~5 사이의 숫자를 입력하십시오.");
			}
		}
	}
}
