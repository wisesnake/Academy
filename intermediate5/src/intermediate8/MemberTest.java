package intermediate8;

public class MemberTest {

	public static void main(String[] args) {

		Member m1 = new Member();

		try {
			m1.setName(null);
		} catch (Exception e) {
			System.err.println("이름에는 null이 들어갈 수 없습니다~");
		}

		System.out.println(m1.getId());

		System.out.println(m1);

	}

}