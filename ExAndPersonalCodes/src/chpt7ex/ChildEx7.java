package chpt7ex;

public class ChildEx7 extends ParentEx7{
	public String name;
	
	public ChildEx7() {
		this("홍길동");
		System.out.println("ChildEx7() call");
	}
	
	public ChildEx7(String name) {
		this.name = name;
		System.out.println("ChildEx7(String name) call");
	}
	
}
