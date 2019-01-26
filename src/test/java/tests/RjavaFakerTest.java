package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.Home;
import pages.Login;
import pages.Register;

public class RjavaFakerTest extends TestBase {
	Home H;
	Register R;
	Login L;
	Faker fa = new Faker();
	String f =fa.name().firstName();
	String l= fa.name().lastName();
	String e =fa.internet().emailAddress();
	String p =fa.number().digits(8).toString();

	@Test(priority=1,alwaysRun=true)
	public void regsucess() throws IOException
	{
		
			H=new Home(d);
			H.openRegister();
			R=new Register(d);
			R.usereg(f,l,e,p);
			Assert.assertTrue(R.sucessmsg.getText().contains("Your registration completed"));
			R.logout();
			H.OpenLogin();
			L = new Login(d);
			L.Loginwith(e, p);
			Assert.assertTrue(R.log_out.getText().contains("Log out"));
			R.logout();
		}
	}



