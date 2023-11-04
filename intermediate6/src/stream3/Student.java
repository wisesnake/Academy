package stream3;

public class Student {
	private String name;
	private String familyName;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, String familyName, int score) {
		super();
		this.name = name;
		this.familyName = familyName;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFamilyName() {
		return familyName;
	}


	public int getScore() {
		return score;
	}
	
	
}
