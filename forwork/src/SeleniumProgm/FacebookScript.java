package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookScript {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.gecko.driver";
		String value="./Softwa/geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("bhavyashree198@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavya@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Facebook']/../following-sibling::div[1]//input"));
		Thread.sleep(2000);
		ele.sendKeys("sri sai baba temple malleswaram");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message']/../../preceding-sibling::div[1]/a")).click();
		
	    	
	}

}
