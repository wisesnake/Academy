package CustomerManagement;

public class VVIPCustomer extends Customer{

	//f
	
	
	
	//c
	public VVIPCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//annotation : 얘도 주석이지만 컴파일러에게 뭔가를 지시함
	//@Override의 경우 하기코드를 재정의하라는 컴파일러에게 알려주는 역할.
	
	
	//m
	@Override
	public int calcPrice(int price) {
		System.out.println("재정의~");
		return 0;
	}

	
}
