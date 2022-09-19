package PomTestprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomConcepts.Pom1;
import Testngconcepts.Generic_Test1;

public class Facebook_Using_Pom extends Generic_Test1 
{

	@Test
	public void validLogin()
	{
//		String key="webdriver.chrome.driver";
//		String value="./Softwa/chromedriver.exe";
//		System.setProperty(key,value);
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		
		Pom1 p1= new Pom1(driver);
		p1.userName("bhavyashree198@gmail.com");
		p1.passwordTextbox("Bhavya@123");
		p1.clickLogin();
	}
	
}
