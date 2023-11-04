package lambda5;

public class Human {
	Member getMember1(Creatable1 creatable1) {
		Member member1 = creatable1.create("winter");
		return member1;
	}
	
	Member getMember2(Creatable2 creatable2) {
		Member member2 = creatable2.create("winter","한겨울");
		return member2;
	}
}
