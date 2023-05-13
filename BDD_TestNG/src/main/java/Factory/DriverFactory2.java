package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory2 {

	public static WebDriver driver;
	public static ThreadLocal<WebDriver>tlDriver = new ThreadLocal<>();
	
	/**
	 * This method is used to initialized the Webdriver
	 * on the basis of browser type 
	 * @param Browser
	 * @return
	 */
	public WebDriver inItDriver(String Browser) {
		System.out.println("initializing the browser: "+Browser);
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Plz provide valid Browser name: "+Browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		return getDriver();
	} 
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}