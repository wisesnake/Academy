package iostream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			//outputstream은 내부에 작은 buffer를 갖고 있음.
			//write 메서드가 호출되면, 버퍼에 바이트를 우선 저장하고,
			//버퍼가 차면, 순서대로 바이트를 출력한당.
			//flush는, 내부 버퍼에 잔류하는 모든 바이트를 출력하여 비워냄.
			//출력스트림을 더이상 사용하지 않는 경우, close를 호출하여 스트림을 종료해주는게 좋음.
			OutputStream ous = new FileOutputStream("c:/ex/text1.db");
			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;

			byte a[] = {10,20,30,40,50};
			
			
			ous.write(a,1,3);
//			ous.write(b);
//			ous.write(c);

			ous.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
