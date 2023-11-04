package stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class CharInputWriteRead {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		
		try(Writer writer = new FileWriter("testEx.txt")) {
			writer.append(inputText);
			writer.flush();
		}catch(IOException e){
			System.out.println("입출력 에러!");
		}
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\io_study\\testEx.txt");
		
		while(true) {
			int i = fr.read();
			System.out.print((char)i);
			if(i == -1) break;
		}
	}

}
