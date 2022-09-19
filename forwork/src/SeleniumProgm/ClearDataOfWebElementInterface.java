package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataOfWebElementInterface
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/clear.html");
		
		Dimension d1= new Dimension(100,200);
		driver.manage().window().setSize(d1);
			
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		ele.clear();
	 }

}
