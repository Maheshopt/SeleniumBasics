package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.PropertiesFile;
import common.WebdriverGenerics;
import testRunner.TestNGBaseRunner;

public class Testcase001 extends TestNGBaseRunner{
  
	public PropertiesFile prop =null;
	
	@BeforeClass
	public void beforeclass() throws Exception
	{
		 prop = new PropertiesFile(".\\src\\ObjectRepo\\Testcase001.properties");
		 // Set excel 
		 
	}
	
  @Test
  public void test1()
  {
	  wg.enterTextByID(prop.getProp("key"), "balallalal");
	  wg.clickByID(prop.getProp("keys"));
	  System.out.println(prop.getProp("Username"));
	  
  }
  
  @Test
  public void test2()
  {
	  System.out.println(prop.getProp("Username"));
  }
}
