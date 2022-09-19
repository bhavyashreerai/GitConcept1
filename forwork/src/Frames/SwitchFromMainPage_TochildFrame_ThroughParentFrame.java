package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFromMainPage_TochildFrame_ThroughParentFrame {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate from main page to parent frame
		driver.get("https://demoqa.com/nestedframes");
		//Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		WebElement frame1text = driver.findElement(By.xpath("//body[.='Parent frame']"));
		System.out.println("fram1 text is:"+frame1text.getText());
		
		//navigate from parent to child frame
		driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe[@srcdoc='<p>Child Iframe</p>']");
		WebElement frame2text = driver.findElement(By.xpath("//p[.='Child Iframe']"));
		System.out.println("fram2 text is:"+frame2text.getText());
		
		//navigate from child frame to main page
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
	}
}
