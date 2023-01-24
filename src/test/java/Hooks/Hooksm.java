package Hooks;

import org.junit.After;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.BaseClass.Baseclass;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooksm extends Baseclass {

	@Before
	
	private void beforeHooks() {
System.out.println("Am before hooks");
	}
	
	@After
	
	private void afterHooks(Scenario scenario) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs,"image/png","screenshot");
		System.out.println("Am after hooks");
		driver.quit();
		
		

	}
}
