package pageObejectmanager;

import org.openqa.selenium.WebDriver;

import fb.com.BaseClass.Baseclass;
import fb.com.locators.MynLogin;

public class PageObjectManagerm extends Baseclass{
	
	public PageObjectManagerm(WebDriver xdriver) {
		this.driver=xdriver;
		}
	
	private  MynLogin mainpage;

	public MynLogin getMainpage() {
		if(mainpage==null) {
			mainpage=new MynLogin(driver);
		}
		return mainpage;
	}

}
