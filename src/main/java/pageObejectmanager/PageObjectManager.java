package pageObejectmanager;

import org.openqa.selenium.WebDriver;

import fb.com.BaseClass.Baseclass;
import fb.com.locators.Adactin_login;
import fb.com.locators.LoginPage;

public class PageObjectManager extends Baseclass {
	public PageObjectManager(WebDriver xdriver ) {
		this.driver =xdriver;
	}
	
	private LoginPage login;
	private Adactin_login alogin;

	public LoginPage getL() {
		if(login==null) {
			login = new LoginPage(driver);
		}
		return login;
	}

	public Adactin_login getAlogin() {
		if(alogin==null) {
			alogin = new Adactin_login(driver);
		}
		return alogin;
	}
	
	
	
	

}
