package interfaceEx;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		 
		animal.run();
		
		animal.breathe();
		
		Animal.runAway();
		
		System.out.println("고양이의 눈의 갯수 : " + Animal.NUMBER_OF_EYES);;
		System.out.println("고양이의 다리의 갯수 : " + Animal.NUMBER_OF_LIMB);;
		System.out.println("====================================");
		animal = new Lion();
		
		
		animal.run();
		
		animal.breathe();
		
		Animal.runAway();
		
	}

}
