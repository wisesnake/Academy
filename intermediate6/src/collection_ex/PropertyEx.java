package collection_ex;

import java.io.IOException;
import java.util.Properties;

public class PropertyEx {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		properties.load(PropertyEx.class.getResourceAsStream("database.properties"));
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(admin);
	}

}
