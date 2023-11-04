package chpt13ex;

public class ContainerEx {

	public static void main(String[] args) {
		Container<String> con1 = new Container<String>();
		con1.set("홍길동");
		String str = con1.get();
		System.out.println(str);
		
		Container<Integer> con2 = new Container<Integer>();
		con2.set(6);
		int value = con2.get();
		System.out.println(value);
		
		Container2<String, String> con3 = new Container2<String, String>();
		con3.set("홍길동","도적");
		String name1 = con3.getKey();
		String job = con3.getValue();
		System.out.println(name1 +" : " + job);
		
		Container2<String, Integer> con4 = new Container2<String, Integer>();
		con4.set("김길동",35);
		String name2 = con4.getKey();
		int age = con4.getValue();
		System.out.println(name2 +" : " + age);
		
	}

}
