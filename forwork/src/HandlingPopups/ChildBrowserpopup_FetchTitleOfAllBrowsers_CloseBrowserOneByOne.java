package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserpopup_FetchTitleOfAllBrowsers_CloseBrowserOneByOne {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//fetch title of all browsers and close browsers one by one
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> addr = driver.getWindowHandles();
		int count = addr.size();
		System.out.println(count);
		
		String pid = driver.getWindowHandle();
		String p_title = driver.getTitle();//initially the control will be in parent page hence it fetches
		//parent page title
		System.out.println(p_title);//not necessary just for an reference

		
		for(String s:addr)
		{
			driver.switchTo().window(s);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println(s);
			if(pid.equals(s))
			{
				driver.close();
			}
//			System.out.println(s);
//				if(p_title.equals(title))
//				{
//					driver.close();
//				}
		}
					
	}

}
