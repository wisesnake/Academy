package basic;

public class CastingEx {

	public static void main(String[] args) {
		
		//강제 형변환 
//		byte 1
//		short 2 
//		int 4
//		long 8
//		
//		float 4
//		double 8 
//		
//		char 2
//		
//		boolean 1
		
		int  var1 = 10;
		
		byte var2 = (byte)var1;
		
		long var3 = 300;
		
		int var4 = (int)var3;
		
		int var5 = 65;
		
		char ch1 = (char)var5; // char 타입은 ASCII 값에 의해 정수형과 호환됨.
		
		System.out.println(ch1);
		
		double var7 = 3.84;
		
		int var8 = (int)var7;
		
		System.out.println(var8); // 3.84에서 캐스팅으로 실수 - > 정수 강제 형변환 하는 과정에서 소숫점이 날라갔음. 3.84에서 3이 남은걸로 보아 반올림 X
		
		

	}

}
