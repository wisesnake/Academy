package exandpersonal;

public class ShopService {
	
	private static ShopService shopservice = new ShopService();
	// 이 클래스 내에서만 접근할 수 있는(private) Shopservice 의 기본 생성자를 통해 shopservice 객체를 생성하되,
	// 해당 객체 또한 private 선언하여 내부 클래스에서만 접근가능, 단, 객체가 아닌, 클래스를 호출하였을 때 로드되도록
	// static으로 선언하였음.
	
	private ShopService(){
	// 해당 클래스로 접근할 수 있는 통로인 기본 생성자를 private 선언하여 외부클래스에서 접근 못하게.
	}
	
	public static ShopService getInstance(){
		// 외부클래스에서 ShopService.getInstance 메소드를 통해 호출하였을 시, ShopService클래스 참조형 
		// 데이터타입인 shopservice 객체를 리턴받도록 설정. 
		return shopservice;
	}
}
