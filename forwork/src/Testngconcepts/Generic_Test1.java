package Testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test1 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplictn()
	{
		System.setProperty("webdriver.chrome.driver","./Softwa/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	
	public void closeApplictn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
