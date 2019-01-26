package tests;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import data.JsonReader;
import pages.Home;
import pages.Login;
import pages.Register;
import org.json.simple.parser.ParseException;


public class RJsonTest extends TestBase {
	Home H;
	Register R;
	Login L;
		

	@Test(priority=1,alwaysRun=true)
	public void regsucess() throws IOException , ParseException
	{
		JsonReader re = new JsonReader();
		re.parsing();
			H=new Home(d);
			H.openRegister();
			R=new Register(d);
			R.usereg(re.f,re.l,re.e,re.p);
			Assert.assertTrue(R.sucessmsg.getText().contains("Your registration completed"));
			R.logout();
			H.OpenLogin();
			L = new Login(d);
			L.Loginwith(re.e, re.p);
			Assert.assertTrue(R.log_out.getText().contains("Log out"));
			R.logout();
		}
	}


