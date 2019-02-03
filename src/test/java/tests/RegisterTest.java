package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.Register;

public class RegisterTest extends TestBase {
	Home H;
	Register R;
	Login L;
	
	
	@Test(priority=1,alwaysRun=true)
	public void regsucess()
	{
		H=new Home(d);
		H.openRegister();
		R=new Register(d);
		R.usereg("sara", "g", "sarah8@hotmail.com", "12345678");
		Assert.assertTrue(R.sucessmsg.getText().contains("Your registration completed"));	
	}
	
	
	@Test(dependsOnMethods= {"regsucess"})
	public void logout()
	{
		R.logout();
	}
	
	@Test(dependsOnMethods= {"logout"})
	public void login() 
	{
		H.OpenLogin();
		L = new Login(d);
		L.Loginwith("sarah8@hotmail.com", "12345678");
		Assert.assertTrue(R.log_out.getText().contains("Log out"));
	}

}
