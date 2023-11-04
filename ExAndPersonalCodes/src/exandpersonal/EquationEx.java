package exandpersonal;


public class EquationEx {

	public static void main(String[] args) {
System.out.println("4x + 5y = 60 의 모든 해");
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				if((4*x) + (5*y) == 60)
				System.out.printf("(%d, %d) \n",x,y);
			}			
		}
		
	}

}
