package ActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMinimize_Maximize_closeBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException
	{

		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(1000);
		
		//minimize browser
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_N);
		
		//maximize browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//close browser
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_C);
		
		
	}

}
