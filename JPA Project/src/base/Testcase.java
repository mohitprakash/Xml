package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testcase 
{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Jar files\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
	}
	
	@Test
	public void testCase() throws InterruptedException
	{
		driver.findElement(By.className("gsfi")).sendKeys("Enter");
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
	}

}
