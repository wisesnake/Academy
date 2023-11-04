package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteEx3 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("text6.txt");
			writer.write("nice");
			writer.write("\n");
			writer.write("hi");
			
			writer.flush();
			
		} catch (IOException e) {
			System.out.println("입출력 관련 예외 발생");
		}
		
	}

}
