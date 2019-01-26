package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Search extends PageBase {

	public Search(WebDriver d) {
		super(d);
	}
	@FindBy(id="small-searchterms")
	WebElement searchtxt ;
	@FindBy(linkText="Apple MacBook Pro 13-inch")
	public WebElement producttitle ;
	@FindBy(id="ui-id-1")
	public List<WebElement> searchlist;
	@FindBy(css="input.button-1.search-box-button")
	WebElement searchbtn;
	
	public void search(String stxt)
	{
		sendkeytxt(searchtxt, stxt);
		clickbtn(searchbtn);
	}
	public void product()
	{
		clickbtn(producttitle);
	}
	public void searchauto(String autxt) throws InterruptedException
	{
		sendkeytxt(searchtxt, autxt);
		//Thread.sleep(1000);
		try {
			d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		searchlist.get(0).click();
		
		
	}
	

}
