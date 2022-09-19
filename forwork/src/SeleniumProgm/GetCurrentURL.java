package SeleniumProgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		String url = d.getCurrentUrl();
		System.out.println(url);
		

	}

}
