package lambda3;

public class PersonEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.action1((name,job)->{
			System.out.println(name+" : "+job);
		});
		
		person.action2((speak)->{
			System.out.println(speak);
		});
	}

}
