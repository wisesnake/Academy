package generic_ex;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		box1.content="apple";
		System.out.println(box1.content);
		box1.content=10;
		System.out.println(box1.content);
		
		//다양한 내용물을 저장해야 하는 클래스를 선언할 때 쓰이는 제너릭타입으로 선언했을 시, 객체를 만들 때
		//특정 데이터타입임을 명시하지 않으면 자동으로 Object 타입으로 객체는 생성된다.
		//이 때, 해당 객체의 내용물을 getter등으로 얻어 올 때, 해당 객체에 어떤 데이터 타입이 저장될 지에 대해
		//코딩을 할 때 해당 객체에 특정 타입이 저장됨을 특정할 수 있다면, 해당 타입들로 캐스팅하여 해당 타입의 변수에 값을 대입하여
		//받아올 수는 있으나, 이는 하드코딩의 문제점과, 어떠한 타입인지 특정할 수 없을 시 instanceof로 검사하여 형변환해야한다는 단점이 있다.
		//또한, instanceof 를 이용한 타입검사나 캐스팅 형변환 등의 필요없는 과정을 미리 스킵함으로써, 최적화의 영역으로까지 의미를 확장할 수 있다.
		//따라서 위와같이 사용해도 되나, 정확한 사용법은 하기와 같다. Box<String> 자체가 데이터 타입이라고 생각하면 편함.
		
		//Box객체가 생성될 시접에 다른 타입으로 대체됨, 타입 체크 후 형변환 미리 해둠.
		
		Box<String> box2 = new Box<>();
		
//		box2.content = 10; 위와는 다르게 문자열 데이터 타입으로 객체 생성시 타입이 정해졌으므로, 컴파일 에러가 남.
		box2.content = "banana";
		
		//이번에는 당연히 정수형도 들어갈 수 있다.
		Box<Integer> box3 = new Box<>();
		
		box3.content = 10;
//		box3.content = "pineApple";
	}

}
