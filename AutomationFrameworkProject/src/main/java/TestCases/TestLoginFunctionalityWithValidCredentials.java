package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class TestLoginFunctionalityWithValidCredentials 
{

	/*
	 * 1. Open Browser
	 * 2. Open URL "https://opensource-demo.orangehrmlive.com/"
	 * 3. Enter "Admin" in UserName field
	 * 4. Enter "admin123" in Password field
	 * 5. Click on Login button
	 * 6. Check that Dashboard page is opened
	 */
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
	public void TestLoginWithValidCredentials()
	{
		/*
		WebElement UserNameField=D.findElement(By.name("txtUsername"));
		UserNameField.sendKeys("Admin");
		
		WebElement PasswordField=D.findElement(By.name("txtPassword"));
		PasswordField.sendKeys("admin123");
		
		
		WebElement LoginButton=D.findElement(By.id("btnLogin"));
		LoginButton.click();
		*/
		loginpage.DoLogin("Admin", "admin123");
		boolean IsLoginWorked=loginpage.IsDashboardPageOpened();
		Assert.assertEquals(IsLoginWorked, true,"Login does not work after providing valid credentials");
	}

}

