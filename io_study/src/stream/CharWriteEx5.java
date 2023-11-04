package stream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class CharWriteEx5 {

	public static void main(String[] args) throws IOException {

		// close를 안쓰고 하는 방식(생략이 가능)
		// 가능한 이유는 리소스를 갖고 try with resource문이 있음.
		// try(){
		// }catch {
		//
		// }

		try(Writer writer = new FileWriter("text8.txt");) {
			
			writer.append("A");
			writer.append("B");
			writer.append("C");
			writer.append("D");
			writer.flush();
//			writer.close();
			
		} catch (IOException e) {
			System.out.println("입출력 관련 예외 발생");
		}
//		Writer writer = new FileWriter("text5.txt");
//		try (writer) {
//
//			writer.append("하하하핳핳핳하하하하하ㅏ하하하하하하하하하하하하하하하하");
//			writer.flush();
////			writer.close();
//
//		} catch (Exception e) {
//			System.out.println("입출력 관련 예외 발생");
//		}
		
		System.out.println("---------------------");
	
		InputStream is = new FileInputStream("C:/Users/Administrator/eclipse-workspace/io_study/text8.txt");
		//입력스트림객체 만들기.
		
		while(true) {
			int read = is.read();
			System.out.println((char)read);
			if(read == -1) {
				break;
			}
		}
	}

}
