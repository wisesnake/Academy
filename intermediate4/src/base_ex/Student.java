package base_ex;

//이 클래스로부터 나온 객체가 진정한 동등 객체인지 확인하는 방법은 이 클래스 너머 hashCode()와
//equals()를 아래의 코드 형태로 재정의 해놓아야 함.

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	// 이 클래스를 통해 나온 객체가 진정한 동등한 객체인지(hashCode 값 리턴값이 같고, equals도 true가 나오는지)
	//같은 학생인지 여부를 확인하는 방법으로 hashCode() 재정의함.
	
	@Override
	public int hashCode() {
		int hashCode = this.no + name.hashCode();
		return hashCode;
//		해당 객체가 객체.hashCode()의 형태로 메세더 호출 시, 해당 객체의 해시코드를 no+name.hashCode()로 새롭게 대입.
//		여기서의 hashCode()는 재정의되기 전의 원래의 Object.hashCode(). 이걸 굳이 오버라이딩 하는 이유는
//		기존 hashCode는 객체별로 해시코드를 새롭게 생성하기 때문에 저장된 값이 같더라도 해시코드가 다르므로.
//		name.hashCode()는 객체의 해시코드가 아닌, 문자열 그 자체의 해시코드만 참조하므로 객체가 다르더라도 문자열이 같으면
//		같은 해시코드를 반환받게 되는거임.
	}	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student stu) {
			//들어온 매개변수의 데이터타입이 Student일 시 stu로 대입.
			if (this.no == stu.getNo() && this.name.equals(stu.getName())) {
				return true;
			}
		}
		return false;
	}

}
