package inheritance2;

public class MainTest {

	
//MainTest 틀이지만, 이 프로그램은 실행만을 위한 틀이다.
//이 틀 안에는 필 생 메를 따로 넣을 필요는 없다.
//단지, 메인 메소드만 넣어서 실행하면 된다.

//실행하려고 보니, 실제 세계의 사람이 실제 차를 타고 다니는 상황을 묘사하고자 함.
//실체화 된 객체들이 현실세계에 돌아다닌다는 생각으로,
//틀에서 객체를 만들어내는것이 우선임.
	
//그래서 사람 틀과, 차 틀에서 각각 실체화된 객체를 먼저 만들어 주고
//틀 간의 관계를 생각해보자...
	
//사람이 차를 소유하는 관계이므로 그러한 메서드를 차에 선언해서
//그 차의 소유자를 정해보자...


	
	
	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		System.out.println(hong.name);
		
		Car flmodel = new Car("F사","람*");
		System.out.println(flmodel.company + "\n" +flmodel.model);
		
		//해당 메인 클래스에서 Person 클래스타입인 객체 변수 hong에서, name필드는 홍길동임
		//그리고 owner의 경우,
		//flmodel.owner(hong);
		
		flmodel.drive1("홍길동 ");
		
		flmodel.drive1(hong);
		
		String status = flmodel.take();
		System.out.println(hong.name + "이라는 사람이" + status);
		Person kim = new Person("김삿갓");
		flmodel.drive1(kim);
		System.out.println(kim.name + "이라는 사람이" + status);
		
	}

}
