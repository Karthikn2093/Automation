package week7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/main/resources/NewConfig.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);

	}

}
