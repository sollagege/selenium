package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAutocomplete extends PageBase{

	public SearchAutocomplete(WebDriver d) {
		super(d);
	}
	@FindBy(id="ui-id-3")
	public List<WebElement> searchlist;

}
