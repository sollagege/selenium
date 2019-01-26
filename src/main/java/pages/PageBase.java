package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	 protected WebDriver d;
	 public JavascriptExecutor jse;
	 
		public PageBase(WebDriver d)
		{
			PageFactory.initElements(d, this);
		}

		protected static void clickbtn(WebElement btn)
		{
			btn.click();
		}
		protected static void sendkeytxt(WebElement txt,String v)
		
		{
			txt.sendKeys(v);
		}
		public void scrolltobottom()
		{
			jse.executeScript("scrollBy(0,2500)");
		}
}
