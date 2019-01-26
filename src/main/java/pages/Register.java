package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends PageBase {
	
	
	public Register(WebDriver d)
	{
		super(d);
	}

	@FindBy(id="gender-male")WebElement geRadio;
	@FindBy(id="FirstName")WebElement F;
	@FindBy(id="LastName")WebElement l;
	@FindBy(id="Email")WebElement E;
	@FindBy(id="Password")WebElement P;
	@FindBy(id="ConfirmPassword")WebElement CP;
	@FindBy(id="register-button")WebElement Rbtn;
	@FindBy(css="div.result")public WebElement sucessmsg;
	@FindBy(linkText="Log out")public WebElement log_out;
	
	 public void usereg(String Fu ,String Lu,String Eu,String Pu)
	 {
		 clickbtn(geRadio);
		 sendkeytxt(F, Fu);
		 sendkeytxt(l, Lu);
		 sendkeytxt(E, Eu);
		 sendkeytxt(P, Pu);
		 sendkeytxt(CP, Pu);
		 clickbtn(Rbtn);
		 
	 }
	 
	 public void logout()
	 {
		 clickbtn(log_out);
	 }
	
}
