package inheritEx2;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("kim");
		Person lee = new Person("lee");
		
		Menu star = new StarCoffee("아메리카노", 4000);
		Menu bean = new BeanCoffee("라떼", 4500);
		
		kim.buy(star);
		lee.buy(bean);
	}

}
