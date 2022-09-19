package train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwa/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.className("VJZDxU")).sendKeys("9148848682");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Amith@12345");
		Thread.sleep(2000);
		//driver.findElement(By.("text")).sendKeys("TCL 4k UD");
		//driver.findElement(By.className("VJZDxU")).sendKeys("aaaaaa");
		//driver.findElement(By.tagName("autocomplete")).sendKeys("asd");
		
		driver.findElement(By.xpath("//button[. = 'Login']")).click();
		
		
		//driver.findElement(By.className("1fqY3")).sendKeys("amittt");
		//driver.findElement(By.id("container")).sendKeys("Amithhh");
		
	}

}

