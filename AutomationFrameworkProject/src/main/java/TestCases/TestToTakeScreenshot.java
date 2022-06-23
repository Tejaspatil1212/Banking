package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestToTakeScreenshot
{
	ChromeDriver d;
	@BeforeClass
	public void StartTest()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome driver//chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.nopcommerce.com/");
		d.manage().window().maximize();
	}
	@Test(priority=1)
	public void FullPage() throws IOException
	{
		//full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\16 april auto soft\\SeleniumScripts\\AutomationFrameworkProject\\Screenshot\\homepage.png");
		FileUtils.copyFile(src, trg);
		*/
		
		//Screenshot of section
		/*WebElement Section=d.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=Section.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\\\16 april auto soft\\\\SeleniumScripts\\\\AutomationFrameworkProject\\\\Screenshot\\\\section.png");
		FileUtils.copyFile(src, trg);
		*/
		
		//Screenshot of element of page
		WebElement ele=d.findElement(By.xpath("//a[@class='ico-register']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\\\\\\\16 april auto soft\\\\\\\\SeleniumScripts\\\\\\\\AutomationFrameworkProject\\\\\\\\Screenshot\\\\\\\\register.png");
		FileUtils.copyFile(src, trg);
	}
	
	@AfterClass
	public void StopTest()
	{
		d.close();
	}
}
