package Testngconcepts;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test(invocationCount=2,dependsOnMethods="demo")
	public void test1()
	{
		Reporter.log("1",true);
	}
	
	@Test(enabled=true)
	public void demo()
	{
		Reporter.log("2",true);
		Assert.fail();

	}
	

}
