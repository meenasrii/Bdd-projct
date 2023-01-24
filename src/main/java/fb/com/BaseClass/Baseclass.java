package fb.com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Baseclass {
	public static WebDriver driver;

	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\BDD_Demo\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("edgedriver.chrome.driver", "");
			driver = new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		windowMax();
	}

	public static void windowMax() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
			System.out.println(displayed);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return displayed;
	}
	
	public static void elementSendkeys(WebElement element, String value) {
		
		try {
			WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
			wb.until(ExpectedConditions.visibilityOfAllElements(element));
			
if(isDisplayed(element)&&(elementIsEnabled(element))){
				elementClear(element);
				element.sendKeys(value);
			}else {
				System.err.println("Unable to pass Sendkeys");//err define print msg in red color
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to pass the value :"+e.getMessage());
			}
		}

	
	public static void elementClear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static boolean elementIsEnabled(WebElement element) {
		boolean enabled = false;
		try {
			
			enabled = element.isEnabled();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enabled;
		
	}
	
	public static void elementClick(WebElement element) {
		try {
			WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
			wb.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
		System.out.println("unable to click element:"+e.getMessage());
			
		}
	}
	
	



}

