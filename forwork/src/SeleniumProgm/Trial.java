package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.youtube.com");
		d1.findElement(By.cssSelector("input[id='search']")).sendKeys("shirdi baba songs");
		d1.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		//d1.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		
		//d1.findElement(By.cssSelector("a[class='yt-simple-endpoint metadata-snippet-timestamp style-scope ytd-video-renderer']")).click();
		//d1.findElement(By.cssSelector("a[title='10 Sai Baba Bhajan |  Suresh Wadkar | Sai Baba Songs | Sai Baba Mantra | sai aashirwad']")).click();
		d1.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		//d1.findElement(By.cssSelector("yt-icon[id='inline-title-icon']")).click();
	}

}
