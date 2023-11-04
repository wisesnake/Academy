package iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) {
		
		try (InputStream is = new FileInputStream("text1.db")) {
			while(true) {
				int data = is.read();
				if(is.read() == -1) break;
				System.out.println(data);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
