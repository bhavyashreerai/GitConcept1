package SeleniumProgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPrg 
{

	public static void main(String[] args)
	{
		//String key= "webdriver.chrome.driver";
		//String value="./Softwa/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", "./Softwa/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
