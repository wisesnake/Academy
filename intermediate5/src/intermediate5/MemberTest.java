package intermediate5;


public class MemberTest {
	public static void main(String[] args) {
		
		Member m2 = new Member();
		m2.setAge(15);
		m2.setName("김유신");
		m2.setId("kimugod");
		
		System.out.println(m2);
		
		
		Member m1 = new Member("kim", "gildong", 25);
//		System.out.printf("%s %s %d \n",m1.getName(),m1.getId(),m1.getAge());
//		
//		m1.setId("Hong");
//		m1.setAge(30);
//		m1.setName("Samdong");
//		System.out.printf("%s %s %d \n",m1.getName(),m1.getId(),m1.getAge());
//		
//		System.out.println(m1);
		
	}
	
}
