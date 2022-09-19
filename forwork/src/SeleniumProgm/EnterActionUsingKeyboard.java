package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterActionUsingKeyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("bhavyashree198@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavya@123");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("login"));
		ele.sendKeys(Keys.ENTER);

	}

}
