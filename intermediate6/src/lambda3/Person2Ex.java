package lambda3;

public class Person2Ex {

	public static void main(String[] args) {

		Person2 person2 = new Person2();
		person2.action1((x, y) -> {
			double result = x / y;
			return result;
		});

		person2.action1((x, y) -> {
			return x * y;
		});

		person2.action1((x, y) -> {
			return sum(x, y);
		});
		person2.action1((x, y) -> sum(x, y));
	}

	static double sum(double x, double y) {
		return x + y;
	}
}
