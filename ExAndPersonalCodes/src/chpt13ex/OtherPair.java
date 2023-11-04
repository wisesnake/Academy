package chpt13ex;

public class OtherPair<K,V> {
	K key;
	V val;
	
	public OtherPair(K key, V val) {
		this.key = key;
		this.val = val;
	}

	public K getKey() { return key;}
	public V getVal() { return val;}
}
