package chpt11x;

public class NotExistIDException extends Exception{
	public NotExistIDException() {	}
	public NotExistIDException(String message) {	
		super(message);
		//Exception객체의 공통 메소드인 getMessage의 리턴값으로 사용.
	}
}
