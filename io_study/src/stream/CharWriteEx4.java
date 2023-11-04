package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteEx4 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("text3.txt");
			writer.append("PQR");
			writer.write("--------------------");
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			System.out.println("입출력 관련 예외 발생");
		}
		
	}

}
