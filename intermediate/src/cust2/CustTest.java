package cust2;

public class CustTest {

	public static void main(String[] args) {
		Customer lim = new Customer();
		lim.setCustName("임슬범");
		String name = lim.getCustName();
		lim.setCustId(10001);
		int buy = lim.calcPrice(1000);
		System.out.printf("%s 님이 %d 원을 구매했습니다.\n",name,buy );
		lim.showCustInfo();
		
		System.out.println("===================================");
		VIPCustomer kim = new VIPCustomer();
		kim.agentId = 1;
		kim.setCustName("김슬범");
		String name2 = kim.getCustName();
		kim.setCustId(10002);
		int buy2 = kim.calcPrice(100000);
		System.out.printf("%s 님이 %d 원을 구매했습니다.\n",name2,buy2);
		
		kim.showCustInfo();
		
		
		
		
		
		
		
	}

}
