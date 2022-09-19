package JavaScript_Executor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

public class UsingScrollbarInAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
		}
		
		for(int j=0;j<3;j++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");
		}
		
		//inspecting facebook element
		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		Thread.sleep(2000);
		
//		//fetching location of facebook element
		Point p = ele.getLocation();
		
		System.out.println(p);
		Thread.sleep(2000);
		int x1 = p.getX();
		Thread.sleep(2000);
		int y1= p.getY();
	
		//scroll based
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy("+x1+", "+y1+")");
		js.executeScript("window.scrollBy(x1,y1)");
		
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		//ele.click();
		
		
	}

}
