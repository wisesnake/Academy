package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteEx {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("text2.txt");
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			writer.write(a);
			writer.write(b);
			writer.write(c);
			
			char arr[] = {'d', 'e', 'f'};
			
			writer.write(arr);
			writer.flush();
			writer.close();
			
			
		} catch (IOException e) {
			System.out.println("입출력 관련 예외 발생");
		}
		
	}

}
