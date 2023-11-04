package basic;

public class AccumEx1 {

	public static void main(String[] args) {
		
		String stud1[] = new String[] {"학생1 : ", "70", "70", "70"};		
		String stud2[] = new String[] {"학생2 : ", "80", "80", "80"};		
		String stud3[] = new String[] {"학생3 : ", "90", "90", "90"};	
		
		for(int i = 0;i <= 3; i++) {
			int studs = i;
			for(int j = 0 ; j < 4; j++) {
				switch(studs) {
				case 1:
					System.out.print("|"+stud1[j]);
					break;
				
				case 2:
					System.out.print("|"+stud2[j]);
					break;
				
				case 3:
					System.out.print("|"+stud3[j]);
					break;
				
				}

			}
			System.out.println("|");
		}
	}
}
