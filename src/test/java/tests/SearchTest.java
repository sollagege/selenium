package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetails;
import pages.Search;

public class SearchTest extends TestBase {
	
	String productname = "Apple MacBook Pro 13-inch";
	Search s;
	ProductDetails PD;
	
	
	@Test
	public void search()
	{
		s = new Search(d);
		s.search(productname);
		s.product();
		PD = new  ProductDetails(d);
		//Assert.assertTrue(PD.AppleMacBook.getText().contains(productname));
		Assert.assertEquals(PD.AppleMacBook.getText(),productname);
	}
	
}
