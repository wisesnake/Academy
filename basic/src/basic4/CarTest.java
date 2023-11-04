package basic4;


public class CarTest {
	public static void main(String[] args) {
		
		Car car1 = new Car("횬다이");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		// 객체의 생성자 매개변수를 하나만 넣었지만 , Car 클래스에서 매개변수 1개짜리도 3개짜리와 this(str,str,int) 와 같이 연결해두었기때문에
		// 세개짜리 생성자에 코딩되어있는 대로 필드 세개가 모두 초기화가 된 모습.
		System.out.println("=====================");
		Car car2 = new Car("횬다이", "Black");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		// 두개짜리 역시 세개짜리와 연결해두었더니 객체의 속성 3개가 전부 초기화 된 모습.
	}
}


