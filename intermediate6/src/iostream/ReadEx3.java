package iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadEx3 {
	public static void main(String[] args) {

		try {
			Reader reader = new FileReader("c:/temp/test.txt");
			while (true) {
				int num = reader.read();

				if (num == -1)
					break;
				System.out.println((char)num);
			}
			char buffer[] = new char[100];
			
			while(true) {
				int num2 = reader.read(buffer);
				if(num2 == -1) break;
				
				for(int i = 0; i < num2 ; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
