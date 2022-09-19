package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator 
{

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/TagnameLocator.html");
		d1.findElement(By.tagName("a")).click();
		

	}

}
