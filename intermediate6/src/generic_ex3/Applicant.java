package generic_ex3;

public class Applicant<T> {
	
	public T kind;
	//지원자 종류가  kind
	//지원자 종류의 타입이 어떤지 모르는 상태임, 거기에는 Person타입의 자식타입이 누구든지 들어갈 수 있음. 

	public Applicant(T kind) {
		//들어오는 객체를 Applicant.kind 로, 즉, 코스 등록자의 종류로.
		this.kind = kind;
	}
}
