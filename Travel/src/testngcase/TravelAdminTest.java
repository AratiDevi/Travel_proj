package testngcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testcase.TravelAdmin;

public class TravelAdminTest extends DriverPass{
	
	TravelAdmin T=new TravelAdmin();
  @Test(priority=0)
  public void Travel() throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

	  T.Travel(driver);
  }
  
  @Test(priority=1)
  public void TravelQtnUserAssignmentg() throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);

	  T.TravelQtnUserAssignmentg(driver);
  }
  
  
}
