package intermediate5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // get~~~ 작성해줌
@Setter // set~~~작성해줌
@ToString // tostring 오버라이드 해줌
@NoArgsConstructor // 기본생성자 만들어줌
@AllArgsConstructor // 모든 필드들 초기화하는 생성자 만들어줌
public class Member {
	
	private String id;
	private String name;
	private int age;
	
	
	
	
//	public Member(String id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//	

	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "아이디 : " + this.id + "\n이름 : " + this.name + "\n나이 : " + this.age;
// 	}
}
