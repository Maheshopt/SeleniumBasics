package common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile
{
	public Properties prop = new Properties();
	
	public PropertiesFile(String getpropertyFilePath) throws Exception  
	{
		File file = new File(getpropertyFilePath);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	}	

	public String getProp(String key)
	{
		String objValue =prop.getProperty(key);
		return objValue;		
	}
	
}
