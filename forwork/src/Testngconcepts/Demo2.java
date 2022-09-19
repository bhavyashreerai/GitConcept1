package Testngconcepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{

	@Test
	public void test3()
	{
		Reporter.log("3",true);
		Assert.fail();
	}
}
