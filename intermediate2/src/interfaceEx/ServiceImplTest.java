package interfaceEx;

public class ServiceImplTest {
	public static void main(String[] args) {
		ServiceImpl impl = new ServiceImpl();
		
		impl.defaultMethod1();
		impl.defaultMethod2();
		System.out.println("========");
		Service.staticMethod1();
		Service.staticMethod2();
	}
}
