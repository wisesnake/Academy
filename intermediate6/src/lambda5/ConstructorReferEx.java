package lambda5;

public class ConstructorReferEx {

	public static void main(String[] args) {
		Human human = new Human();
		
		//생성자 참조 Member :: new
		//생성자를 참조한다는 것은 객체를 생성하여 참조한다는 것.
		//람다식이 단순히 객체를 생성하고 리턴하도록 구성된다면
		Member m1 = human.getMember1(Member :: new);
		Member m2 = human.getMember2((str1,str2)->{
			return new Member(str1,str2);
		});
		System.out.println(m1);
		System.out.println(m2);
	}

}
