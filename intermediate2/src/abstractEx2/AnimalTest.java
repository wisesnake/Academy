package abstractEx2;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog = new Dog();
		
		System.out.println("===========");
		System.out.println("밑은 dog || cat.sound()");
		dog.sound();
		
		Cat cat = new Cat();
		
		cat.sound();
		
		System.out.println("===========");
		System.out.println("밑은 animalSound(cat || dog)");
		animalSound(cat);
		animalSound(dog);
	}
	
	static void animalSound(Animal animal) {
		//cat과 dog는 추상클래스 Animal을 상속받았으므로, 매개변수로 Animal클래스타입을 넣어도 둘 다 해당됨.
		animal.sound();
	}

}
