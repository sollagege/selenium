package tests;

import org.testng.annotations.Test;

import pages.Home;

public class EmailTest extends TestBase {
	String o = "Your message has been sent.";
	String y="Ali@Al.com";
	String z="ggf dfgdf dfg";
	Home H;
	/*
	 * 
	 * 
	 * 
	 */
	@Test
	public void Emailconfirm()
	{
		H = new Home(d);
		H.OpenContact();
		
	}

}
