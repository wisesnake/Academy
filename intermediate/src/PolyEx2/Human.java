package PolyEx2;

public class Human extends Animal{
	@Override
	void move() {
		super.move();
		System.out.println("인간은 두발로 뛴다.");
	}
}
