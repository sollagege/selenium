package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.MyAccount;
import pages.Register;


public class AccountTest extends TestBase {
	Home H;
	MyAccount MA;
	Register R;
	RegisterTest RT;
	Login L;
	String Old="12345678";
	String NEW="123456";
	
	@Test(priority=1)
	public void password()
	{
		H= new Home(d);
		H.openRegister();
		RT = new RegisterTest();
		RT.regsucess();
		H.OpenAccount();
		MA = new MyAccount(d);
		Assert.assertTrue(MA.CP.isDisplayed());
		MA.Openchangepassword();
		MA.changepassword(Old,NEW);
		Assert.assertTrue(MA.DR.getText().contains("Password was changed"));
		R = new Register(d);
		R.logout();
		
	}
	@Test(dependsOnMethods= {"password"})
	public void login() 
	{
		H= new Home(d);
		H.OpenLogin();
		L = new Login(d);
		L.Loginwith("sarah7@hotmail.com",NEW);
		Assert.assertTrue(R.log_out.getText().contains("Log out"));
	}
	

}
