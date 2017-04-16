package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebdriverGenerics {

	public WebDriver driver = null;
	
	public void enterTextByID(String id, String Value)
	{
		driver.findElement(By.id(id)).sendKeys(Value);
		Reporter.log("enterTextByID :: " +Value+" entered in Locator id:: " +id);
		System.out.println("enterTextByID :: " +Value+" entered in Locator id:: " +id);
	}
	
	public void clickByID(String id)
	{
		driver.findElement(By.id(id)).click();
	}

	// Added by bala
	public void clickByName(String name)
	{
		driver.findElement(By.name(name)).click();
	}

}
