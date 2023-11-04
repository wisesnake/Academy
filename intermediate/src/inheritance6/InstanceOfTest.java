package inheritance6;

public class InstanceOfTest {

	public static void main(String[] args) {

		Parent p = new Parent();
	
		System.out.println(p instanceof Parent);
		
		Child c = new Child();
		
		System.out.println(c instanceof Parent);
	}

}
