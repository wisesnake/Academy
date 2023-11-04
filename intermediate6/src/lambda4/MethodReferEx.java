package lambda4;

public class MethodReferEx {

	public static void main(String[] args) {
		Person person=new Person();
		System.out.println("람다식 리턴x+y");
		person.action((x,y)->{
			return x+y;
		});
		//매개변수 형태가 함수형 인터페이스 이므로, 함수 들어갈 수 있음
		//익명함수형태로 들어감
		
		System.out.println("람다식 스태틱메서드");
		person.action((x,y)->{
			return Computer.staticMethod(x, y);
			});
//		ㄴ> 더 쉽게
		//메서드 참조한 메서드를 참조해서 매개변수의 정보 및 리턴타입을 알아내
		//람다식에서 불필요한 매개변수를 제거하는것을 목적으로 함.
		System.out.println("람다식 더 간략한 스태택메서드 x+y");
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		
		System.out.println("람다식 더 간략한 인스턴스메서드 x+y");
		person.action(com :: instanceMethod);
	}

}
