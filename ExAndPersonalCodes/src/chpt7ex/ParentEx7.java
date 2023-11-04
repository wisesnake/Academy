package chpt7ex;

public class ParentEx7 {
	public String nation;
	
	public ParentEx7() {
		this("대한민국");
		System.out.println("parent() call");
	}
	
	public ParentEx7(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}