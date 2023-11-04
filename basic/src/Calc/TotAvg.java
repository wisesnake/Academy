package Calc;

public class TotAvg {
	//필

	
	
	
	//생
	TotAvg(){

	}
	
	
	
	
	
	
	//메
/*	
	 // 학생별 총누적합 리턴
    public int getTotal(int index) {
        int total = 0;
        for (int i = 0; i < studGrade[index].length; i++) {
            total += studGrade[index][i];
        }
        return total;
    }
    
    // 학생별 평균 리턴
    public double getAverage(int studentIndex) {
        int total = getTotal(studentIndex);
        return (double) total / studGrade[studentIndex].length;
    }
    
 */
    // 학생별 총누적합 리턴
    public static int getTotal(int[] grades) {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        return total;
    }
    // 학생별 평균 리턴
    public static double getAverage(int[] grades) {
        int total = getTotal(grades);
        return (double) total / grades.length;
    }
}