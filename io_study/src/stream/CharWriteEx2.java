package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteEx2 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("text3.txt");
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			writer.write(a);
			writer.write(b);
			writer.write(c);
			
			char arr[] = {'d', 'e', 'f'};
			
			writer.write(arr);
			writer.write("JKL");
			writer.flush();
			//출력을 정상적으로 끝마치려면 (txt파일에 상기 텍스트를 입력하여 출력시키려면) flush가 필수.
//			writer.close();
			
			
		} catch (IOException e) {
			System.out.println("입출력 관련 예외 발생");
		}
		
	}

}
