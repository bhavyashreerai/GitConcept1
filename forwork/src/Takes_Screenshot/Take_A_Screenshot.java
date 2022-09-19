package Takes_Screenshot;

import java.io.File;
import java.util.Date;

import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_A_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value= "./Softwa/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Amith Shetty\\OneDrive\\Desktop\\Photos\\pict.jpeg");
		Thread.sleep(2000);
		FileUtils.copyFile(src,dest);
		
		Date d= new Date();
		System.out.println(d.toString());
		 
	}

}
