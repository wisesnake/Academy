package chpt11x;

public class LoginExample {

	public static void main(String[] args) {

		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
		//id 가 blue가 아니라면 notexistid~발생
		if(!id.equals("blue")) {
			throw new NotExistIDException(id+"는 존재하지 않는 아이디입니다.");
		}
		//비번틀리면 wrongpassword~ 발생.
		if(!password.equals("12345")) {
			throw new NotExistIDException("틀린 비밀번호를 입력하셨습니다.");
		}
			
	}

}
