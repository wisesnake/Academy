package iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStreamEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/Temp/pri.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(4.5);
		dos.writeInt(4);
		
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:/Temp/pri.db");
		DataInputStream dis = new DataInputStream(fis);
		
		Double d = dis.readDouble();
		System.out.println(d);
		
		String name = dis.readUTF();
		System.out.println(name);
		
		int num = dis.readInt();
		System.out.println(num);
		
	}

}
