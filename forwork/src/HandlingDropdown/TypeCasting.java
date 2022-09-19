package HandlingDropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TypeCasting {

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
		
		
		//converting from one class into other class type(ArrayList to TreeSet type)
		ArrayList<String> l1 = new ArrayList<String>();
		TreeSet<String>  t1= new TreeSet<String>(l1);
		
		for(WebElement e:opt)
		{
			String text = e.getText();
			t1.add(text);
		}
		//Collections.sort(t1);//it is not required becoz Treeset is by itself autosorted
		for(String st:t1)
		{
			System.out.println(st);
		}
//-----------------------------------------------------------------------
		System.out.println("\n");
		System.out.println("---------------------------------------");
		//converting from (TreeSet to ArrayList type)
		TreeSet<String>  t2= new TreeSet<String>();
		ArrayList<String> l2 = new ArrayList<String>(t2);
		
		for(WebElement e:opt)
		{
			String text1 = e.getText();
			l2.add(text1);
		}
		Collections.sort(l2);//it is required becoz ArrayList is not autosorted
		for(String st2:l2)
		{
			System.out.println(st2);
		}

	}

}
