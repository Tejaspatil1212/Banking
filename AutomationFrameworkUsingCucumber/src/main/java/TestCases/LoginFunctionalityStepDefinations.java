package TestCases;

import org.testng.Assert;

import Pages.LoginPage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoginFunctionalityStepDefinations 
{
	LoginPage loginpage;
	@Given("User is on Login page")
	public void GotoLoginPage()
	{
		loginpage=new LoginPage();
	}
	@When("User enters \"Admin\" in UserName field")
	public void EnterUserName() throws InterruptedException
	{
		Thread.sleep(5000);
		loginpage.EnterUserName("Admin");
	}
	@When("User enters \"admin123\" in Password field")
	public void EnterPassword() throws InterruptedException
	{
		Thread.sleep(5000);
		loginpage.EnterPassword("admin123");
	}
	@When("User clicks on Login button")
	public void ClickLoginButton() throws InterruptedException
	{
		Thread.sleep(5000);
		loginpage.ClickLoginButton();
	}
	@Then("User should be on Dashboard page")
	public void CheckIfDashboardPageOpens()
	{
		boolean OnDashboard=loginpage.IsDashboardPageOpened();
		Assert.assertEquals(OnDashboard, true,"Login does not work if valid credentials are entered");
	}
	
}
