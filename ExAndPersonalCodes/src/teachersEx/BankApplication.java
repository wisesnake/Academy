package teachersEx;

import java.util.Scanner;

public class BankApplication {

	static Account acc[] = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	static void createAcc() {

		// 계좌 생성하는 코드

		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");

		System.out.print("계좌번호: ");
		String accNum = scanner.next();
		System.out.print("계좌주: ");
		String accOwner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.next());

		Account newAcc = new Account(accNum, accOwner, balance);

		System.out.println(newAcc.getAccNumber());
		System.out.println(newAcc.getAccOwner());
		System.out.println(newAcc.getBalance());

		// 계좌가 null인지 여부를 확인한 후에 null일 경우에만 입력이 되게 하고
		// 100개의 계좌에서 첫번째 계좌에 계좌 넣은 후에
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				acc[i] = newAcc;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}

		}

	
	}

	
	static void findAdd1(String accNumber) {
		
		for (int i = 0; i < acc.length; i++) {
			// 결좌가 없을 경우에 계좌가 없다라는 코드

			if (acc[i] == null) {
				System.out.println("계좌가 없습니다.");
				break;
			}

			if (accNumber.equals(acc[i].getAccNumber())) {
				System.out.println("입력하신 계좌와 일치합니다. 예금액을 넣으세요");
				System.out.print("예금액: ");
				int deposit = scanner.nextInt();
				acc[i].setBalance(acc[i].getBalance() + deposit);
				break;
			}
		}
		
	}
	
	static void findAdd2(String accNumber) {
		
		for (int i = 0; i < acc.length; i++) {
			// 결좌가 없을 경우에 계좌가 없다라는 코드

			if (acc[i] == null) {
				System.out.println("계좌가 없습니다.");
				break;
			}

			if (accNumber.equals(acc[i].getAccNumber())) {
				System.out.println("입력하신 계좌와 일치합니다. 출금액을 넣으세요");
				System.out.print("출금액: ");
				int deposit = scanner.nextInt();
				acc[i].setBalance(acc[i].getBalance() - deposit);
				break;
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				createAcc();				
			} else if (menu == 2) {
				System.out.println("--------------");
				System.out.println("계좌목록");

				for (int i = 0; i < acc.length; i++) {

					if (acc[i] != null) {
						System.out.printf("%s   %s   %d\n", acc[i].getAccNumber(), acc[i].getAccOwner(),
								acc[i].getBalance());
					}

				}

			} else if (menu == 3) {
				System.out.println("예금");
				// 예금하라는 코드

				// 어떤 계좌에 예금을 해야할지 찾는 기능(함수) 코드

				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				System.out.print("계좌번호: ");
				String accNumber = scanner.next();

				// accNumber가 같은 그 계좌(Account 타입)를 찾아라!!!

				findAdd1(accNumber);

			} else if (menu == 4) {
				System.out.println("출금");
				// 출금하라는 코드

				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				System.out.print("계좌번호: ");
				String accNumber = scanner.next();

				// accNumber가 같은 그 계좌(Account 타입)를 찾아라!!!

				findAdd2(accNumber);

			} else if (menu == 5) {
				flag = false;
			} else {
				System.out.println("1,2,3,4,5만 넣으세요");
			}

		}

		System.out.println("프로그램 종료");

	}

}
