package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.Home;
import pages.Login;
import pages.Register;

public class Rcsvtest extends TestBase {
	Home H;
	Register R;
	Login L;
	CSVReader re;	

	@Test(priority=1,alwaysRun=true)
	public void regsucess() throws IOException
	{
		String file_csv = System.getProperty("user.dir")+"/src/test/java/data/Bookcsv.csv";
		re = new CSVReader(new FileReader(file_csv));
		String[] cell ;
		while ((cell = re.readNext()) != null) 
		{
			String f = cell[0]; 
			String l = cell[1];
			String e = cell[2];
			String p = cell[3];
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

}
