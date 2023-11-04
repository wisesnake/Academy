package chpt16ex;

public class Ex8 {

	public static Student[] students = {
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
	};
	
	public static double avg(Func<Student> func) {
		int sum = 0;
		for(Student stud : students) {
			sum += func.apply(stud);
		}
		double avg = (double) (sum / students.length);
		return avg;
	}
	
	public static void main(String[] args) {
		
//		double englishAvg = avg(s -> s.getEnglishscore());
		double englishAvg = avg(Student :: getEnglishscore);
		System.out.println(englishAvg);
		
//		double mathAvg = avg(s -> s.getMathscore());
		double mathAvg = avg(Student :: getMathscore);
		
		System.out.println(mathAvg);
		
		
	}

}
