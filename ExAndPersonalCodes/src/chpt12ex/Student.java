package chpt12ex;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
	private String studentNum;

	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		// 각 객체마다 새롭게 생성된 해시코드가 아니라, 필드값 문자열 그 자체의 해시코드를 리턴시킴으로써
		// 다른 객체끼리도 같은 데이터값을 지니고 있으면 같은 해시코드를 갖도록 재정의.
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student student) {
			if (this.studentNum == student.getStudentNum()) {
				return true;
			}
		}
		return false;

	}
}
