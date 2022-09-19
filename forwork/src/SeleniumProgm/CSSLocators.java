package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

		public static void main(String[] args) 
		{
			String key= "webdriver.chrome.driver";
			String value="./Softwa/chromedriver.exe";
			
			System.setProperty(key, value);
			
			WebDriver d1 = new ChromeDriver();
			d1.get("https://www.youtube.com");
			d1.findElement(By.cssSelector("input[id='search']")).sendKeys("om sai namo namaha");
			d1.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
			//d1.findElement(By.cssSelector("a[title='Om Sai Namo Namaha, Shree Sai Namo Namaha by Suresh Wadkar - Sai Mantra - Sai Baba Songs']")).click();
			d1.findElement(By.cssSelector("h3[class='title-and-badge style-scope ytd-video-renderer']")).click();
		}

	}
