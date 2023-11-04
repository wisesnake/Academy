package basic;

public class StringConcatEx {

	public static void main(String[] args) {
		
		// 많은 언어에서 문자열과 문자열을 +할 경우, +연산자를 문자열끼리 연결하도록 재정의함
		System.out.println("hi" + "nice"); // 형변환
		
		//문자열 + 숫자
		
		System.out.println("hi" + 3); // 정수가 문자열로 형변환이 일어날 경우에 편하므로 "3" 변환 후 연결됨.

		System.out.println("hi" + 3.4); // 더블이여도 문자열 연결

		System.out.println("hi" + true); // 불리언이여도 문자열 연결
		
		System.out.println("hi" + 'A'); // char여도 문자열 연결
	
		
		
		
		// 기본형(primitive) bsil fd cb 1248 48 21
		
		
		// 코딩을 하다보면 문자열을 숫자로 변환하는 경우가 매우 많음.
	
		System.out.println("10" + 1);
		//ㄴ 이런 경우가 많음, 함수를 통해 입력을 받을 경우, 숫자를 입력받아도 기본적으로 문자열로 입력되기 때문임.
		
		System.out.println(Integer.parseInt("10") + 1);
		// 보통 언어에서 parse는 분석하다라는 뜻.
		// ㄴ 문자열로써의 10을 int로써 분석한 후, 뒤의 int인 1을 더하여 11이 출력되었음.
		
		
		System.out.println(Double.parseDouble("10.1") + 0.1);
		
		System.out.println("--------------------------------------------");

		
		//비교(>      <     >=    <=    ==   !=) 연산의 결과의 데이터 타입은 무조건 boolean
		
		System.out.println(2 > 1);

		System.out.println(2 < 1);

		System.out.println(2 == 1);
		System.out.println(2 != 1);
		
		System.out.println(Boolean.parseBoolean("true"));
		
		System.out.println("--------------------논리 연산자의 리턴값------------------------");
		
		
		// 논리연산자 ( &&   || )
		
		System.out.println("and( && )");
		System.out.println("true && true = " + (true && true));
		System.out.println("false && true = "+ (false && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && false = " + (false && false));
		System.out.println("");
		System.out.println("and( || )");
		System.out.println("true || true = " + (true || true));
		System.out.println("false || true = "+ (false || true));
		System.out.println("true || false = " + (true || false));
		System.out.println("false || false = " + (false || false));
		
		System.out.println("--------------------------------------------");
//		System.out.println("true" && true); 	// the operator && is not defined for string and boolean
		System.out.println("true" + true);		// truetrue 출력
		System.out.println(Boolean.parseBoolean("true") && true);	
		// 함수를 통과해 return을 boolean으로 받았을 시 활용 할 수 있는 예시
		
		
		System.out.println("-------------------기본형 타입을 문자열로 변환-------------------------");
		
		// 10hi
		int var1 = 10;
		// var1 변수를 String 타입으로 변화시켜 보자.
		
		System.out.println(String.valueOf(var1) + 11); 
		
		
		
		
		
	}
	

}
