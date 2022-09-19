package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingForEach_GetAllTheAttibutevaluesOFLinks {

	public static void main(String[] args)
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
	    List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int Count = ele.size();
		System.out.println(Count);
		
		for(WebElement e1:ele)
		{
			String attr = e1.getAttribute("href");
			System.out.println(attr);
		}

	}

}
