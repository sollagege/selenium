package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageBase{

	public Home(WebDriver d) {
		super(d);
		jse = (JavascriptExecutor) d ;
	}
	
	@FindBy(linkText="Register")
	WebElement re;
	
	@FindBy(linkText="Log in")
	WebElement log;
	
	@FindBy(linkText="My account")
	WebElement account;
	
	@FindBy(linkText="Contact us")
	WebElement contact;
	
	public void openRegister()
	{
		clickbtn(re);
	}
	public void OpenLogin()
	{
		clickbtn(log);
	}
	public void OpenAccount()
	{
		clickbtn(account);
	}
	public void OpenContact()
	{
		scrolltobottom();
		clickbtn(contact);
		
	}

}
