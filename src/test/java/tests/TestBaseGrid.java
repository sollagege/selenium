package tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import helper.HelpScreenShot;

public class TestBaseGrid {
	
	public static String s = "http://demo.nopcommerce.com/";
	protected ThreadLocal<RemoteWebDriver> driverv = null;
	@BeforeClass
	@Parameters(value= {"browser"})
	public void setup(@Optional("chrome") String browser) throws MalformedURLException
	{
		driverv = new ThreadLocal<>();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", browser);
		driverv.set(new RemoteWebDriver( new URL("http://localhost:4445/wb/hub"),cap));
	}
	 public WebDriver getDriver()
	 {
		 return driverv.get();
	 }
	@AfterClass
	public void stopDriver()
	{
		getDriver().quit();
		driverv.remove();
	}
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			HelpScreenShot.captureScreenshot(getDriver(), result.getName());
		}
	}

}
