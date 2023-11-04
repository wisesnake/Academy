package chpt18ex;

import java.util.Scanner;

public class Ex10 {

	// 문제 : 원본파일,복사파일 경로 입력받고 복사하는 프로그램
	// 조건
	/*-바이트기반 스트림, 성능 향상 보조 스트림 반드시 사용
	 *-원본 파일이 존재하지 않을 경우, 존재하지 않습니다 출력
	 *-디렉토리가 존재하지 않으면 경로상의 모든 디렉토리 자동 생성
	 *-복사 성공 시 복사 성공하였습니다 출력할 것.		
	*/

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원본 파일 경로: ");
		String ogFile = sc.nextLine();
		System.out.print("복사 파일 경로: ");
		String pastedFile = sc.nextLine();


	}

}
