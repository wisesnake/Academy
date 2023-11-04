package inheritance5;

public class ChildTest {

	public static void main(String[] args) {

		Child child = new Child();
		
		System.out.println(child);
		
//=========자동현변환 후
		Parent parent = child;

		System.out.println(parent);
		System.out.println(parent == child);
		
		parent.method1(); // p-m1
		parent.method2(); // c-m2
		System.out.println("===");
		child.method1(); // p-m1
		child.method2(); // c-m2
						// 오버라이딩 된 경우에는 형변환이 일어나도 오버라이드 된 버전으로 실행됨.
		child.method3();
		//부모타입의 Child로 강제 형 변환 후에 자식 메서드에는 접근 가능
		System.out.println("===");
		Child pp3 = (Child)parent;
		pp3.method1();
		pp3.method2();
		pp3.method3();
		System.out.println("===");
		Parent pp2 = child;
		pp2.method2();
		
	}

}
