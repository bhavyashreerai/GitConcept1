package HandlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
				
//		Actions act = new Actions(driver);
//		Thread.sleep(2000);
//		act.contextClick(ele).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_T);
		
		//holds the address of both parent and child
//		Set<String> addr = driver.getWindowHandles();
//		int count= addr.size();
//		System.out.println(count);
//		
//		//typecasting from set to arraylist
//	   ArrayList<String> l= new ArrayList<String>(addr);
//		int count2=l.size();
//		System.out.println(count2);
//		String s = l.get(1);
//		Thread.sleep(2000);
//		driver.switchTo().window(s);
//		

	}

}
