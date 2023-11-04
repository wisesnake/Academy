package CustomerManagement;

public class CustomerTest2 {

	public static void main(String[] args) {

		VVIPCustomer vvipCust1 = new VVIPCustomer();
		
		//현실에서 부모 없는 자식이 있을 수 없듯이, 자식객체를 생성하면 부모객체가 먼저 생성된 다음에,
		//자식객체가 생성이 된다.
		
		//자식 VVIPCustomer() 의 객체만 생성된것으로 보이지만, 사실 부모인 Customer() 객체가 먼저 생성되고
		//그 다음에 자식인 VVIPCustomer() 객체가 생성된 것이다.
		int price = vvipCust1.calcPrice(1000);
		//ㄴ>메소드가 오버라이드 되었음.
		System.out.println(price);
		
		
		
		
	}

}
