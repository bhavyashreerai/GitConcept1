package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChild_And_SpecificChildBrowsers {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		 
		Set<String> addr = driver.getWindowHandles();
		int count = addr.size();
		System.out.println(count);
//		//to close only child browsers
//		addr.remove(pid);
//		for(String s:addr)
//		{
//			driver.switchTo().window(s);
//			System.out.println(s);
//			driver.close();
//		}
		
		//to close specific child browsers
		
		for(String s:addr)
		{
			driver.switchTo().window(s);
			System.out.println(s);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("About me - qavalidation"))
			{
				driver.close();
			}
			
		}
	
		

	}

}
