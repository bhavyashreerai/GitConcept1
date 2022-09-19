package SeleniumProgm;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensionconcept {

	public static void main(String[] args)
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElements/IsChecked.html");
		
		Dimension d = new Dimension(100,200);
		driver.manage().window().setSize(d);

	}

}
