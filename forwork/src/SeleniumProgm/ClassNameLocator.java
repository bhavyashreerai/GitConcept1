package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver d2= new ChromeDriver();
		d2.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/TagnameLocator.html");
		Thread.sleep(2000);
		d2.findElement(By.className("c1")).click();
	}

}
