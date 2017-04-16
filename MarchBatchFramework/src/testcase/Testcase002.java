package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.PropertiesFile;
import testRunner.TestNGBaseRunner;

public class Testcase002 extends TestNGBaseRunner
{
public PropertiesFile prop =null;
	
	@BeforeClass
	public void beforeclass() throws Exception
	{
		 prop = new PropertiesFile(".\\src\\ObjectRepo\\Testcase001.properties");
		 // Set excel 
	}
	
	@Test
	public void display()
	{
		
	}
}
