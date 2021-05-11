package upload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUploadingClass {
	WebDriver driver;

	@Test
	public void fileUpload() {
		WebElement filePath = driver.findElement(By.id("uploadfile_0"));
		filePath.sendKeys("C:\\Users\\devid\\OneDrive\\Documents\\FileUpload.txt");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		
		WebElement submit =  driver.findElement(By.name("send"));
		submit.click();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "http://demo.guru99.com/test/upload/";

		System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();    
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
