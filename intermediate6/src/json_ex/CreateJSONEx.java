package json_ex;

import java.io.FileWriter;
import java.io.Writer;

import org.json.JSONObject;

public class CreateJSONEx {

	public static void main(String[] args) throws Exception {
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("id", "hong");
		jsonObj.put("name", "홍길동");
		jsonObj.put("age", 25);
		jsonObj.put("student", true);

		String json = jsonObj.toString();
		
		
		System.out.println(jsonObj);

		Writer writer = new FileWriter("c:/temp/member.json");
		
		
		writer.write(json);
		writer.close();
	}

}
