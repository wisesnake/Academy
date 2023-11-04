package iostream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx {

	/*
	 * File 클래스
	 *java.io.fiel 패키지에 속함. 
	 * 단일 파일 또는 디렉터리를 나타내는데 사용
	 * 파일 또는 디렉터리를 생성 삭제 이름변경 및 경로정보 가져오기와 같은 기본적인 파일 조작 작업 수행
	 * 파일 및 디렉터리 조작 메서드는 동기적으로 동작하므로 i/o 작업을 수행할 때 블로킹 될 수 있습니당.
	 */		
	
	
	/*Files 클래스
	 * 
	 * java.nio.file.files 패키지에 속함
	 * 파일 시스템 조작을 보다 강력하고 유연하게 다룰 수 있도록 설계
	 * 파일 복사 이동 삭제 읽기 쓰기 및 디렉터리 작업과 같은 고급 파일 조작 지원
	 * Files클래스의 매서드는 주료 NIO패키지와 관련이 있으며, 비동기,동기적인 작업 수행 가능함.
	 * 		
	 */	
	public static void main(String[] args) throws IOException {
		String data = ""
				+ "id: winter\n"
				+ "email: winter@mycompany.com\n"
				+ "tel: 010-1234-5678";
		
		Path path = Paths.get("c:/temp/user.txt");
		
		Files.writeString(path, data, Charset.forName("utf-8"));

		System.out.println(Files.probeContentType(path));
		System.out.println(Files.size(path)+"Bytes");
		
		
		
	}

}
