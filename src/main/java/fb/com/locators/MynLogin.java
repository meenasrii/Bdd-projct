package fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.BaseClass.Baseclass;

public class MynLogin extends Baseclass{

	public MynLogin(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}	
		
		@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
		private WebElement mlogo;

		public WebElement getMlogo() {
			return mlogo;
		}
		
		
		
	
	
	
}
