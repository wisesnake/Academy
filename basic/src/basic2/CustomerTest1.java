package basic2;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		
		cust1.name = "임슬범";
		cust1.gender = "남성";
		cust1.job = "개발자";
		cust1.age = 33;
		cust1.addr = "경기도 용인시";
		
		System.out.println(cust1.name);
		System.out.println(cust1.age);
		System.out.println(cust1.addr);
		System.out.println(cust1.gender);
		System.out.println(cust1.job);
	
		System.out.println("=====================");
		
		Customer cust2 = new Customer();
		
		cust2.name = "임하린";
		cust2.gender = "남성";
		cust2.job = "직업상담사";
		cust2.age = 38;
		cust2.addr = "서울특별시";
		
		System.out.println(cust2.name);
		System.out.println(cust2.age);
		System.out.println(cust2.addr);
		System.out.println(cust2.gender);
		System.out.println(cust2.job);
		
		
		
	}

}
