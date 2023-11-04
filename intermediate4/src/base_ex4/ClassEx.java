package base_ex4;

public class ClassEx {

	public static void main(String[] args) {

		//객체를 만든 후 그 객체에 대한 메타 데이터 가져오기
//		Car car = new Car();
//		Class cls = car.getClass();
//		System.out.println(cls);
//		System.out.println("class 객체의 메타 데이터에서 이름 : " +cls.getName());
//		System.out.println("class 객체의 메타 데이터에서 간단한 이름 : " +cls.getSimpleName());
//		System.out.println("class 객체의 메타 데이터에서 패키지 이름 : " +cls.getPackageName());
		
		//객체를 만들지 않고 하는 메타 데이터 가져오는 방식
		try {
			Class cls = Class.forName("base_ex4.Car");			
			System.out.println(cls.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
