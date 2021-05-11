package parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ChromeClass {
	WebDriver driver;

	@Test
	public void chromeMethod() {
		System.out.println("Chrome Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
