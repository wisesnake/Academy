package stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteAndReadEx {

	public static void main(String[] args) throws IOException{
		try(Writer writer = new FileWriter("testEx.txt")) {
			writer.append("안뇽 만나서 반가워!");
			writer.flush();
		}catch(IOException e){
			System.out.println("입출력 에러!");
		}
		
//		InputStream is = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\io_study\\testEx.txt");
//		
//		while(true) {
//			int i = is.read();
//			System.out.print((char)i);
//			if(i == -1) break;
//		}
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\io_study\\testEx.txt");
		
		while(true) {
			int i = fr.read();
			System.out.print((char)i);
			if(i == -1) break;
		}
	}

}
