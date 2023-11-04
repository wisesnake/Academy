package iostream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("c:/temp/testFolder");
		System.out.println(dir.mkdir());

		if (dir.exists()) {
			if (dir.isDirectory()) {
				File file1 = new File("c:/temp/testFolder/testFile1.txt");
				file1.createNewFile();
				System.out.println("파일생성상태 : "+file1.exists());
			}
		}

	}

}
