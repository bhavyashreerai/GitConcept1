package HandlingDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiondropdown {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium videos");
		List<WebElement> suges = driver.findElements(By.xpath("//li[@class='sa_sg']//span//strong"));
		int count = suges.size();
		System.out.println(count);
		
		for( WebElement ele:suges)
		{
			String text = ele.getText();
			System.out.println(text);
			if(text.equals("selenium training videos"))
			{
				
				ele.click();
				break;
			}
				
		}
		
	}

}
