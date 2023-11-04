package base_ex2;
//해당 패키지는 record 를 활용한 코드와의 비교를 위한 코드.

public class Student {
	private final int age;
	private final String name;

	public Student(int no, String name) {
		super();
		this.age = no;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		int hashCode = this.age + name.hashCode();
		return hashCode;
	}	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student stu) {
			if (this.age == stu.getAge() && this.name.equals(stu.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "학생 나이 : " + this.age + ", 이름 : " + this.name;
	}
}
