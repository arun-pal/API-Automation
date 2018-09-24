package read_Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	private static Properties properties;

	static{
		 File file = new File("/home/arun/eclipse1/workspace/Test_API/resources/API.properties");
		                       		  
			FileInputStream fileInput = null;
			try 
			{
				fileInput = new FileInputStream(file);
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			properties = new Properties();
			
			//load properties file
			try 
			{
				properties.load(fileInput);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
	
	public static String getProperty(String property)
	{		
		if(property != null)
		{
			return properties.getProperty(property);	
		}
		return null;
	}
}
