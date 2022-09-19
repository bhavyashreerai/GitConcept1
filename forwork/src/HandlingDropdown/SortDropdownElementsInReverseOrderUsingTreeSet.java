package HandlingDropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortDropdownElementsInReverseOrderUsingTreeSet {

	public static void main(String[] args)
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		
		TreeSet<String> t1 = new TreeSet<String>(Collections.reverseOrder());
		
		for(WebElement e:opt)
		{
			String text = e.getText();
			t1.add(text);
		}
		
		for(String st:t1)
		{
			System.out.println(st);
		}

	}

}
