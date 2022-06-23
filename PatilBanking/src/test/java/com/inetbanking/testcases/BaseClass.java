package com.inetbanking.testcases;






import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr416218";
	public String password="qAgEnat";
	
	public static WebDriver driver;
	

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	
		Logger logger=Logger.getLogger(username);
		PropertyConfigurator.;
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
