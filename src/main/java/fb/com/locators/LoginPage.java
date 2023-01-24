package fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.BaseClass.Baseclass;

public class LoginPage extends Baseclass {
	
	public LoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='Facebook']")
	private WebElement fbLogo;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	public WebElement loginButton;

	public WebElement getFbLogo() {
		return fbLogo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	

}
