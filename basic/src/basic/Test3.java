package basic;

public class Test3 {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.action(new Workable() {
			
			@Override
			public void work() {
				System.out.println("공부하세");
			}
		});
		//본디 action에는 인터페이스타입 객체가 들어가야 하지만, 따로 인터페이스를 구현한 클래스를 만들고 뭐하고 하기 귀찮으니까
		//인터페이스객체 생성해서 그안에 블록만들고 따로 즉석에서 클래스를 작게 만들어서 함수를 구현한거임.
	}

}


//new Workable() {
//	
//	@Override
//	public void work() {
//		
//	}
//}
//ㄴ> person.action의 매개변수영역에 들어가있는 부분
// ㄴ 