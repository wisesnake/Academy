package package2;

import package1.B;

public class C {
//	A a; // package1 패키지에 A가 있지만, A클래스는 default 접근제한자를 가지므로 다른 패키지인 현 패키지에서 접근 불가(import불가)
	B b; // public 접근제어자를 가지는 B클래스는 import를 통해서 불러오기 가능.
}
