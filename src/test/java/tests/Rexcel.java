package tests;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import data.ExcelReader;
import pages.Home;
import pages.Login;
import pages.Register;

public class Rexcel extends TestBase {
	Home H;
	Register R;
	Login L;
	
	@DataProvider(name="Book")
	public Object[][] u() throws IOException
	{
		ExcelReader re =new ExcelReader();
			return re.getdata();	
	}
	
	@Test(priority=1,alwaysRun=true,dataProvider="Book")
	public void regsucess(String f, String l, String e, String p)
	{
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
		R.logout();
	}


}
