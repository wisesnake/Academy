package chpt15ex;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum , String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student student) {
			if (this.studentNum == student.hashCode()) {
				return true;
			}
		}
		return false;

	}
}
