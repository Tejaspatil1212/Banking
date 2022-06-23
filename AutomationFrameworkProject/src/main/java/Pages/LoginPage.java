package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	ChromeDriver D;
	public LoginPage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation testing\\Chrome driver\\chromedriver.exe");
		D=new ChromeDriver();
		D.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
							   //Pranoday		//Dingare	
	public void DoLogin(String UserName,String Password)
	{
		//EnterUserName
		//EnterPassword
		//Click on Login button
		EnterUserName(UserName);
		EnterPassword(Password);
		ClickLoginButton();
	}
									 //Pranoday 	
	public void EnterUserName(String UserName)
	{
		WebElement UserNameField=D.findElement(By.name("txtUsername"));
		UserNameField.sendKeys(UserName);
		
	}
									//Dingare
	public void EnterPassword(String Pass)
	{
		WebElement PasswordField=D.findElement(By.name("txtPassword"));
		PasswordField.sendKeys(Pass);
			
	}
	public void ClickLoginButton()
	{
		WebElement LoginButton=D.findElement(By.id("btnLogin"));
		LoginButton.click();
	}

	public boolean IsDashboardPageOpened()
	{
		boolean AmIOnDashboardPage=false;
		List<WebElement>Links=D.findElements(By.id("welcome"));
		int size=Links.size();
		if(size>0)
			AmIOnDashboardPage=true;
		else
			AmIOnDashboardPage=false;
		return AmIOnDashboardPage;
	}

	public String GetErrorMessage()
	{
		String LoginError="";
		WebElement ErrorElement=D.findElement(By.id("spanMessage"));
		LoginError=ErrorElement.getText();
		return LoginError;
	}
}
