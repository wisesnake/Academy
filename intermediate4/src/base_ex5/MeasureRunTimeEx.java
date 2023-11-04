package base_ex5;

import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MeasureRunTimeEx {

	public static void main(String[] args) {
		// ==============================System 클래스=========================
//		//--time--
//		long start = System.nanoTime();
//		
//		int tot=0;
//		for(int i = 0 ; i<1000000000; i++) {
//			tot+=i;
//		}
//		long end=System.nanoTime();
//		
//		System.out.println((end-start) + "초");
//		
//		long start2 = System.nanoTime();
//		
//		int tot2=0;
//		for(int i = 0 ; i<2000000000; i++) {
//			tot2+=i;
//		}
//		long end2=System.nanoTime();
//		
//		System.out.println((end2-start2) + "초");

//		//--getproperty--
//		System.out.println(System.getProperty("java.specification.version"));
//		System.out.println(System.getProperty("java.specification.version"));
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("user.dir"));
//		
//		Properties a = System.getProperties();
//		
//		
//		Set<Object> keySet = a.keySet();
//		
//		for(Object key : keySet) {
//			String k = (String)key;
//			String value = System.getProperty(k);
//			System.out.printf("%30s : %s \n",k,value);
//	}

//			======================문자열 클래스======================
//			//stringbuilder
//			StringBuilder strbulider = new StringBuilder();
//			
//			strbulider.append("AEF");
//			System.out.println(strbulider);
//			
//			strbulider.insert(1, "BCD");
//			System.out.println(strbulider);
//	
//			strbulider.delete(0, 2);
//			System.err.println(strbulider);
//			//stringtokenizer
//		String data = "A,B,C,D,E,F";
//		String strArr[] = data.split(",");
//		for(String str : strArr) {
//			System.out.println(str);
//		}
//		//
//		System.out.println("===하기는 토크나이저===");
//		String data2 = "A,B,C";
//		
//		StringTokenizer strTokenizer = new StringTokenizer(data,",");
//		
//		while(strTokenizer.hasMoreElements()) {
//			String str = strTokenizer.nextToken();
//			System.out.println(str);
//		}
//		//정규표현식(Regular Expression)
		String regExp = "(010)-\\d{3,4}-\\d{4}";
		
		String sample = "010-8627-8723";
		
		boolean flag = Pattern.matches(regExp, sample);
		if(flag) {
			System.out.println("패턴일치"); 
		}else {
			System.out.println("불일치");
			
		}
	}

}
