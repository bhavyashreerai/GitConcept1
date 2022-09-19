package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitForFacebook {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/Chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("log in"));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("bhavyashree198@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavya@123");
		driver.findElement(By.name("login")).click();
		
		
		//wait.until(ExpectedConditions.titleContains("Facebook"));
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		String t=driver.getTitle();
		System.out.println(t);
		
		
		
		
		
	}

}
