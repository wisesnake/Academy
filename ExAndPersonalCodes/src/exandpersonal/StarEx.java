package exandpersonal;

public class StarEx {

	public static void main(String[] args) {

//		1)
//		for(int i = 0;i < 5;i++) {
//			for(int j = 0;j < 5;j++) {
//				System.out.printf("%s","*");
//			}			
//			System.out.println();
//		}

//		2)
//		for(int i = 0;i < 5;i++) {
//			for(int j = 0;j <= i;j++) {
//				System.out.printf("%s","*");
//			}			
//			System.out.println();
//		}
//		3)
//		for(int i = 0;i <= 5;i++) {
//			for(int j = 5;j >= i;j--) {
//				System.out.printf("%s","*");
//			}			
//			System.out.println();
//		}
//		4)
//		for (int i = 0; i < 10; i++) {
//
//			for (int j = 10; j > i; j--) {
//				System.out.printf("□");
//			}
//
//			for (int j = 0; j < i + 1; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//
//		5)
		String output = "";
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ;j > i  ; j-- ) {
				output+= " ";
			}
			
			for(int j = 0 ; j < 2*1 + 1; j++ ) {
				output+= "*";
			}
		}
	
	
	
	
	
	
	
	
	
	
	}

}
