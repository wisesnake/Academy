package interfaceEx2;

public class InterfaceImplTest {

	public static void main(String[] args) {
		//interfaceC는 A와 B를 상속받고, 이를 구현한 C의 객체를 생성하면
		//A B C 셋 다에 접근가능함.
		interfaceCImpl cImpl = new interfaceCImpl();
		
		cImpl.methodA();
		cImpl.methodB();
		cImpl.methodC();
		
		InterfaceA ia=cImpl;
		ia.methodA();
//		ia.methodB();
		InterfaceB ib=cImpl;
//		ib.methodA();
		ib.methodB();
		InterfaceC ic=cImpl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
