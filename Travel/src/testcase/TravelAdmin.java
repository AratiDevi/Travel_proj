package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonfunction.RW;

public class TravelAdmin extends RW {
	
public static WebDriver driver;
	
	public void Travel(WebDriver driver1) throws Exception 
	
	{
		WebDriver driver= driver1;
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
		WebElement TravelMenu= driver.findElement(By.linkText("Travel"));   //TravelMenu
		
        action.moveToElement(TravelMenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement AdminSubmenu=driver.findElement(By.xpath(".//*[@id='nav']/li[5]/ul/li[1]/a/span"));    // Admin
		
		action.moveToElement(AdminSubmenu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Travel Qtn UserAssignment")).click();
		
		Thread.sleep(1000);
		
	}
	
	public void TravelQtnUserAssignmentg(WebDriver driver1) throws Exception

	{
		WebDriver driver = driver1;
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstUser_61");   // Deepak
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstUser_191");  // Snigdha
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnMoveRight");  // Arrow mark
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","DEEPAKKU");  // DEEPAKKU

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","Snigdha");    // Snigdha

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_chkLstQtnUser_6");   //click
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_chkLstQtnUser_16");   //click
		
        Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnMoveLeft");   //Back Arrow
		
        Thread.sleep(1000);
		
        click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","DEEPAKKU");  // DEEPAKKU

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnRefresh");   //Refresh
		
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtQtnUserListSearch","Snigdha");    // Snigdha

		Thread.sleep(1000);
		
		click_element(driver,"id", "ctl00_MainContent_btnQtnUserFilter");  // Search
		
		Thread.sleep(1000);
		
		
}
	
	
	
}