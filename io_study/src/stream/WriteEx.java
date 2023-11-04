package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		// 입출력을 하기 위해서 스트림이라는 공간이 필요.
		// 그 공간을 만들 객체가 필요함.
		// 그 객체는 바로 입출력 관련 클래스에서 만들 수 있음.
		// 입출력 관련 클래스(바이트스트림, 문자스트림)

		// 1)바이트 스트림(동영상, 이미지 등, 메모장으로 열었을 때 깨지는 파일)

		// 입력은 여러 상황에 대한 예외 처리를 항상 해줘야 함.

		// 바이트스트림 : OnputStream,OutputStream

		// FileOutputStream는 파일명을 집어넣어서 파일로 출력이 되게하는 파일출력 객체를 만드는 클라스

		//버퍼를 사용하는 이유는 출력 성능 향상을 위해서임
		//
		//버퍼는 데이터를 일시적으로 저장하거나 처리 지연을 관리하기 위한 임시 메모리 영역을 가리킵니다. 
		//버퍼는 데이터를 한 곳에서 다른 곳으로 전송하거나 처리하는 동안 데이터 흐름을 조절하고 최적화하는 데 사용됩니다
		
		try {
			OutputStream os = new FileOutputStream("C:\\ex\\data\\test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			byte d = 40;
			byte e = 50;
			
			
			os.write(a);
			os.write(b);
			os.write(c);
			os.write(d);
			os.write(e);

			os.flush();
			//ㄴ>버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("바이트데이터 (텍스트 파일이 아님) 쓸 파일이 없는 예외");
			e.printStackTrace();
		} catch (IOException e) {
//
		}

	}

}
