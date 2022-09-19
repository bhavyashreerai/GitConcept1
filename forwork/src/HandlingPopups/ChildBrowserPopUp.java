package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		//fetch the id of parent browser
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		//fetch the count of browsers and id of all browsers
		Set<String> addr = driver.getWindowHandles();
		int count = addr.size();
		System.out.println(count);
		
		for(String s:addr)
		{
			System.out.println(s);
		}

   }
}
