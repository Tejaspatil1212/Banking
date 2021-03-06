package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginFunctionalityWithoutFramework 
{
	ChromeDriver D;
	@BeforeClass
	public void StartTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation testing\\Chrome driver\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	}
	@Test
	public void CheckIfElementIsPresent()
	{
		/*
		 * When we check that if an element is shown or not on webpage, then we are checking
		 * display of a control. In this case control is present in the browser but
		 * it only gets hidde/shown from page.
		 * To check this we identify the element and call isDisplayed() on it and then
		 * checks if return value is true or false
		 * 
		 * If we want to check if a particular element is present or not in the browser
		 * then we need to check its existence.
		 */
	
			WebElement UserNameField=D.findElement(By.name("txtUsername"));
			UserNameField.sendKeys("Admin");
			
			WebElement PasswordField=D.findElement(By.name("txtPassword"));
			PasswordField.sendKeys("admin123");
			
			
			WebElement LoginButton=D.findElement(By.id("btnLogin"));
			LoginButton.click();
			/*
			 * findElements returns a group of elements
			 */
			List<WebElement>Links=D.findElements(By.id("welcome"));
			int size=Links.size();
			System.out.println(size);
			Assert.assertEquals(size, 1, "Login functionality did not work after entering valid credentials");
	}

	
}
