package inheritEx2;

public class Person {
	//f
	String name;
	
	
	
	//c
	
	Person(String name){
		this.name = name;
	}
	
	
	
	//m
	void buy(Menu menu) {
		System.out.printf("%s 님은 %d 원을 내고 %s 에서 %s 를 마셨습니다. \n",this.name,menu.fee,menu.brand, menu.coffee);
	}
	
	
}
