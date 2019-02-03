
package Steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;
import pages.Register;
import tests.TestBase;

public class usersteps extends TestBase {
	Home h ;
	Register r;
	
	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() throws Throwable {
		h = new Home(d);
		h.openRegister();
	   
	}

	@When("^i click on register link$")
	public void i_click_on_register_link() throws Throwable {
	   Assert.assertTrue(d.getCurrentUrl().contains("register"));
	}
	
	@When("^i entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 r = new Register(d);
		 r.usereg(firstname, lastname, email, password);
	    
	}


	@Then("^the register page displayed successfully$")
	public void the_register_page_displayed_successfully() throws Throwable {
		r = new Register(d);
		r.logout();
	}

}

