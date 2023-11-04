package chpt17ex;

public class Member {
	private String name;
	private String job;
	private int age;
	
	public Member(String name, int score) {
		this.name = name;
		this.age = score;
	}
	
	
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}



	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}
	
	public int getAge() {
		return age;
	}
		
}
