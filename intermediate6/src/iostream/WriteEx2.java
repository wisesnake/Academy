package iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx2 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("c:/temp/test.txt");
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
		
		char[] arr = { 'C', 'D', 'D'};
		writer.write(arr);
		
		writer.write("FGH");
		writer.flush();
		writer.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
