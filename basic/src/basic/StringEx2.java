package basic;

public class StringEx2 {

	public static void main(String[] args) {

		// 문자열을 다루는 문제는 중요

		// 일단 문자열 찾는 문제가 중요

		// 찾기 위해 정렬
		// 그러면 인덱싱 개념
		System.out.println("-----------------------");
		String subject = "자바 프로그래밍";

		System.out.println(subject.indexOf("바")); // 2번째 문자열이므로 1 리턴
		System.out.println(subject.indexOf("밍")); // 7 리턴
		System.out.println(subject.indexOf("하")); // 찾는 문자열이 없으므로 -1 리
		System.out.println("-----------------------");
		
		String target = "프";

		if (subject.indexOf(target) == -1) {
			System.out.println("없는글자를 찾고그래~");
		} else {
			System.out.println("찾았다.");
			System.out.println("\"" + target + "\" 글자의 인덱스는 [" + subject.indexOf(target) + "] 입니다.");
		}

		// 위는 글자 하나 찾을 때 쓰는 방법, 아래로는 반대로 위치넣어주고 해당 글자가 어떤 글자인지 나오게 하는 법

		System.out.println("-----------------------");
		System.out.println(subject.charAt(0));
		if (subject.charAt(0) == '자') {
			System.out.println("이것은 첫번째 글자");
		}
		System.out.println("-----------------------");
		System.out.println(subject.length()); // 해당 문자열의 자릿수, 즉 인덱스 수 리턴
		
		System.out.println("-----------------------");
		
		System.out.println(subject.replace('래', '레')); // (대체할문자열검색, 대체할문자열로수정)
	
		System.out.println("-----------------------");
		
		System.out.println(subject.substring(3, 8)); // (시작번째index,끝번째index) 두 index 사이 문자 긁어서 출력
				
		String strArrs[] = subject.split(" "); // 자바스크립트 스플릿처럼 해당 문자열 기준으로 구별하여 인덱싱
		
		System.out.println("-----------------------");
		
		for(String strArr : strArrs) {
			System.out.println(strArr);
		}
		
	}
}
