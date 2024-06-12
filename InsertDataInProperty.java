package ddt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertDataInProperty {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		p.setProperty("url", "https://demowebshop.tricentis.com/");
		p.setProperty("name", "aashi");
		p.setProperty("gender", "female");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/prop2.properties");
		p.store(fos, "prop2");
	}

}
