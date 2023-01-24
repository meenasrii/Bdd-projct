package fb.com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.remote.Browser;

import fb.com.BaseClass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageObejectmanager.PageObjectManagerm;

public class Stepdefinationm extends Baseclass{
	
	PageObjectManagerm objj= new PageObjectManagerm(driver);
	
	@Given("User Giver Browser Lauch")
	public void user_giver_browser_lauch() {
		browserLaunch("chrome");
	   
	}

	@Given("User Navigate Url to page")
	public void user_navigate_url_to_page() {
		getUrl("https://www.myntra.com/\"");
	    
	}

	@Then("Vreify the page land on mainpage")
	public void vreify_the_page_land_on_mainpage() {
		Assert.assertTrue(isDisplayed(objj.getMainpage().getMlogo()));
	   
	}


}
