package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IfElseBrowser {
	WebDriver driver;
	String browser = "chrome";
  
  @Test
  public void testcase() {
	  	 if (browser.equals("chrome"))	{
	  		System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
			driver= new ChromeDriver(); 
	  	 } else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver(); 
	  	 }
	  	 
	  	 driver.get("https://opensource-demo.orangehrmlive.com/");
	  		  	
		
		
		
  }
}
