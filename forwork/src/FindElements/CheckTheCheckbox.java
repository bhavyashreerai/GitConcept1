package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheCheckbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/FetchAllLinks.html");
	    List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int Count = ele.size();
		System.out.println(Count);
		
		for(int i=0;i<Count;i++)
		{
			WebElement we=ele.get(i);
			Thread.sleep(1000);
			we.click();
		}
		
		for(int i=Count-1;i>=0;i--)
		{
			WebElement we=ele.get(i);
			Thread.sleep(1000);
			we.click();
		}
			
		}

}
