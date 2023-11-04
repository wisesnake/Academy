package json_ex;

import java.io.FileWriter;
import java.io.Writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJSONEx2 {

	public static void main(String[] args) throws Exception {
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("id", "hong");
		jsonObj.put("name", "홍길동");
		jsonObj.put("age", 25);
		jsonObj.put("student", true);

		
		
		System.out.println(jsonObj);

		Writer writer = new FileWriter("c:/temp/member.json");
		
		 JSONArray jsonArr = new JSONArray();
		
		 jsonArr.put("사과");
		 jsonArr.put("배");
		 jsonArr.put("샤인머스켓");
		 
		 System.out.println(jsonArr);

		 jsonObj.put("fruit", jsonArr);
		 
		 String json1 = jsonObj.toString();
		 System.out.println(jsonObj);
		 
		writer.write(json1);
		writer.close();
	}

}
