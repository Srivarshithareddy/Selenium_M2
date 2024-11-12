package Chap3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromExcel {

	public static void main(String[] args) throws FileNotFoundException {


		//Step 1: Convert physical file into java readable object
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		
		//Step 2: Create an instance of properties class
		Properties property=new Properties();
	
		//Step 3: Load all Key-value pairs from fis to property property. load(fis)://load internallyIcreate hashmap and segregate key and value pairs
		//Step 4: Read data from properties
		String browser=property.getProperty("browser");//we can only access with key that's wr
		System. out.println(browser);
        String time=property.getProperty("time");
		System.out. println(time);
		
		// conclusion what ever data in value you mention it will return in string
	}

}
