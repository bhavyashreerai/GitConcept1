package SeleniumProgm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.gecko.driver";
		String value="./Softwa/geckodriver.exe";
		
		System.setProperty(key, value);
		
		FirefoxDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
