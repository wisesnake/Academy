package generic_ex;

public class GenericTest {

	public static void main(String[] args) {

		Product<Tv, String> product1 =new Product<>();
		//Product<Kind,Model>이나 다름없음.
		product1.setKind(new Tv());
		//Tv 의 tv객체 만들어서 걔를 넣어도 됨
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();
		//product1객체의 kind필드는 TV클래스타입이므로, 
		//Tv클래스 참조 타입인 변수 tv에 kind필드의 getter를 대입.
		String tvModel = product1.getModel();
		//product1 객체의 model필드를 String타입으로 객체를 생성했으므로,
		//String타입 변수 tvModel에 model필드의 getter를 대입.
		
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("포르셰");
		
		Car car = product2.getKind();		
		String carModel = product2.getModel();
		
		System.out.println(carModel);
	}

}
