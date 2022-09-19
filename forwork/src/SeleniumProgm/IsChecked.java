package SeleniumProgm;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsChecked {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElements/IsChecked.html");
		
		Dimension d =new Dimension(200,300);
		
		driver.manage().window().setSize(d);
		WebElement ele = driver.findElement(By.id("a1"));
		boolean b = ele.isSelected();
		if(b)
		{
			System.out.println("element is checked");
		}
		else
			System.out.println("element is not checked");
	}

}
