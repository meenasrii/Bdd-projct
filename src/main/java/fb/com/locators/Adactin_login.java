package fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.BaseClass.Baseclass;

public class Adactin_login extends Baseclass {
	public Adactin_login(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//img[@class='logo']" )
	private WebElement Alogo;
	
	
	@FindBy(id="username")
	private WebElement Uname;
	
	public WebElement getAlogo() {
		return Alogo;
	}

	public WebElement getUname() {
		return Uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbutn() {
		return loginbutn;
	}

	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement loginbutn;
	
	@FindBy(xpath="//b[contains(text(),' Your Password might have expired.')]" )
	private WebElement errtext;

	public WebElement getErrtext() {
		return errtext;
	}

}
