package basic3;

public class HouseTest {

	public static void main(String[] args) {
		
		House houseObj = new House();
		//new연산자를 이용해 생성자를 통해 실행된 house()의 필드 및 메소드를 지니고 있는 객체를 참조하는 주소를 생성 한 후,
		//houseObj 변수에다가 그 주소값을 넣어라. 따라서 위와같이 선언된 클래스변수 houseObj에는 House클래스의 기본생성자를
		//통해 바뀐 필드의 데이터값이나 실행된 메소드의 리턴값을 지니고 있는 가상의 생성된 객체에 접근할 수 있는 주소가 들어가게 됨.
		//생성자를 통해 실행된 필드 및 메소드를 지니고 있으므로, 해당 예문에서 House() 생성자 내부에는 this의 정체를~ 하는 문자열을 출력하는
		//실행문이 생성자 블럭 내에 기입되어 있으므로 이대로 이를 먼저 실행하게 된 걸 볼 수 있음.
		
		System.out.println("houseObj 객체 : " + houseObj);
		// class에서의 this와 여기서 새롭게 House를 참조하는 객체를 만든 후 이를 참조하는 House타입 객체변수의 주소값이 같음을 확인 가능.
		// ----->>>>기본생성자를 통해 생성된 객체의 주소가 houseObj변수에 들어가있다.
	}

}
