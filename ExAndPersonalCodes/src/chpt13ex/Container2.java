package chpt13ex;

public class Container2<K, V> {
	K key;
	V val;

	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	public V getValue() {
		// TODO Auto-generated method stub
		return this.val;
	}

	public void set(K key, V val) {
		this.key = key;
		this.val = val;
	}
}
