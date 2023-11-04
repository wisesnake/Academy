package chpt13ex;

public class UnitEx {

	public static void main(String[] args) {

		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getVal(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍딩동", 20);
		Integer childAge = Util.getVal(childPair, "홍딩동");
		System.out.println(childAge);
		
		
	}

}
