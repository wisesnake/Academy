package iostream;

import java.io.Serializable;

public class Member implements Serializable {
	
	
	private static final long serialVersionUID = -7145631995128762279L;
	
	private String id;
	private String name;
	
	
	public Member() {

	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return this.id + " : " + this.name;
	}
	
}
