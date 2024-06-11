package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FetchingDataFromProperty {

	public static void main(String[] args) throws Throwable {

		// 1) Create a fileinputstream obj
		FileInputStream fis = new FileInputStream("./src/test/resources/prop.properties");
		
		//2) Create a property file obj
		Properties p = new Properties();
		
		//3) Load file
		p.load(fis);
		
		//4) Fetch the data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("dob"));



	}

}
