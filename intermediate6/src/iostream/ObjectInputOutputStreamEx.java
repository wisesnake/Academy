package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		
		OutputStream os = new FileOutputStream("c:/temp/obj1.dat");

		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//보내고자 하는 객체 생성
		
		Member stu = new Member("hong1","홍길동");
		
		oos.writeObject(stu);
		os.close();
		oos.close();
		
		InputStream is = new FileInputStream("c:/temp/obj1.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Member m1 = (Member)ois.readObject();
		
		is.close();
		ois.close();
		
		System.out.println(m1);
		
		
	}
}
