package Testngconcepts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript extends Generic_Test1 
{

	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("bhavyashree198@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavya@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "(20+) Facebook");
		//Assert.assertTrue(title.contains("Facebook"));
		
		System.out.println(1);
	}
	
//	@Test
//	public void validLogin1() throws InterruptedException
//	{
//		driver.findElement(By.id("email")).sendKeys("bhavyashree198@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Bhavya@123");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertTrue(title.contains("20+"));
//		System.out.println("2");
//		
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(title, "(20+) Facebook");
//		System.out.println("3");
//		sa.assertAll();
//	}


}
