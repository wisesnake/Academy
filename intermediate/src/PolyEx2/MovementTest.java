package PolyEx2;

public class MovementTest {
	public static void main(String[] args) {

		Movement movement = new Movement();
		movement.animal = new Animal();

		
		movement.OfAnimal();
		movement.animal = new Human();
		movement.OfAnimal();
		movement.animal = new Tiger();
		movement.OfAnimal();
		movement.animal = new Eagle();
		movement.OfAnimal();
		
		//OfAnimal 메소드에서는 Animal클래스타입 변수인 animal 을 참조하여 move 메소드를 실행함
		//그래서 animal에 Animal클래스의 자식클래스들의 객체를 생성하여 이를 참조하도록 대입할때마다
		//똑같은 메소드가 각각 자식클래스에 오버라이딩 된 대로 다르게 작동하는 걸 볼 수 있음.
		//이와 같은것이 바로 다형성임.
		
	}
}
