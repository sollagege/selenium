package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase {

	public Login(WebDriver d) {
		super(d);
		
	}
	
	@FindBy(id="Email")
	WebElement Emailtxt;
	@FindBy(id="Password")
	WebElement Passwordtxt;
	@FindBy(css="input.button-1.login-button")
	public WebElement loginbtn;
	
	
	public void Loginwith(String email, String password)
	{
		sendkeytxt(Emailtxt, email);
		sendkeytxt(Passwordtxt, password);
		clickbtn(loginbtn);
	}

}
