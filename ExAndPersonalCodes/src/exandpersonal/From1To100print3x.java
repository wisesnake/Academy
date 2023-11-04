package exandpersonal;

public class From1To100print3x {

	public static void main(String[] args) {
		int tot = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
					tot += i;
			}
		}
		System.out.println(tot);
		
	}

}
