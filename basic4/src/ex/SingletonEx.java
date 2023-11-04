package ex;

public class SingletonEx {

	public static void main(String[] args) {

//		new Singleton(); 막아서 안됨.

		Singleton singleton = Singleton.getInstance();

		System.out.println(singleton);

		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);

	}
}
