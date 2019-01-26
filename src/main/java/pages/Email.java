package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Email extends PageBase{

	public Email(WebDriver d) {
		super(d);
	
	}
	@FindBy(id="FriendEmail")
	WebElement fname;
	@FindBy(id="YourEmailAddress")
	WebElement email;
	@FindBy(id="PersonalMessage")
	WebElement c;
	@FindBy(css="input.button-1.send-email-a-friend-button")
	WebElement sbtn;
	@FindBy(css="div.result")
	public WebElement okmsg;
	
	public void contact(String F,String E)
	{
		sendkeytxt(fname, F);
		sendkeytxt(c, E);
		clickbtn(sbtn);
	}
	

}
