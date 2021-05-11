package dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropdownClass {
	WebDriver driver; // global
	

	@Test
	public void f() {
		WebElement name = driver.findElement(By.name("firstName"));
		name.sendKeys("Sachin");
		
		WebElement countryname = driver.findElement(By.name("country"));
		
		Select country = new Select(countryname);
		//country.selectByVisibleText("INDIA");
		//country.selectByIndex(4);
		country.selectByValue("ARUBA");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "http://demo.guru99.com/test/newtours/register.php";   // locally
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
