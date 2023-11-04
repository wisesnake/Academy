package chpt9ex;

public class ActionSample {

	public static void main(String[] args) {
		Action action = new Action() {
			//인터페이스 구현클래스 생성 안하고 다이렉트로 객체에 꽂아넣기
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}
	

}
