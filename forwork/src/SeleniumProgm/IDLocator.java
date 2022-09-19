package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/TagnameLocator.html");
		Thread.sleep(2000);
		d1.findElement(By.id("a1")).click();

	}

}
