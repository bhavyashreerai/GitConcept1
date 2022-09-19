package HandlingDropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_NumberOfOptions_And_TextOfAllOptions_InDropdown {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/WebElement/SelectMultipleOptions_DeselectAllOptions.html");
		WebElement ele = driver.findElement(By.id("Empire"));
		
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		int count = opt.size();
		System.out.println(count);
		
//		for(WebElement e1:opt)
//		{
//			String text = e1.getText();
//			System.out.println(text);
//		}
//		
		for(int i=0;i<count;i++)
		{
			WebElement e = opt.get(i);
			//System.out.println(e);
		    String text=  e.getText();
		    System.out.println(text);
		        
		}
			
	}

}
