package chpt12ex;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Member {
	private String id;
	private String name;
	
	@Override
	public String toString() {
		return this.id + ": " + this.name;
	}
}
