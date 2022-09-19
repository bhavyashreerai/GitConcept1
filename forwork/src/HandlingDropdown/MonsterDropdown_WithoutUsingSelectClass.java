package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterDropdown_WithoutUsingSelectClass {

	public static void main(String[] args) throws InterruptedException
	{
		
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://hiring.monster.com/SignIn.aspx?redirect=https%3a%2f%2fhiring.monster.com%2fdefault.aspx%3fHasUserAccount%3d2&reloadCA=0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@title='Country']/option[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title='Country']/option[.='Angola']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title='Country']/option[4]")).click();

	}
}
