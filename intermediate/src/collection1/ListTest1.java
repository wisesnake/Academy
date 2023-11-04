package collection1;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		// 자료의 개수를 고정하지 않은 상태에서 저장하는 자료구조는 List (interface)
		// 리스트의 인터페이스를 구현한 Arraylist라는 클래스가 존재함.
		// Arraylist의 객체를 만들어보자
//		ArrayList arrayList = new ArrayList(); 이렇게 선언하면 단순히 OBJECT라는 데이터타입으로 선언됨
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// 이렇게 해야 해당 리스트에 저장되는 값이 인티저타입으로 저장됨
		//ㄴ> generic 포괄적인 : <>쓰고, 기본형을 객체로 감싼 타입인 wrapper클래스읜 inteeger, Double을 클래스 뒤에 붙여줘라
		
		System.out.println(arrayList);
		arrayList.add(30);
		// 컨트롤 스페이스 바 시 나오는게 object 라는 데이터타입이 매개값으로서 사용된다고 뜨는데,
		// 오브젝트란 최상위의 클래스를 뜻함.
	
		System.out.println(arrayList);
	
		arrayList.add(40);
	
		System.out.println(arrayList);

		arrayList.add(50);
		
		System.out.println(arrayList);
		
		arrayList.add(60);
		
		System.out.println(arrayList);
	
		System.out.println(arrayList.get(1));
		
		System.out.println("===================================");
		//쉬운버전
		int tot = 0;
//		1)캐스팅
		for(int i = 0 ; i < arrayList.size();i++) {
			tot += (int)arrayList.get(i);
		}
		System.out.println(tot);
		
//		2)향상for문
		int tot2 = 0;
		for(int value : arrayList ) {
			tot2 += value;
		}
		System.out.println(tot2);
		
	}

}
