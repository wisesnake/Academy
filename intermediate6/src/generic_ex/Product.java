package generic_ex;

public class Product<K, M> {
	private K kind;
	private M model;
	
	
	//getter setter를 보면 getter는 해당 필드의 타입을 리턴하도록 생성되어야하는데,
	//파라미터 타입으로 리턴타입이 정해져있는걸 알 수 있음.
	
	//해당 클래스의 실행 메인 클래스에서 product1객체의 K를 Tv,M을 String으로
	//생성하였음을 유념하면서 getter setter의 리턴타입이 K 와 M 파라미터로 설정되어있으며
	//이게 어떤 의미인지를 다시한번 유념해 볼 것.
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
