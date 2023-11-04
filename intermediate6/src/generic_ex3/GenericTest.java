package generic_ex3;

public class GenericTest {

	// 제너릭 메서드
//  generic 메서드를 사용하는 이유
	/*
	 * 제네릭(Generic) 메서드는 다양한 데이터 유형에서 동작하는 메서드를 작성할 때 사용됩니다. 제네릭 메서드를 사용하는 이유는 다음과
	 * 같습니다: 타입 안정성(Type Safety): 제네릭 메서드를 사용하면 컴파일 시간에 타입 안정성을 보장할 수 있습니다. 즉, 잘못된
	 * 데이터 유형이 메서드에 전달되는 것을 방지할 수 있습니다. 이로 인해 실행 시간 오류를 방지하고 코드의 신뢰성을 높일 수 있습니다.
	 * 
	 * 코드 재사용성: 제네릭 메서드를 사용하면 동일한 로직을 다양한 데이터 유형에 대해 재사용할 수 있습니다. 특정 데이터 유형에 의존하지 않고
	 * 일반적인 알고리즘을 작성할 수 있으므로 코드의 재사용성이 향상됩니다.
	 * 
	 * 가독성 향상: 제네릭 메서드를 사용하면 메서드의 이름이나 구현 코드를 반복해서 작성할 필요가 없으므로 코드의 가독성이 향상됩니다. 일반적인
	 * 메서드를 여러 번 복사 및 수정할 필요 없이 하나의 제네릭 메서드로 다양한 상황에서 사용할 수 있습니다.
	 * 
	 * 유지 보수성: 제네릭 메서드를 사용하 면 코드를 더 쉽게 유지 관리할 수 있습니다. 데이터 유형이 변경되거나 추가될 때 코드 수정이
	 * 간소화됩니다.
	 * 
	 * 컬렉션과 연동: 많은 자료구조 및 컬렉션 라이브러리에서 제네릭을 사용하고 있습니다. 따라서 제네릭 메서드를 사용하면 이러한 라이브러리와
	 * 상호 작용하기가 훨씬 쉬워집니다. 예를 들어, 제네릭 메서드를 사용하여 배열, 리스트, 집합, 맵 등 다양한 컬렉션 유형에서 작동하는
	 * 정렬, 검색, 필터링 등의 메서드를 작성할 수 있습니다. 이렇게 하면 코드의 재사용성과 안정성이 향상되며, 더 효율적으로 작업할 수
	 * 있습니다.
	 */
	static <T> Box<T> boxing(T t) {
		// 매개변수 및 리턴타입을 box클래스의 파라미터타입의 필드로 지정하기 위해(Box<T>클래스의 T t;)
		// 해당 메서드는 객체의 필드에 특정 데이터타입을 결정하여 초기화 하기 위한 메서드.
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = boxing(100);
		//제너릭 타입 클래스인 Box클래스를 참조하는 box1객체의 값을 저장하는 필드 t을 Integer데이터타입으로 결정시키고
		//거기에 setter메서드를 이용해 매개값 100으로 t를 초기화시키는 객체 생성 과정.
		int intVal = box1.getT();
		//Integer로써 결정되어 생성된 객체의 필드 t 의 값을 getter로 읽어오는 과정.
		System.out.println(intVal);

		Box<String> box2 = boxing("hi");
		String strVal = box2.getT();
		System.out.println(strVal);

	}

}
