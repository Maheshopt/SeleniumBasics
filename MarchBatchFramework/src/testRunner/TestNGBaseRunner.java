package testRunner;

import org.testng.annotations.BeforeTest;

import common.WebdriverGenerics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestNGBaseRunner 
{

	public WebdriverGenerics wg;
	public boolean testStatus;
	
  @BeforeTest
  public void beforeTest()
  {
	  wg= new WebdriverGenerics();
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  wg.driver=new ChromeDriver();
	  wg.driver.get("https://facebook.com/");
  }

  @AfterTest
  public void afterTest()
  {
	 wg.driver.close(); 
  }

  @BeforeMethod
  public void beforeMethod()
  {
	 System.out.println("beformethod"); 
  }

  @AfterMethod
  public void afterMethod()
  {
	if(testStatus==true)
	{
		// update in excel as pass
	}  else
	{
		// updated in excel as faill
	}
  }
  
  
  
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("BeforSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("AfterSuite");
  }

}
