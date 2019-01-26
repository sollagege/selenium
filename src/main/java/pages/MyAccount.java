package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase {

	public MyAccount(WebDriver d) {
		super(d);
	}

	@FindBy(id="FirstName")
	WebElement FN;
	@FindBy(id="LastName")
	WebElement LN;
	@FindBy(id="Email")
	WebElement E;
	@FindBy(id="save-info-button")
	public WebElement savebtn;
	
	/////////////////////////////////////////////
	@FindBy(linkText="Change password")
	public WebElement CP;
	
	@FindBy(id="OldPassword")
	WebElement OP;
	
	@FindBy(id="NewPassword")
	WebElement NP;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement CNP;
	
	@FindBy(css="input.button-1.change-password-button")
	public WebElement IP;
	
	@FindBy(css="div.result")
	public WebElement DR;
	
	/////////////////////////////////////////////////////
	
	public void Accountwith(String first ,String last ,String email) 
	{
		sendkeytxt(FN, first);
		sendkeytxt(LN, last);
		sendkeytxt(E, email);
		clickbtn(savebtn);
		
	}
	
	public void Openchangepassword()
	{
		clickbtn(CP);
	}
	
	public void changepassword(String oldp, String newp)
	{
		sendkeytxt(OP, oldp);
		sendkeytxt(NP, newp);
		sendkeytxt(CNP, newp);
		clickbtn(IP);
		
	}
	
}
