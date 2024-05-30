package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest {
	@Test (dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata")
	
	public static void LoginTest(String username, String password ) throws InterruptedException
	{
		Thread.sleep(2000);     
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		Thread.sleep(2000);    
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(2000);    
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);    
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(2000);    
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(5000); 
	

	  
	}
	
	/*@DataProvider(name="testdata")
	public Object[] [] tData()
	
	{
		return new Object[][]
		{
			{"jigna.qaontop@gmal.com", "Jigna@1505"},
			{"jigna.qaontop@gmail.com", "Jigna@155"},
			{"jigna.qaontop@gmal.com", "Jigna@155"},
			{"jigna.qaontop@gmail.com", "Jigna@1505"}
			
		};
	}*/
	

}
