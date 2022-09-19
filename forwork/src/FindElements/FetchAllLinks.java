package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLinks {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//count of all links
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int CountLinks = ele.size();
		System.out.println(CountLinks);
		
		//count of all images
		List<WebElement> ele1 = driver.findElements(By.xpath("//img"));
		int CountImg = ele1.size();
		System.out.println(CountImg);
		
		//count of all links and images
		List<WebElement> ele3 = driver.findElements(By.xpath("//a|//img"));
		int CountLinksImg = ele3.size();
		System.out.println(CountLinksImg);
		
		
	}
}