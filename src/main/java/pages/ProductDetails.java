package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends PageBase {

	public ProductDetails(WebDriver d) {
		super(d);
	}
	
	@FindBy(css="strong.current-item")
	public WebElement AppleMacBook;

}
