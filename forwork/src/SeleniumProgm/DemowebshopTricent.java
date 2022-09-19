package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopTricent {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/books");
		Thread.sleep(2000);
		driver.findElement(By.xpath( "//a[.='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath( "//a[.='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath( "//a/span[contains(.,'Shopping cart')]")).click();
		//driver.findElement(By.xpath( "//span[@class='cart-label']")).click();
		//Thread.sleep(2000);
	}

}
