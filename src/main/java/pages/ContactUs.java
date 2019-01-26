package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageBase {

	public ContactUs(WebDriver d) {
		super(d);
		
	}
	@FindBy(id="FullName")
	WebElement fname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Enquiry")
	WebElement enq;
	@FindBy(css="input.button-1.contact-us-button")
	WebElement sbtn;
	@FindBy(css="div.result")
	public WebElement okmsg;
	
	public void contact(String F,String E, String En)
	{
		sendkeytxt(fname, F);
		sendkeytxt(email, E);
		sendkeytxt(enq, En);
		clickbtn(sbtn);
	}
	
	
	
	
	
}
