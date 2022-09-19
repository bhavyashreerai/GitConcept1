package train;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./Softwa/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	}
}
