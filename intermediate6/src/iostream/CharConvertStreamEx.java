package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharConvertStreamEx {

	static void write(String str) {
		try {
			OutputStream ous = new FileOutputStream("c:/temp/test2.txt");
			
			
			//보조스트림 생성
			Writer writer = new OutputStreamWriter(ous);
			writer.write(str);
			writer.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static String read() throws Exception{
		InputStream is = new FileInputStream("c:/Temp/test2.txt");
		
		Reader reader = new InputStreamReader(is);
		
		char data[] = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data,0,num);
		return str;
	}
	
	
	public static void main(String[] args) {
		System.out.println("문자 변환 스트림 사용");
		
		try {
			write("hi nice");
			String str = read();
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
