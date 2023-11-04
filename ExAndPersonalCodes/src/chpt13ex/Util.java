package chpt13ex;

public class Util {
	
	static <K,V> V getVal(Pair<K, V> p, K key) {
		//getVal 메서드는 매개변수로 K,V 제너릭타입을 갖고 있으며, 리턴으로는 그 중 V타입을 리턴할것임.
		//즉 이 메서드는 class<K,V> 형식의 클래스, 여기서는 매개변수의 Pair<K,V> 형식의 객체 p와 
		//해당 객체의 K 타입의 키 key를 입력으로 받아 V를 반환하게 됨.
		if(p.getKey() == key) {
			//Pair클래스에 선언된 getKey()를 객체접근하여 사용.
			return p.getVal();
			//Pair클래스에 선언된 getVal()를 객체접근하여 사용.
		} else {
			return null;
		}
	}
}
