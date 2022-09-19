package SeleniumProgm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch 
{
	public static void main(String[] args)
	{
				String key= "webdriver.gecko.driver";
				String value="./Softwa/geckodriver.exe";
				
				System.setProperty(key, value);
				
				FirefoxDriver driver = new FirefoxDriver();
				
	}

}
