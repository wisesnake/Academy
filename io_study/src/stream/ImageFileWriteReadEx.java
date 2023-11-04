package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageFileWriteReadEx {

	public static void main(String[] args) throws IOException {

		
		//읽을 이미지 파일 객체
		InputStream is = new FileInputStream("c:/ex/data/cat.jpg");
		
		//읽은 고양이 파일을 쓸 이미지 파일 객체
		OutputStream os = new FileOutputStream("c:/ex/data/cat_copy.jpg");
		
		//고양이 그림을 읽으면(바이트 형태) 임의의 크기의 바이트 배열의 공간에 넣어야 함.
		//임의의 바이트 배열(버퍼 공간 크기) 선언
		//고양이 이미지를 읽은 바이트 크기가 어떻게 될 지 모르므로 while로 뺑뺑이 겁~~~나게 많이
		byte buffer[] = new byte[1024];
		
		while(true) {
			int imgData = is.read(buffer);
			//입력 스트림에서 (프로그램이 읽기위해 바이트로 변환된 이미지의) 일부 바이트를 읽고 이를 버퍼 배열에 저장.
			System.out.println(imgData);
			if(imgData == -1) break;
			
			os.write(buffer, 0, imgData);
		}
	}

}
