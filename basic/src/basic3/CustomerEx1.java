package basic3;

public class CustomerEx1 {

	public static void main(String[] args) {

		
		// 초기값을 제공하지 않을 경우, 필드는 객체 생성시 자동으로 기본값(0, null)으로 초기화
		Customer cust1 = new Customer();
		// 
		
		
		System.out.println("-----");
		System.out.println(cust1.byteVal1);
		System.out.println(cust1.shortVal1);
		System.out.println(cust1.intVal1);
		System.out.println(cust1.longVal1);
		System.out.println("-----");		
		System.out.println(cust1.floatVal1);
		System.out.println(cust1.doubleVal1);
		System.out.println("-----");
		System.out.printf("[%s] \n", cust1.charVal1);
		System.out.println(cust1.boolVal1);
		System.out.println("-----");
		
		System.out.println("참조형");
		System.out.println(cust1.intArr);
		System.out.println(cust1.intArr[0]);
		System.out.println(cust1.intArr[1]);
		System.out.println(cust1.intArr[2]);
		
		System.out.println("참조형(클래스)");
		System.out.println(cust1.strArr);
		System.out.println(cust1.strArr[0]);
		System.out.println(cust1.strArr[1]);
		System.out.println(cust1.strArr[2]);
		
	}

}
