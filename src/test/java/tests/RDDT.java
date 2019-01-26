package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.Register;

public class RDDT extends TestBase{
	Home H;
	Register R;
	Login L;
	
	@DataProvider(name="testdata")
	public static Object[][] userdata()
	{
		
		return new Object[][]
				{
			{"sara", "ghareb", "srh8@hotmail.com", "2345678"},
			{"sa", "gh", "o@hotmail.com", "01234567"}
				};
				
		
	}
	
	
	@Test(priority=1,alwaysRun=true,dataProvider="testdata")
	public void regsucess(String fn,String se,String em,String pa)
	{
		H=new Home(d);
		H.openRegister();
		R=new Register(d);
		R.usereg(fn, se, em, pa);
		Assert.assertTrue(R.sucessmsg.getText().contains("Your registration completed"));
		R.logout();
		H.OpenLogin();
		L = new Login(d);
		L.Loginwith(em, pa);
		Assert.assertTrue(R.log_out.getText().contains("Log out"));
		R.logout();
	}
}
