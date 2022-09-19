package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_dropdown {

	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://hiring.monster.com/SignIn.aspx?redirect=https%3a%2f%2fhiring.monster.com%2fdefault.aspx%3fHasUserAccount%3d2&reloadCA=0");
		WebElement ele = driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_accountInformation_ddlCountry"));
		
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		int count = opt.size();
		System.out.println(count);
		
		for(WebElement e1:opt)
		{
			String text = e1.getText();
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("//select[@title='Country']/option[@value='2']")).click();
		driver.findElement(By.xpath("//select[@title='Country']/option[.='Angola']")).click();
		driver.findElement(By.xpath("//select[@title='Country']/option[4]")).click();

	}

}
