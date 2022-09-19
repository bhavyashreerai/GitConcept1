package SeleniumProgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class XpathFacebookAndYahoo {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhavyashree1509@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Bhavya@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='ysignin']")).click();//signin
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhavya1235@yahoo.com");//username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("9964972168");//password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		//------------------------composing-----------------------------------------
		driver.findElement(By.xpath("//a[@id='ymail']")).click();//mail
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();//compose
		driver.findElement(By.xpath("//input[@ id ='message-to-field']")).sendKeys("bhavya1235@gmail.com");//To
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Test case Review");//Subject
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("This is my Test case please review");//body
		Thread.sleep(2000);
		//---------------------------attaching files-----------------------------
		 driver.findElement(By.xpath("//button[@title='Attach files']")).click();
		Thread.sleep(3000);
			
		WebElement ele2 = driver.findElement(By.xpath("//li[@name='attach-from-computer']"));
		Thread.sleep(2000);
		ele2.sendKeys("C:\\Users\\Amith Shetty\\OneDrive\\Desktop\\Bhavya Shree_Resume.pdf");
		Thread.sleep(2000);
		//-------------------send--------------------------
//		driver.findElement(By.xpath("//button[@title='Send this email']")).click();//send
//	    WebElement ele = driver.findElement(By.xpath("//span[.='Bhavya']"));
//	
//	    Actions act = new Actions(driver);
//	    act.moveToElement(ele).perform();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[.='Sign out']")).click();
	    
	 
	
	}

}
