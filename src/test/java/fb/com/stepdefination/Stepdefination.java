package fb.com.stepdefination;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import fb.com.BaseClass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObejectmanager.PageObjectManager;


public class Stepdefination extends Baseclass {
	
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	browserLaunch("chrome");
		
	    
	}
	@Given("User Navigate Url")
	public void user_navigate_url() {
		getUrl("https://www.facebook.com/");
	   
	}
	@Given("User Verify page land on LoginPage")
	public void user_verify_page_land_on_login_page() {
	    Assert.assertTrue(isDisplayed(obj.getL().getFbLogo()));
	}
	
	@Given("User Enter Valid Username")
	public void user_enter_valid_username() {
		elementSendkeys(obj.getL().getUsername(), "meena");
		
	}
	@Given("User Enter Valid Password")
	public void user_enter_valid_password() {
		elementSendkeys(obj.getL().getPassword(), "sri@1234");
	  
	   
	}
	
	@Given("User Click Login Button")
	public void user_click_login_button() {
		elementClick(obj.getL().getLoginButton());
	
	
	   
	   
	}
	@Then("User Verify Loged in Successfull")
	public void user_verify_loged_in_successfull() {
	    
	   
	}
	
	
	@Given("user Website url")
	public void user_website_url() {
		getUrl("http://adactinhotelapp.com/");
	    
	}
	@Given("User Verify login page landed")
	public void user_verify_login_page_landed() {
		Assert.assertTrue(isDisplayed(obj.getAlogin().getAlogo()));
	    
	}
	@Given("User Enter UserName {string}")
	public void user_enter_user_name(String string) {
		elementSendkeys(obj.getAlogin().getUname(), string);
	    
	}
	@Given("User Enter passWord {string}")
	public void user_enter_pass_word(String string) {
		elementSendkeys(obj.getAlogin().getPwd(), string);
	    
	}
	
	@Then("User Click login button")
	public void user_click_login_buttons() {
		elementClick(obj.getAlogin().getLoginbutn());
	   
	}

	@Then("User Verify Error Message {string}")
	public void user_verify_error_message(String string) {
		Assert.assertTrue(obj.getAlogin().getErrtext().getText().startsWith(string));
	    
	}




}
