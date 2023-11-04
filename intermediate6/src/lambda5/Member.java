package lambda5;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.id + "," + this.name;
	}
	
}
