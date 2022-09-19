package HandlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_popup {

	public static void main(String[] args) throws InterruptedException
	{

		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Tue, Aug 16'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='18'])[1]")).click();
		
	}

}
