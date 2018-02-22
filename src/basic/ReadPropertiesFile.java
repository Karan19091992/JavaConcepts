package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\Karansinh\\git\\JavaConcepts\\src\\inputdata.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println("get FileData : " + prop.getProperty("name"));
		System.out.println("get FileData : " + prop.getProperty("age"));
		System.out.println("get FileData : " + prop.getProperty("counry"));

	}

}
