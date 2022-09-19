package HandlingPopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Title_of_All_Browsers {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.name("NewTab")).click();
		}
		
		String pid = driver.getWindowHandle();
		
		Set<String> brow = driver.getWindowHandles();
		int count = brow.size();
		
		
//		brow.remove(pid);//remove parent browser address
//		
//		for(String s:brow)
//		{
//			driver.switchTo().window(s);
//			String title = driver.getTitle();
//			System.out.println(title);
//			Thread.sleep(2000);
//			driver.close();
//			//closing only parent browsers
//			if(pid.equals(s))
//			{
//				driver.close();
//			}
//		}
		
		ArrayList<String> l1= new ArrayList<String>(brow);
		
		for(int i=0;i<count;i++)
		{
			String s = l1.get(i);
			driver.switchTo().window(s);
			String title = driver.getTitle();
			Thread.sleep(2000);
			System.out.println(title);
			
			if(i==1||i==count-1)
			{
			driver.close();
			}
		}
		
	}

}
