package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetails;
import pages.Search;

public class SearchAutocompleteTest extends TestBase {
	String productname ="Apple MacBook Pro 13-inch";
	Search s;
	ProductDetails PD;
	
	@Test 
	public void searchautocomplete() throws InterruptedException
	{
		s = new Search(d);
		s.searchauto(productname);
		PD = new ProductDetails(d);
		Assert.assertTrue(PD.AppleMacBook.getText().contains(productname));
		
	}

}
