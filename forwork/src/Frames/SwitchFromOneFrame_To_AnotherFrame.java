package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFromOneFrame_To_AnotherFrame {

	//
	public static void main(String[] args) 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		WebElement Firstframe = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		System.out.println(Firstframe.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement secframe = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		System.out.println(secframe.getText());
		driver.switchTo().defaultContent();
		driver.close();
	}

}
