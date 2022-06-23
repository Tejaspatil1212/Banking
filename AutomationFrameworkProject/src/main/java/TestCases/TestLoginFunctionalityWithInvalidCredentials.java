package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class TestLoginFunctionalityWithInvalidCredentials 
{
	LoginPage loginpage;
	@BeforeClass
	public void StartTest()
	{
		/*
		 *  System.setProperty("webdriver.chrome.driver", "D:\\VibrantMindsBatch3536\\Drivers\\chromedriver.exe");
			D=new ChromeDriver();
			D.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 */
		loginpage=new LoginPage();
	}

	@Test
	public void TestLoginWithInvalidCredentials()
	{
		/*
		WebElement UserNameField=D.findElement(By.name("txtUsername"));
		UserNameField.sendKeys("Pranoday");
		
		WebElement PasswordField=D.findElement(By.name("txtPassword"));
		PasswordField.sendKeys("Dingare");
		
		
		WebElement LoginButton=D.findElement(By.id("btnLogin"));
		LoginButton.click();
		*/
		loginpage.DoLogin("Pranoday", "Dingare");
		String LoginError=loginpage.GetErrorMessage();
		Assert.assertEquals(LoginError, "Invalid credentials","Login functionality does not work if Invalid credentials are entered");
	}


}
