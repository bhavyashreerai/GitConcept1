package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForYouTube {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sai baba abhishekam song");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='search-icon-legacy']")));
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		ele1.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//yt-formatted-string[text() ='Shirdi Sai Full Songs HD - Amara Raama Sumaaramacheri Song - Nagarjuna']")));
		WebElement ele2 = driver.findElement(By.xpath("//yt-formatted-string[text() ='Shirdi Sai Full Songs HD - Amara Raama Sumaaramacheri Song - Nagarjuna']"));
		ele2.click();
		
		Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[@id ='button' and @class='style-scope yt-icon-button']")).click();
        driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();

	}


}
