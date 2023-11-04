package iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) {

		try (InputStream is = new FileInputStream("c:/ex/text1.db")) {

			// 읽을 때 버퍼를 이용, 버퍼릥 크기를 바이트 배여롤 일정하게 지정.
			byte data[] = new byte[100];

			while (true) {
				int num = is.read(data);

				if(num == -1) {
					break;
				}
				

				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
