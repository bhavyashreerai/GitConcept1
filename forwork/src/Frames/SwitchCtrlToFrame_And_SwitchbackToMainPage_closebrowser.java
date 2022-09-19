package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCtrlToFrame_And_SwitchbackToMainPage_closebrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(2000);
		
		//click on iFrame major tab
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(2000);
		
		//inspecting frame element
		WebElement frame1= driver.findElement(By.xpath("//iframe[@class=' lazyloaded']"));
		Thread.sleep(2000);
		
		//ctrl will be in main page, hence switching ctrl to frame1
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		driver.findElement(By.name("s")).sendKeys("Selenium");
		
		//navigating from fame page to main page
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='aswift_2']"));
//		Thread.sleep(2000);
//		
//		driver.switchTo().frame(frame2);
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='ns-qg5s3-e-11 long-title']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
