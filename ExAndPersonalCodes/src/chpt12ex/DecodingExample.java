package chpt12ex;

import java.io.UnsupportedEncodingException;

public class DecodingExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {-20,-107,-120,-21,-123,-107};
		String str = new String(bytes);
		//new String(bytes,"UTF-8"); 와 같음.
		System.out.println("str : " + str);
	}

}
