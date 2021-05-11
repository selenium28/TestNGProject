package parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirefoxClass {
	WebDriver driver;

	@Test
	public void firefoxMethod() {
		System.out.println("Firefox Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
