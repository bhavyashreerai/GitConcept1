package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataUsingKeyboard
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElements/clear.html");
		WebElement ele = driver.findElement(By.id("a1"));
		ele.sendKeys((Keys.CONTROL+"a"));
		ele.sendKeys((Keys.DELETE));
		//ele.sendKeys((Keys.ENTER));

	}

}
