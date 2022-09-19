package SeleniumProgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String att = ele.getAttribute("href");
		System.out.println(att);
		
		List<WebElement> eles = driver.findElements(By.xpath("//a|//img"));
		int count = eles.size();
		System.out.println(count);
	}

}
