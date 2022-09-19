package ActionsClass;

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

public class RobotClass_RightClick_OpenNewWindow_InNewTab_CtrlSwitchOverToNewTab {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
			//right click	
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		
		//after right click, since we cannot inspect element for open in new tab 
		//using robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_T);
		
		//holds the address of both parent and child
		Set<String> addr = driver.getWindowHandles();
		int count= addr.size();
		System.out.println(count);
		
		//typecasting from set to arraylist
		//ctrl will be in first tab, to switch control from first tab to next tab
	   ArrayList<String> l= new ArrayList<String>(addr);
		int count2=l.size();
		System.out.println(count2);
		
		String s = l.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(s);
		

	}

}
