package HandlingPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.gecko.driver";
		String value="./Softwa/geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("cust1");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	   Alert ele = driver.switchTo().alert();
	   String t = ele.getText();
	   System.out.println(t);
	   //ele.accept();
	   ele.dismiss();
		

	}

}
