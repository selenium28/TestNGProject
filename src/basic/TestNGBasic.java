package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNGBasic {
	
	String url= "http://demo.guru99.com/test/newtours/register.php";
	WebDriver driver;  // Global or class level
	

	@Test
	public void testcase2() {

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnLogin"))));
		wait.until(ExpectedConditions.titleContains("xyz"));
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		
		
		
		
		
		//ExplicitWait
		
//		WebDriverWait wait =new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(loginbutton));
//		wait.until(ExpectedConditions.titleContains(title));

	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/";   // locally
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//ImplicitlyWait - global wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}

//create new class or new project - library add
//open browser 
// xpath - 
// dropdown
// title and link
// waits apply
//testng

