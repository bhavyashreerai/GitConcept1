package HandlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Popup {

	public static void main(String[] args) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value="./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Amith%20Shetty/OneDrive/Desktop/Selenium_Manual%20assignments/FilePopups.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("upload file"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\Amith Shetty\\OneDrive\\Desktop\\Personal data\\Bhavya shree_resume.docx");
		//Shift+rightclick-copy as path
		//ele.sendKeys("C:\\Users\\Amith Shetty\\OneDrive\\Desktop\\New Text Document (2).txt");
	}

}
