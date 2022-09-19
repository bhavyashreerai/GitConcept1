package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LikeYoutubeVideoUsingXpath
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sai baba abhishekam song");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text() ='Shirdi Sai Full Songs HD - Amara Raama Sumaaramacheri Song - Nagarjuna']")).click();
		
		
		Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[@id ='button' and @class='style-scope yt-icon-button']")).click();
        driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();

	}

}
