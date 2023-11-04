package json_ex;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONObject;

public class ParseJSONEx {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("c:/temp/member.json");
		BufferedReader br = new BufferedReader(fr);
//		int num = fr.read();

//		byte[] buffer = new byte[1024];

//		while(true) {
//			if(fr.read() == -1) {
//				break;
//			}
//			int num = fr.read();
//			System.out.println((char)num);
//			
//		}

		String json = br.readLine();
		System.out.println(json);

		JSONObject jsonObj = new JSONObject(json);
		
		String id = (String)jsonObj.get("id");
		String name = (String)jsonObj.get("name");
		int age = (int)jsonObj.get("age");
		Boolean student = (Boolean)jsonObj.get("student");

		
		
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(student);
		
		
		System.out.println("=====");
		System.out.println(jsonObj.get("fruit").toString());
	}

}
