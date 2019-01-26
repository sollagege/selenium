package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUs;
import pages.Home;

public class ContactUsTest extends TestBase {
	Home H;
	ContactUs CU;
	String x="Ali";
	String y="Ali@Al.com";
	String z="ggf dfgdf dfg";
	String q="Your enquiry has been successfully sent to the store owner.";
	
	
	@Test
	public void contact()
	{
		H = new Home(d);
		H.OpenContact();
		CU = new ContactUs(d);
		CU.contact(x, y, z);
		Assert.assertTrue(CU.okmsg.getText().equals(q));
		
		
	}

}
