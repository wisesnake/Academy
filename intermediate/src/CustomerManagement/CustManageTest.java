package CustomerManagement;

public class CustManageTest {

	public static void main(String[] args) {
//		Customer hong = new Customer();
		Customer cust1 = new Customer();
//		hong.custName("홍길동");
		
//		System.out.println(hong.custGrade);
//		System.out.println(hong.BonusRatio);
//
//		int price = hong.calcPrice(1000);
//		System.out.println("cal1 고객이" + price + "원짜리 물건을 샀다.");
//		
//		String info=hong.showCustInfo();
//		System.out.println(info);
				
		cust1.setCustomerName("홍길동");
		cust1.setCustomerId(10010);
		
		int custId = cust1.getCustomerId();
		String name = cust1.getCustomerName();
		
		System.out.println(name + "님의 고객번호는 " + custId + " 입니다.");
		System.out.println("===========================");
	
		System.out.println(cust1.calcPrice(1000) + "원 짜리 물건을 삼");
		String info = cust1.showCustInfo();
		System.out.println(info);
		
		System.out.println("---------------------------");
		
		
		System.out.println(cust1.calcPrice(1000) + "원 짜리 물건을 삼");
		String info2 = cust1.showCustInfo();
		System.out.println(info2);
		
		System.out.println("---------------------------");
		
		
		System.out.println(cust1.calcPrice(1000) + "원 짜리 물건을 삼");
		String info3 = cust1.showCustInfo();
		System.out.println(info3);
		
		System.out.println("---------------------------");

		System.out.println();
		Customer cust2 = new Customer();
		
		cust2.setCustomerName("이순신");
		String name2 = cust2.getCustomerName();
		cust2.setCustomerId(10011);
		
		int custId2 = cust2.getCustomerId();
		System.out.println(name2 + "님의 고객번호는 " + custId2 + " 입니다.");
		System.out.println("===========================");
		
		System.out.println(cust2.calcPrice(1000000) + "원 짜리 물건을 삼");
		String info4 = cust2.showCustInfo();
		System.out.println(info4);
		System.out.println("---------------------------");
		
		System.out.println(cust2.calcPrice(5000000) + "원 짜리 물건을 삼");
		String info5 = cust2.showCustInfo();
		System.out.println(info5);
		System.out.println("---------------------------");
		
	}

}
