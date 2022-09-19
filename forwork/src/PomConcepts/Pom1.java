package PomConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
	@FindBy(id="email")
	private WebElement usernam;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void userName(String un)
	{
		usernam.sendKeys(un);
	}
	
	public void passwordTextbox(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	
}
