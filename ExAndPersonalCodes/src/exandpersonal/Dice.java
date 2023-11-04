package exandpersonal;

public class Dice {

	public static void main(String[] args) {
		int d1 = 0, d2 = 0;
		int i=0;
		 do{
			i++;
			d1 = (int)(Math.random() * 6)+1;
			d2 = (int)(Math.random() * 6)+1;
			System.out.printf("%d 번째 주사위 : (%d, %d)\n", i, d1, d2);
		} while(!(d1 + d2 == 5));
		 System.out.println("주사위의 합이 5이므로 프로그램을 종료합니다.");
	}

}
