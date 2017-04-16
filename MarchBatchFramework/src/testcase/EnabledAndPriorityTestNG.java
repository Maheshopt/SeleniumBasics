package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledAndPriorityTestNG {

 @Test(priority=1,enabled=false)
  public void tc001()
 {
	System.out.println("tc001"); 
	Reporter.log("Testcase tc001");
  }
 
 @Test(priority=0)
 public void tc002()
 {
	System.out.println("tc002"); 
	
	Reporter.log("Testcase tc002");
 }
 
 
}
