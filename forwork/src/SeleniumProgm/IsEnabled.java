package SeleniumProgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		//String key= "webdriver.chrome.driver";
		//String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/IsEnabled.html");
		Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.id("a1"));
	    
	    boolean e= ele.isEnabled();
	    
	    if(e)
	    {
	    	System.out.println("element is enabled");
	    }
	    else
	    	System.out.println("element is disabled");
	    
	   boolean e2 = ele.isDisplayed();
	   
	   if(e2)
	   {
		   System.out.println("element is displayed");
	   }
	   else
	   {
		   System.out.println("element is not displayed");
	   }
		   
		
	}

}
