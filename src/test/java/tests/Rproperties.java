package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.ConvertData;
import pages.Home;
import pages.Login;
import pages.Register;

public class Rproperties extends TestBase{
	Home H;
	Register R;
	Login L;
	String f=ConvertData.Data.getProperty("first");
	String l=ConvertData.Data.getProperty("last");
	String e=ConvertData.Data.getProperty("email");
	String p=ConvertData.Data.getProperty("password");
	
	
	@Test(priority=1,alwaysRun=true)
	public void regsucess()
	{
		System.out.println(ConvertData.Data);
		H=new Home(d);
		H.openRegister();
		R=new Register(d);
		R.usereg(f, l, e, p);
		Assert.assertTrue(R.sucessmsg.getText().contains("Your registration completed"));
		R.logout();
		H.OpenLogin();
		L = new Login(d);
		L.Loginwith(e, p);
		Assert.assertTrue(R.log_out.getText().contains("Log out"));
	}

}
