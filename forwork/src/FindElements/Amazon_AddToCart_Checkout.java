package FindElements;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddToCart_Checkout {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys("Tecno spark");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		//driver.findElement(By.xpath("(//span[.='Ships to India'])[1]")).click();
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Tecno spark");
//		Thread.sleep(2000);
		//ele.sendKeys("Tecno spark");
		//ele.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
//		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		//driver.findElement(By.xpath("(//span[.='Ships to India'])[1]")).click();
		
	
	}

}
