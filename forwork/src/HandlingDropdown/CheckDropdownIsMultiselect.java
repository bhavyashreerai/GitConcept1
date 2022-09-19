package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownIsMultiselect {

	public static void main(String[] args)
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/SelectMultipleOptions_DeselectAllOptions.html");
		WebElement ele = driver.findElement(By.id("Empire"));
		
		Select s = new Select(ele);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multi select dropdown");
		}
		else
			System.out.println("not a multi select dropdown");
	}

}
