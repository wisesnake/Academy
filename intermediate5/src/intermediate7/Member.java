package intermediate7;

import lombok.Data;

//id는 값을 절대 바꿀 수 없게 하고 싶고 

//name 은 null 이 들어가지 않도록 하고 싶음.


@Data
//getter setter tostring 대체

public class Member {
	
	private final String id; 
	// final은 setter가 만들어지지 않는다. (변경할 수 없으므로)
	private String name;
	private int age;

	public Member() {
		this.id = "hong";
	}
}
