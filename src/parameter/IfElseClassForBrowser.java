package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IfElseClassForBrowser {
	WebDriver driver;
	//String browser = "chrome";

	@Parameters({"browser"})
	@Test
	public void browserDemo(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
			driver= new ChromeDriver();
		} else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
	}
}
