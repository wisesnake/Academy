package exandpersonal;

import java.util.Scanner;

public class BankApp {

	public static int bankMenu(Scanner sc) {
		System.out.println("-----------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("-----------------------------------");
		System.out.printf("선택 >");
		return sc.nextInt();
	}

	public static void printMenuTitle(String title) {
		if (title.equals("종료합니다.")) {
			System.out.println("-----------");
			System.err.println("종료합니다.");
			System.out.println("-----------");
		} else {
			System.out.println("-----------");
			System.out.println(title);
			System.out.println("-----------");
		}
	}

	public static String inputAccNum(Scanner sc) {
		System.out.print("계좌번호 :");
		return sc.nextLine();
	}

	public static void main(String[] args) {

		String accNum;
		String accOwnerName;
		int initialTransfer;
		int menuNav;
		int accNo = 0;
		int money;

		Scanner sc = new Scanner(System.in);
		Account[] acc = new Account[100];
//		100개의 인덱스를 지닌 객체배열 생성.

		app: while (true) {
			menuNav = bankMenu(sc);

			sc.nextLine(); // int 이후 Line 입력받기용(에러방지) \n

			switch (menuNav) {
			case 1: {
				acc[accNo] = new Account();
//				Account클래스 객체 생성 후  Account클래스타입 데이터인 account배열변수 중 
//				accNo번째 인덱스인 account배열변수에 해당 객체 주소 할당. 
				printMenuTitle("계좌생성");
				accNum = inputAccNum(sc);
				System.out.print("계좌주 :");
				accOwnerName = sc.nextLine();
				System.out.print("초기입금액 :");
				initialTransfer = sc.nextInt();
				sc.nextLine();
				System.out.println("결과 : 계좌가 생성되었습니다.");
				acc[accNo].setAcc(accNum, accOwnerName, initialTransfer);
//				해당 객체에는 계좌번호, 계좌주, 잔고 등의 인스턴스 필드 멤버가 있고, 
//				계좌생성 중 입력받은 데이터들을 생성자를 통해 각 필드에 대응해 저장함.
				accNo++;
//				다음 계좌 생성시에 다른 계좌를 저장해야하므로 1 올려놓음.

				// 새계좌 만드는 다른 방법
//				Account newacc = new setAcc(accNum, accOwnerName, initialTransfer);
//				for(int i = 0; i < accountArray.length; i++){
//					if(acc[i] == null) {
//						acc[i] = newAcc;
//						System.out.println("새 계좌 생성~");
//						break;
//					}
//				}
				break;
			}
			case 2: {
				for (int i = 0; i < accNo; i++) {
					System.out.println(acc[i].getAcc());
				}
				break;
			}
			case 3: {
				printMenuTitle("예금");
				boolean accountFound = false;

				while (!accountFound) {
					// ㄴ>계좌를 찾을때까지 반복시키기 위한 무한루프.
					System.out.println("이전 메뉴는 0을 입력하십시오.");
					accNum = inputAccNum(sc);
					if (accNum.equals("0")) {
						break;
					}
					for (int i = 0; i < accNo; i++) {
						if (acc[i].getAccNum().equals(accNum)) {
							accountFound = true;
							// 계좌번호가 일치하는 경우 반복문 탈출 위한 변수값 변경
							System.out.print("예금액 : ");
							money = sc.nextInt();
							acc[i].setAcc(menuNav, money);
							break; // 계좌를 찾았으므로 반복문 종료
						}
					}
					if (!accountFound) {
						System.err.println("일치하는 계좌가 없습니다. 다시 입력해 주십시오.");
					}
				}
				break;
			}

			case 4: {
				printMenuTitle("출금");
				boolean accountFound = false;

				while (!accountFound) {
					System.out.println("이전 메뉴는 0을 입력하십시오.");
					accNum = inputAccNum(sc);
					if (accNum.equals("0")) {
						break;
					}
					for (int i = 0; i < accNo; i++) {
						if (acc[i].getAccNum().equals(accNum)) {
							accountFound = true;

							System.out.print("출금액 : ");
							money = sc.nextInt();
							acc[i].setAcc(menuNav, money);
							break;
						}
					}
					if (!accountFound) {
						System.err.println("일치하는 계좌가 없습니다. 다시 입력해 주십시오.");
					}
				}
				break;
			}
			case 5: {
				printMenuTitle("종료합니다.");
				break app;
			}
			default: {
				System.err.println("올바른 메뉴 번호를 입력해 주십시오.");
			}

			}
		}

	}

}
