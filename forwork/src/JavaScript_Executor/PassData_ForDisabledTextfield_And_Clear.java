package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassData_ForDisabledTextfield_And_Clear {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/PassDataForDisabledTextfield.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t1').value='Selenium'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value=''");
	}

}
