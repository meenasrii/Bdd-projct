package Hooks;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.BaseClass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
	@Before
	public void BeforeHooks() {
		System.out.println("Am before hooks");

	}
	@After
	public void AfterHooks(Scenario scenario) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs,"image/png","screenshot");
		System.out.println("Am after hooks");
		driver.quit();//its used to quit the browser after launch

	}

}
