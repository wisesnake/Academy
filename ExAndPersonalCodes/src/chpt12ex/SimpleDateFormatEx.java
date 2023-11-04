package chpt12ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		Date now = new Date();
		String nowStr = now.toString();
		System.out.println(nowStr);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String today = sdf.format(now);
		
		System.out.println(today);
		
	}

}
