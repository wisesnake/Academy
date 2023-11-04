package inheritance2;

public class CarProgram {

	public static void main(String[] args) {

		Car mycar = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = mycar.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼 타이어 교체");
				break;
			case 2:
				System.out.println("앞 오른 타이어 교체");
				break;
			case 3:
				System.out.println("뒷 왼 타이어 교체");
				break;
			case 4:
				System.out.println("뒷 오른 타이어 교체");
				break;
			}
			System.out.println("------------------"); //1회전마다 출력내용 구분
		}
	}
}
