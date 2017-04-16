package testcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGOrderOfExecution {

	boolean status;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Am BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Am afterSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Am BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Am AfterTest");
	}

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Am BeforeClass");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("Am AfterClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Am BeforeMethod");
		status =true;
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Am AfterMethod");
		if(status==true)
		{
			System.out.println("Aftermethod called and Testcase passed");
		}else
		{
			System.out.println("Aftermethod called and Testcase Failed");
		}
	}
	
	
	@Test(priority=4)
	public void test_1()
	{
		System.out.println("am test_1");
		if(10==10)
		{
			System.out.println("Testcase passed");
		}else
		{
			System.out.println("Testcase Failed");
			status=false;
			Assert.fail();
		}
	}

	@Test(enabled=true)
	public void test_2()
	{
		System.out.println("am test_2");
		
		if(10==100)
		{
			System.out.println("Testcase passed");
		}else
		{
			System.out.println("Testcase Failed");
			status=false;
			Assert.fail();
		}
		System.out.println("Balamurugan Assert checkpoint");
	}
	@Test( dependsOnMethods="test_2")
	public void test_3()
	{
		System.out.println("am test_3");
	}
	
	@Test(priority=1)
	public void test_4()
	{
		System.out.println("am test_4");
	}

}
