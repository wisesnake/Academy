package exceptionEx;

public class CatchByExceptionKindEx {

	public static void main(String[] args) {
		try {
			int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.printf("%s + %s = %d",args[0],args[1],result);	
		} catch(NumberFormatException e) {
			System.out.println("숫자 형태로만 넣어주세요");
			//args 매개변수를 "일" 하나만 넣는다고 해서 밑의 매개변수 개수에 대한 예외까지 같이 적용되진 않음.
			//가장 먼저 마주친 예외 catch 실행되고 끝남. 이유는 try블록에서 예외가 발생했을 때 즉시 프로그램을 멈추고
			//해당 catch로 이동하기 때문임.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수를 두개 넣어주세요");
		}
	}

}
